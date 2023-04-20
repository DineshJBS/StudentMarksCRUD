package com.school.SchoolManagement.service;

import com.school.SchoolManagement.entity.Student;
import com.school.SchoolManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public List<Student> getStudents(){
      return  studentRepository.findAll();
    }

    public Student findStudentById(int id){

        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()) return student.get();

        return null;
    }

    public Student getStudentByName(String name){

        return studentRepository.findByName(name);
    }

    public Student updateStudent(Student student){
        Optional<Student> tempStudent = studentRepository.findById(student.getId());

        if(!tempStudent.isPresent()) return null;
        Student currentStudent = tempStudent.get();
        currentStudent.setEmail(student.getEmail());
        currentStudent.setName(student.getName());

        return studentRepository.save(currentStudent);

    }


    public String deleteStudent(int id){
        studentRepository.deleteById(id);
        return "Student deleted " + id;
    }

    public List<String> showNames(){
        return studentRepository.findAllNames();
    }


}
