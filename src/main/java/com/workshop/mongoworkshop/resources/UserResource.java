package com.workshop.mongoworkshop.resources;

import com.workshop.mongoworkshop.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User john = new User("1", "John Doe", "john@gmail.com");
        User alex = new User("2", "Alex Green", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(john, alex));
        return ResponseEntity.ok().body(list);
    }
}
