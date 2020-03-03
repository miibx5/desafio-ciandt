/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:36:05
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
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
@Table(name = "mapa")
public class Mapa implements java.io.Serializable
{
    private static final long serialVersionUID = 6217996163200996149L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String origem;

    @Column(nullable = false, length = 150)
    private String destino;

    @Column(precision = 11, scale = 2)
    private BigDecimal distancia;

    public Mapa()
    {
        this(null, null, null);
    }

    public Mapa(final String origem, final String destino, final BigDecimal distancia)
    {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
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

    public BigDecimal getDistancia()
    {
        return distancia;
    }

    public void setDistancia(final BigDecimal distancia)
    {
        this.distancia = distancia;
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
        final Mapa mapa = (Mapa) o;
        return id.equals(mapa.id) &&
                origem.equals(mapa.origem) &&
                destino.equals(mapa.destino) &&
                distancia.equals(mapa.distancia);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, origem, destino, distancia);
    }
}
