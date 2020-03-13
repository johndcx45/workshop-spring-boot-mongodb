package com.workshop.mongoworkshop.services;

import com.workshop.mongoworkshop.domain.User;
import com.workshop.mongoworkshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
