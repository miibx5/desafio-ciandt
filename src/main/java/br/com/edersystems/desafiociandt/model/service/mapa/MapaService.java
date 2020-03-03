/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:56:58
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.service.mapa;

import br.com.edersystems.desafiociandt.model.entities.Mapa;
import br.com.edersystems.desafiociandt.model.repositories.mapa.MapaRepository;
import br.com.edersystems.desafiociandt.model.request.MapaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class MapaService implements java.io.Serializable
{
    private static final long serialVersionUID = 257026298347893938L;

    @Autowired
    private MapaRepository repository;

    public ResponseEntity<Mapa> saveMapa(MapaRequest request)
    {
        Mapa mapaToReturn = this.repository.save(this.buildMapa(request));
        return new ResponseEntity<>(mapaToReturn, HttpStatus.OK);
    }

    public ResponseEntity<Collection<Mapa>> getMapas()
    {
        return new ResponseEntity<>(this.getAllMapas(), HttpStatus.OK);
    }

    public List<Mapa> getAllMapas()
    {
        return this.repository.findAll();
    }

    private Mapa buildMapa(MapaRequest request)
    {
        return new Mapa(request.getOrigem(), request.getDestino(), request.getDistancia());
    }


}




