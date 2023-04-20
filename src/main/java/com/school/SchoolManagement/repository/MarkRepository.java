package com.school.SchoolManagement.repository;

import com.school.SchoolManagement.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark,Integer> {

    @Query("SELECT m.subject FROM Mark m")
    List<String> findAllNames();

}
