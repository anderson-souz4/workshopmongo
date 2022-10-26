package com.asouza.workshopmongo.resources;

import com.asouza.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Anderosn", "anderson@gmail.com");
        User alex = new User("", "Maria", "maria@gmail.com");
        List<User> user = new ArrayList<>(Arrays.asList(maria, alex));
        return ResponseEntity.ok(user);
    }
}
