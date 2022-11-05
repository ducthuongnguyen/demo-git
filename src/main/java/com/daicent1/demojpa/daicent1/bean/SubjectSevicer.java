package com.daicent1.demojpa.daicent1.bean;

import com.daicent1.demojpa.daicent1.model.Subject;
import com.daicent1.demojpa.daicent1.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubjectSevicer {
    @Autowired
    SubjectRepository subjectRepository;
    public List<Subject>findAll(){
        return subjectRepository.findAll();
    }
}
