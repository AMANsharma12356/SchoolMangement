package com.example.SchoolManagementSystem.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
    data class Student(
        @Id
        val id: String? = "123",
        val name: String,
        val course: String,
        val standard: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
)