package com.school.SchoolManagement.service;

import com.school.SchoolManagement.entity.Mark;
import com.school.SchoolManagement.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarkService {

    @Autowired
    private MarkRepository markRepository;

    public Mark saveMark(Mark mark){
        return markRepository.save(mark);
    }


    public List<Mark> getMarks(){
      return  markRepository.findAll();
    }

    public Mark findMarkById(int id){

        Optional<Mark> mark = markRepository.findById(id);

        if(mark.isPresent()) return mark.get();

        return null;
    }

    public String deleteMark(int id){
        markRepository.deleteById(id);
        return "Mark deleted " + id;
    }


    public List<String> showMarks(){
        return markRepository.findAllNames();
    }

}
