package com.pos.smartapi.acl;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/all")
    public String getAllUsers(){
        return "All Users";
    }
    @GetMapping("/details/{userId}")
    public String getUser(){
        return "User Details";
    }
    @PostMapping("/save")
    public String saveUser() {
        return "User Save";
    }
    @PutMapping("/update/{userId}")
    public String updateUser(@PathVariable Long userId){
        return "User Update";
    }
    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return "delete user";
    }
}
