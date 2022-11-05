package com.daicent1.demojpa.daicent1.bean;

import com.daicent1.demojpa.daicent1.model.Grade;
import com.daicent1.demojpa.daicent1.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GradeSevicer {
    @Autowired
    GradeRepository gradeRepository;
    public List<Grade>findAll(){
        return gradeRepository.findAll();
    }
}
