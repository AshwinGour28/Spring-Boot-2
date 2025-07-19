package com.project.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.journalApp.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
    
}
