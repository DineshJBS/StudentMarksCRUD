package com.school.SchoolManagement.controller;

import com.school.SchoolManagement.entity.Mark;
import com.school.SchoolManagement.entity.Student;
import com.school.SchoolManagement.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MarkController {

    @Autowired
    private MarkService markService;
    @Autowired
    private StudentController studentController;

    @PostMapping("/saveMark")
    public Mark addStudent(@RequestBody Mark mark){
        return markService.saveMark(mark);
    }

    @GetMapping("/marks")
    public List<Mark> findAllStudents(){
        return markService.getMarks();
    }

    @GetMapping("/showMarks")
    public List<String> showMarks(){
        return markService.showMarks();
    }

    @GetMapping("/markById/{id}")
    public Mark findStudentById(@PathVariable int id){
        return markService.findMarkById(id);
    }


    @DeleteMapping("/deleteMark/{id}")
    public String deleteStudent(@PathVariable int id){
        return markService.deleteMark(id);
    }


    @GetMapping("/studentsAndMarks/{id}")
    public Map<String, Integer> showStudentsAndMarks(@PathVariable int id){

        Student theStudent = studentController.findStudentById(id);

        Mark theMark = markService.findMarkById(id);

        Map<String, Integer> result = new HashMap<>();
        result.put(theStudent.getName(), theMark.getMark());

        return result;
    }








}
