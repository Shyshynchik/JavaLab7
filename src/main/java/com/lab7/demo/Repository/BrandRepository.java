package com.lab7.demo.Repository;

import com.lab7.demo.Models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    List<Brand> findAll();

    Brand findByName(String name);

}
