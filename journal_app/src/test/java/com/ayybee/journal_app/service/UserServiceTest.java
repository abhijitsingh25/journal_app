package com.ayybee.journal_app.service;

import com.ayybee.journal_app.entity.User;
import com.ayybee.journal_app.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testFindByUserName(){
//        assertEquals(4,2+2);
        User user = userRepository.findByUsername("bhai");
        assertTrue(!user.getJournalEntries().isEmpty());
    }
}
