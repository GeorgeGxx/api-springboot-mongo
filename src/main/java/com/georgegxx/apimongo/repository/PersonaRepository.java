package com.georgegxx.apimongo.repository;

import com.georgegxx.apimongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {
}
