package com.example.poaccessingdata.repository;

import com.example.poaccessingdata.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
