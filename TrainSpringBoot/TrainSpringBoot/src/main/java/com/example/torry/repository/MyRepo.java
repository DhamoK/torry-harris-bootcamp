package com.example.torry.repository;

import com.example.torry.model.Train;
import org.springframework.data.repository.CrudRepository;

public interface MyRepo extends CrudRepository<Train,Integer> {
}
