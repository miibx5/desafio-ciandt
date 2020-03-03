/*
Project .....................: desafio-ciandt
Creation Date ...............: 02/03/20 20:50:56
Developer....................: ederluciano
Copyright....................: 2020
Codification.................: UTF-8
...........................................................
 Éder L. Costa - © Copyright 2020 - All Rights Reserved
...........................................................
*/
package br.com.edersystems.desafiociandt.model.repositories.entrega;

import br.com.edersystems.desafiociandt.model.entities.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntregaRepository extends JpaRepository<Entrega, Long>
{
}
