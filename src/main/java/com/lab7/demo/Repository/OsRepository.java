package com.lab7.demo.Repository;

import com.lab7.demo.Models.Os;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OsRepository extends JpaRepository<Os, Integer> {

    List<Os> findAll();

    Os findByName(String name);

}
