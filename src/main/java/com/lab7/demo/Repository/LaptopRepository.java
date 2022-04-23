package com.lab7.demo.Repository;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Models.Cpu;
import com.lab7.demo.Models.Laptop;
import com.lab7.demo.Models.VideoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

    List<Laptop> findAll();

    List<Laptop> findByBrand(Brand brand);

    List<Laptop> findByCpu(Cpu cpu);

    List<Laptop> findByVideoCard(VideoCard videoCard);

}
