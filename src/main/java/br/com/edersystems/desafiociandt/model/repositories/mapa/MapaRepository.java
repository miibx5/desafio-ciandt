/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:52:05
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.repositories.mapa;

import br.com.edersystems.desafiociandt.model.entities.Mapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapaRepository extends JpaRepository<Mapa, Long>
{
}
