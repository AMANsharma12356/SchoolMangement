package com.example.SchoolManagementSystem.service

import com.example.SchoolManagementSystem.model.Student
import com.example.SchoolManagementSystem.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class StudentService(
    @Autowired val studentRepository: StudentRepository
) {

    fun getStudents() : ResponseEntity<List<Student>> {
        val students = studentRepository.findAll()
        return ResponseEntity.ok(students)
    }

}