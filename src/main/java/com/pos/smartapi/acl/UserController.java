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
        return "details user";
    }
    @PutMapping("/update/{userId}")
    public String updateUser(@PathVariable Long userId){
        return "update user";
    }
//    @DeleteMapping("/delete/{userId}")
//    public ResponseEntity<Object> deleteUser(@PathVariable Long userId) {
//        return userService.deleteUser(userId);
//    }
    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return "delete user";
    }
}
