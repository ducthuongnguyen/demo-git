package com.daicent1.demojpa;

import com.daicent1.demojpa.daicent1.bean.GradeSevicer;
import com.daicent1.demojpa.daicent1.bean.SchoolSevicer;
import com.daicent1.demojpa.daicent1.bean.StudentSevicer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
@Slf4j
public class DemojpaApplication implements CommandLineRunner {
    @Autowired
    SchoolSevicer schoolSevicer;

    @Autowired
    GradeSevicer gradeSevicer;

    @Autowired
    StudentSevicer studentSevicer;



    public static void main(String[] args) throws Exception {
        log.debug("lỗi");
        SpringApplication.run(DemojpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        System.out.println(schoolSevicer.findAll());
//        System.out.println(gradeSevicer.findAll());
//        System.out.println(studentSevicer.findAll());
        System.out.println(schoolSevicer.search("D"));
    }

}
