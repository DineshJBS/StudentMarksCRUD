package com.school.SchoolManagement.controller;

import com.school.SchoolManagement.entity.Student;
import com.school.SchoolManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/saveStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/studentNames")
    public List<String> showNames(){
        return studentService.showNames();
    }

    @GetMapping("/student/{name}")
    public Student findStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }



}
