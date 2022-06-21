package br.com.gluom.rest_kotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.annotation.Generated

@Table("messages")
data class Message(
    @Id val id: Int?,
    val text: String)