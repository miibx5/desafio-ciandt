/*
 * Project .....................: desafio-ciandt
 * Creation Date ...............: 02/03/20 19:56:57
 * Developer....................: ederluciano
 * Copyright....................: 2020
 * Codification.................: UTF-8
 * ...........................................................
 * Éder L. Costa - © Copyright 2020 - All Rights Reserved
 * ...........................................................
 */
package br.com.edersystems.desafiociandt.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "entregas")
public class Entrega implements java.io.Serializable
{
    private static final long serialVersionUID = 1025894244520061609L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String origem;

    @Column(nullable = false, length = 100)
    private String destino;

    @Column(nullable = false, precision = 11, scale = 2)
    private BigDecimal autonomia;

    @Column(name = "valor_litro", precision = 11, scale = 2)
    private BigDecimal valorLitro;

    public Entrega()
    {
        this(null, null, null, null);
    }

    public Entrega(final String origem, final String destino, final BigDecimal autonomia, final BigDecimal valorLitro)
    {
        this.origem = origem;
        this.destino = destino;
        this.autonomia = autonomia;
        this.valorLitro = valorLitro;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

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

    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        final Entrega entrega = (Entrega) o;
        return id.equals(entrega.id) &&
                origem.equals(entrega.origem) &&
                destino.equals(entrega.destino) &&
                autonomia.equals(entrega.autonomia) &&
                valorLitro.equals(entrega.valorLitro);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, origem, destino, autonomia, valorLitro);
    }
}
