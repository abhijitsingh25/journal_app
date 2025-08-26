package com.ayybee.journal_app.service;

<<<<<<< HEAD
import com.ayybee.journal_app.entity.User;
=======
import com.ayybee.journal_app.entity.JournalEntry;
import com.ayybee.journal_app.entity.User;
import com.ayybee.journal_app.repository.JournalEntryRepository;
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
import com.ayybee.journal_app.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
=======
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
import java.util.List;
import java.util.Optional;

@Slf4j
<<<<<<< HEAD
@Service
=======
@Component
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
public class UserService {

    @Autowired
    private UserRepository userRepository;

<<<<<<< HEAD
    public static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public void saveNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        userRepository.save(user);
    }

    public void saveAdmin(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER","ADMIN"));
        userRepository.save(user);
    }

    public void saveUser(User user){
=======
    public void saveEntry(User user){
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id); // doesn't return anything
    }

    public User findByUserName(String userName){
        return userRepository.findByUsername(userName);
    }

}


