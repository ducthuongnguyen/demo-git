package com.daicent1.demojpa.daicent1.bean;

import com.daicent1.demojpa.daicent1.model.Student;
import com.daicent1.demojpa.daicent1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentSevicer {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> findAll(){
        return studentRepository.findAll();
    }



    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }


    public void save(Student student) {
        studentRepository.save(student);

    }


    public void remove(Long id) {
        studentRepository.deleteById(id);
    }


//    public List<Student>findAllByScore(Long sub_id){
//        return  studentRepository.findAllByScore(sub_id);
//    }
}
