package com.ayybee.journal_app.entity;


import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//POJO: plain old java object
@Document(collection = "users")
@Data
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String username;
    @NonNull
    private String password;


    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();

<<<<<<< HEAD
    private List<String> roles;
=======
>>>>>>> 7c7e63cff0042264640a966d526fcfb4767083b4
}
