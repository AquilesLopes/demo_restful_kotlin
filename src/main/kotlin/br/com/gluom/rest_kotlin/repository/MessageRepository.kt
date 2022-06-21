package br.com.gluom.rest_kotlin.repository

import br.com.gluom.rest_kotlin.model.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>{

    @Query("select * from messages")
    fun findMessages(): List<Message>

}