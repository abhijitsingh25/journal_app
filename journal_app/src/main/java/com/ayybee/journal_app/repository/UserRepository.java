package com.ayybee.journal_app.repository;

import com.ayybee.journal_app.entity.JournalEntry;
import com.ayybee.journal_app.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String userName);
}
