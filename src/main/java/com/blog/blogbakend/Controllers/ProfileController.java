package com.blog.blogbakend.Controllers;


import com.blog.blogbakend.Repository.userRepository;
import com.blog.blogbakend.Service.currentUser;
import com.blog.blogbakend.modals.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    currentUser currentuser;
    @Autowired
    userRepository userRepository;

    @GetMapping("/get")
    public Users getdata(Principal principal){
        return currentuser.getUserProfile(principal);
    }

    @PutMapping("/update")
    public Users update(@Valid @RequestBody Users users){
        users.setActive(1);
        userRepository.save(users);
        return users;
    }
}
