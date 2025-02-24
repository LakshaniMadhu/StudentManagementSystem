package com.example.CRUD_BE_MDB.Repository;

import com.example.CRUD_BE_MDB.Model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Students, Long> {
    // You can define custom query methods here if needed
}
