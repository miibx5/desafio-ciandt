/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:58:03
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.service.entrega;

import br.com.edersystems.desafiociandt.model.entities.Entrega;
import br.com.edersystems.desafiociandt.model.entities.Mapa;
import br.com.edersystems.desafiociandt.model.repositories.entrega.EntregaRepository;
import br.com.edersystems.desafiociandt.model.request.EntregaRequest;
import br.com.edersystems.desafiociandt.model.response.ResponseTO;
import br.com.edersystems.desafiociandt.model.service.mapa.MapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EntregaService implements java.io.Serializable
{
    private static final long serialVersionUID = -1538755544796294445L;

    @Autowired
    private MapaService mapaService;

    @Autowired
    private EntregaRepository repository;


    public ResponseEntity<ResponseTO> saveEntrega(EntregaRequest request)
    {
        List<Mapa> mapas = this.mapaService.getAllMapas();

        Mapa origem = this.getMapaOrigem(mapas, request.getOrigem());

        Mapa destino = this.getMapaDestino(mapas, request.getDestino());

        StringBuilder rota = new StringBuilder(origem.getOrigem());
        if (!origem.getOrigem().equalsIgnoreCase(destino.getOrigem()))
        {
            rota.append(" ").append(destino.getOrigem());
        }

        rota.append(" ").append(destino.getDestino());
        BigDecimal custo = origem.getDistancia().add(destino.getDistancia()).multiply(request.getValorLitro()).divide(request.getAutonomia());
        ResponseTO response = new ResponseTO(rota.toString(), custo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private Entrega buildEntrega(EntregaRequest request)
    {
        return new Entrega(request.getOrigem(), request.getDestino(), request.getAutonomia(), request.getValorLitro());
    }

    private Mapa getMapaOrigem(List<Mapa> mapas, String origem)
    {
        return mapas.stream().filter(mp -> mp.getOrigem().equalsIgnoreCase(origem)).min(Comparator.comparing(Mapa::getDistancia)).orElseThrow(NoSuchElementException::new);
    }

    private Mapa getMapaDestino(List<Mapa> mapas, String destino)
    {
        return mapas.stream().filter(mp -> mp.getDestino().equalsIgnoreCase(destino)).min(Comparator.comparing(Mapa::getDistancia)).orElseThrow(NoSuchElementException::new);
    }
}
