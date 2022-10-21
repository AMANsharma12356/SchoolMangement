package com.example.SchoolManagementSystem.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(val firstName: String, val lastName: String, @Id val id: Id)