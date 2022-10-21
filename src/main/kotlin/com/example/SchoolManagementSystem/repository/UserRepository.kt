package com.example.SchoolManagementSystem.repository

import org.apache.catalina.User
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: MongoRepository<User, Id> {

}