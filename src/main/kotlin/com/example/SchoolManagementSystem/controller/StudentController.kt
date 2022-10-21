package com.example.SchoolManagementSystem.controller

import com.example.SchoolManagementSystem.model.Student
import com.example.SchoolManagementSystem.model.StudentRequest
import com.example.SchoolManagementSystem.repository.StudentRepository
import com.example.SchoolManagementSystem.service.StudentService
import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/students")
class StudentController(
    private val studentsRepository: StudentRepository,
    private val studentService: StudentService
) {

    @GetMapping
    fun getAllStudents(): ResponseEntity<List<Student>> {
        val students = studentService.getStudents()
        return students
    }

    @GetMapping("/{id}")
    fun getOneStudents(@PathVariable("id") id: String): ResponseEntity<Student> {
        val student = studentsRepository.findOneById(ObjectId(id))
        return ResponseEntity.ok(student)
    }

    @PostMapping("/student/add")
    fun createStudent(@RequestBody request: StudentRequest): ResponseEntity<Student> {
        val student = studentsRepository.save(
            Student(
                name = request.name,
                standard = request.standard,
            course = request.course
            )
        )
        return ResponseEntity(student, HttpStatus.CREATED)
    }

    @PutMapping("{id}")
    fun updateStudent(@RequestBody request: StudentRequest, @PathVariable("id") id: String): ResponseEntity<Student> {
        val updateStudent = studentsRepository.save(
            Student(
                id = "123",
                name = request.name,
                standard = request.standard,
                course = request.course,

                createdDate = LocalDateTime.now(),
                modifiedDate = LocalDateTime.now()
            )
        )
        return ResponseEntity.ok(updateStudent)
    }

    @DeleteMapping("{id}")
    fun deleteStudent(@PathVariable("id") id: String): ResponseEntity<Unit> {
        studentsRepository.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}

