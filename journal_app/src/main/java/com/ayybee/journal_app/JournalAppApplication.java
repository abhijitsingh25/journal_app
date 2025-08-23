package com.ayybee.journal_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.MongoDatabaseFactory;

@SpringBootApplication
@EnableTransactionManagement
public class JournalAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(JournalAppApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager example(MongoDatabaseFactory dbFactory){
		return new MongoTransactionManager(dbFactory);
	}
}
