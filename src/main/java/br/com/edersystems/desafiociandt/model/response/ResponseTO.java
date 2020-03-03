/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:52:56
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.response;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ResponseTO implements java.io.Serializable
{
    private static final long serialVersionUID = -8294574913348086508L;

    private String rota;

    private BigDecimal custo;

    public ResponseTO()
    {
        this(null, null);
    }

    public ResponseTO(final String rota, final BigDecimal custo)
    {
        this.rota = rota;
        this.custo = custo;
    }

    public String getRota()
    {
        return rota;
    }

    public void setRota(final String rota)
    {
        this.rota = rota;
    }

    public BigDecimal getCusto()
    {
        return custo.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setCusto(final BigDecimal custo)
    {
        this.custo = custo;
    }
}
