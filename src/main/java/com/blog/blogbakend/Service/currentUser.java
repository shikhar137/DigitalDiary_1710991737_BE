package com.blog.blogbakend.Service;

import com.blog.blogbakend.Repository.userRepository;
import com.blog.blogbakend.modals.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Optional;

@Service
public class currentUser {
    @Autowired
    private com.blog.blogbakend.Repository.userRepository userRepository;

    public Users getUserProfile(Principal principal) {
        Optional<Users> op= userRepository.findByUsername(principal.getName());
        return op.get();
    }




}

