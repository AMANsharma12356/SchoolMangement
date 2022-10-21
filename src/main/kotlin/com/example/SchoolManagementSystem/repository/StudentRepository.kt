package com.example.SchoolManagementSystem.repository

import com.example.SchoolManagementSystem.model.Student
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//interface StudentRepository : MongoRepository<Student, String> {
//    fun findOneById(id: ObjectId): Student
//    override fun deleteAll()

    @Repository
    interface StudentRepository:MongoRepository<Student,String>{
        fun findOneById(id:ObjectId):Student
        override fun deleteAll()
    }
