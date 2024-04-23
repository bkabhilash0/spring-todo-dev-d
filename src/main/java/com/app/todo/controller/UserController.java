package com.app.todo.controller;

import com.app.todo.dto.UserDto;
import com.app.todo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        UserDto user = userService.addUser(userDto);
        if(user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(user);

    }

    @GetMapping("login")
    public void login() {
        return ;
    }

}
