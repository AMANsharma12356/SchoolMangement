package com.example.SchoolManagementSystem.controller

import com.example.SchoolManagementSystem.service.UserService
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class UserController {

    @Autowired
    private val services: UserService? = null

    @GetMapping("/users")
    fun getAllUsers(): ResponseEntity<List<User?>?>? {
        return ResponseEntity.ok(services?.getUserList())
    }

}