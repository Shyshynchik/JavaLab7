package com.lab7.demo.Repository;

import com.lab7.demo.Models.VideoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoCardRepository extends JpaRepository<VideoCard, Integer> {

    List<VideoCard> findAll();

    VideoCard findByName(String name);
}
