package com.nnh.be.controller;

import com.nnh.be.dto.sdi.UserSelfSDI;
import com.nnh.be.dto.sdo.UserSelfSDO;
import com.nnh.be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/self/{id}")
    public UserSelfSDO self(@PathVariable Long id) {
        return userService.self(id);
    }

    @GetMapping("/get-all")
    public List<UserSelfSDO> getAll() {
        return userService.findAll();
    }
}
