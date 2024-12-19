package com.springtest.controllers;

import com.springtest.models.User;
import com.springtest.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllBooks() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }
}