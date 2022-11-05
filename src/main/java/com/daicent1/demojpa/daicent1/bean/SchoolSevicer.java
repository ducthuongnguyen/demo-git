package com.daicent1.demojpa.daicent1.bean;

import com.daicent1.demojpa.daicent1.model.School;
import com.daicent1.demojpa.daicent1.model.Student;
import com.daicent1.demojpa.daicent1.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SchoolSevicer {
    @Autowired
    SchoolRepository schoolRepository;

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    public Optional<School> findById(Long id) {
        return schoolRepository.findById(id);
    }


    public void save(School school) {
        schoolRepository.save(school);

    }

    public List<School> search(String name) {
        return schoolRepository.findAllByNameContaining(name);
    }

    public void remove(Long id) {
        schoolRepository.deleteById(id);
    }
}
