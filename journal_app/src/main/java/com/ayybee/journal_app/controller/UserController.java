package com.ayybee.journal_app.controller;

<<<<<<< HEAD
import com.ayybee.journal_app.entity.User;
import com.ayybee.journal_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

=======
import com.ayybee.journal_app.entity.JournalEntry;
import com.ayybee.journal_app.entity.User;
import com.ayybee.journal_app.service.JournalEntryService;
import com.ayybee.journal_app.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

<<<<<<< HEAD



    //has to be authenticated
    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User userInDb =  userService.findByUserName(username);


        userInDb.setUsername(user.getUsername());
        userInDb.setPassword(user.getPassword());
        userService.saveNewUser(userInDb);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<?> greeting(){
        Authentication authentication  = SecurityContextHolder.getContext().getAuthentication();
        return new ResponseEntity<>("Hello " + authentication.getName(),HttpStatus.OK);
    }
=======
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveEntry(user);
    }

    @PutMapping("/{username}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable String username){
        User userInDb =  userService.findByUserName(username);

        if(userInDb != null){
            userInDb.setUsername(user.getUsername());
            userInDb.setPassword(user.getPassword());
            userService.saveEntry(userInDb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
}