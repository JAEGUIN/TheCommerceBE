package com.jaeguin.commerce.controller;

import com.jaeguin.commerce.domain.RegiUserDTO;
import com.jaeguin.commerce.domain.UpdateUserDTO;
import com.jaeguin.commerce.domain.User;
import com.jaeguin.commerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RequestMapping("/api/user")
@RestController
public class UserController {

    private final UserService service;

    @PostMapping("/join")
    public ResponseEntity<?> regiUser(@RequestBody RegiUserDTO dto){
        try {
            service.regiUser(dto);
            return ResponseEntity.created(URI.create("/join/"+dto.getId())).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<Page<User>> getAllUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "desc") String sortDirection,
            @RequestParam(defaultValue = "regiTime or name") String sortBy) {
        Page<User> users = service.findAllUsers(page, pageSize, sortDirection, sortBy);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id, @RequestBody UpdateUserDTO dto){
        try {
            return ResponseEntity.ok(service.updateUser(id, dto));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
