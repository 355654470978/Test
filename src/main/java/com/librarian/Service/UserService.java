package com.librarian.Service;

import com.librarian.Dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User FindByName(String name)
    {
        return userRepository.findByName(name);
    }
}
