/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:46:43
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.controllers;

import br.com.edersystems.desafiociandt.model.entities.Mapa;
import br.com.edersystems.desafiociandt.model.request.MapaRequest;
import br.com.edersystems.desafiociandt.model.service.mapa.MapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapaController
{
    @Autowired
    private MapaService service;

    @PostMapping(value = "/logistica/mapa/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mapa> saveMapa(@RequestBody MapaRequest request)
    {
        return service.saveMapa(request);
    }
}
