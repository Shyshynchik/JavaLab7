package com.lab7.demo.Repository;

import com.lab7.demo.Models.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {

    List<Cpu> findAll();

    Cpu findByName(String name);
}
