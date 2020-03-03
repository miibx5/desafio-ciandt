/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:27:40
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.request;

import java.math.BigDecimal;

public class EntregaRequest implements java.io.Serializable
{
    private static final long serialVersionUID = 8955121163848125732L;

    private String origem;

    private String destino;

    private BigDecimal autonomia;

    private BigDecimal valorLitro;

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

    public BigDecimal getAutonomia()
    {
        return autonomia;
    }

    public void setAutonomia(final BigDecimal autonomia)
    {
        this.autonomia = autonomia;
    }

    public BigDecimal getValorLitro()
    {
        return valorLitro;
    }

    public void setValorLitro(final BigDecimal valorLitro)
    {
        this.valorLitro = valorLitro;
    }
}
