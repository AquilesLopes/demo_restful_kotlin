package br.com.gluom.rest_kotlin.service

import br.com.gluom.rest_kotlin.model.Message
import br.com.gluom.rest_kotlin.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}