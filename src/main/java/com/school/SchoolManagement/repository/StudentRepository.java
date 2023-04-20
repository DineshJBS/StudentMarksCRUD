package com.school.SchoolManagement.repository;

import com.school.SchoolManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);

    /*
    @Query("SELECT u.id, u.username FROM User u")
    List<Object[]> findAllProjectedBy();
     */

    @Query("SELECT s.name FROM Student s")
    List<String> findAllNames();

}
