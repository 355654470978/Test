package com.librarian.Controller;

import com.librarian.Dao.UserRepository;
import com.librarian.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/login")
    public User Find()
    {
        return userRepository.findByName("ylj");
    }
}
