package com.laurentiuspilca.ssia.controllers;

import com.laurentiuspilca.ssia.entities.Otp;
import com.laurentiuspilca.ssia.entities.User;
import com.laurentiuspilca.ssia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public void addUser(@RequestBody User user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping("/user/auth")
    public void auth(@RequestBody User user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping("/otp/check")
    public void check(@RequestBody Otp otp, HttpServletResponse response) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
