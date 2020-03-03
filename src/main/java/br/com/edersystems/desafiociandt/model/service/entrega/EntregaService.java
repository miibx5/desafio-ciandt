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
import br.com.edersystems.desafiociandt.model.repositories.mapa.MapaRepository;
import br.com.edersystems.desafiociandt.model.request.EntregaRequest;
import br.com.edersystems.desafiociandt.model.response.ResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.List;

@Service
public class EntregaService implements java.io.Serializable
{
    private static final long serialVersionUID = -1538755544796294445L;

    @Autowired
    private EntregaRepository repository;

    @Autowired
    private MapaRepository mapaRepository;

    public Response saveEntrega(EntregaRequest request)
    {
        List<Mapa> mapas = this.mapaRepository.findAll();

        Entrega entregaToReturn = this.repository.save(this.buildEntrega(request));
        ResponseTO response = new ResponseTO(entregaToReturn.getDestino(), entregaToReturn.getValorLitro());
        return Response.ok(response).build();
    }

    private Entrega buildEntrega(EntregaRequest request)
    {
        return new Entrega(request.getOrigem(), request.getDestino(), request.getAutonomia(), request.getValorLitro());
    }
}
