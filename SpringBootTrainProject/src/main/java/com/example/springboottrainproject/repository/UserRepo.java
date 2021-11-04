package com.example.springboottrainproject.repository;

import com.example.springboottrainproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
