/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:42:53
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.request;

import java.math.BigDecimal;

public class MapaRequest implements java.io.Serializable
{
    private static final long serialVersionUID = -7001894311640462070L;

    private String origem;

    private String destino;

    private BigDecimal distancia;

    public String getOrigem()
    {
        return origem;
    }

    public void setOrigem(final String origem)
    {
        this.origem = origem;
    }

    public String getDestino()
    {
        return destino;
    }

    public void setDestino(final String destino)
    {
        this.destino = destino;
    }

    public BigDecimal getDistancia()
    {
        return distancia;
    }

    public void setDistancia(final BigDecimal distancia)
    {
        this.distancia = distancia;
    }
}
