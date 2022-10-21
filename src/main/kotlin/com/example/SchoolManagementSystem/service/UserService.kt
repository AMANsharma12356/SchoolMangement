package com.example.SchoolManagementSystem.service

import com.example.SchoolManagementSystem.repository.UserRepository
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired val userRepository: UserRepository) {

    fun getUserList(): List<User?>? {
        return userRepository.findAll()
    }

}