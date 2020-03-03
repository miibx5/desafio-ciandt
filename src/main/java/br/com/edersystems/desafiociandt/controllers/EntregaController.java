/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:25:29
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.controllers;

import br.com.edersystems.desafiociandt.model.request.EntregaRequest;
import br.com.edersystems.desafiociandt.model.service.entrega.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class EntregaController
{
    @Autowired
    private EntregaService service;

    public Response saveEntrega(EntregaRequest request)
    {
        return this.service.saveEntrega(request);
    }
}
