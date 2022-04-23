package com.lab7.demo.Repository;

import com.lab7.demo.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TabletRepository extends JpaRepository<Tablet, Integer> {

    List<Tablet> findAll();

    List<Tablet> findByBrand(Brand brand);

    List<Tablet> findByOs(Os os);
}
