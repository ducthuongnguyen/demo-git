package com.daicent1.demojpa.daicent1.bean;

import com.daicent1.demojpa.daicent1.model.Clasz;
import com.daicent1.demojpa.daicent1.repository.ClazsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClazsSevicer {
    @Autowired
    ClazsRepository clazsRepository;
    public List<Clasz> findAll(){
        return clazsRepository.findAll();
    }
}
