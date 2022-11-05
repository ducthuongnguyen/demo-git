package com.daicent1.demojpa.daicent1.repository;

import com.daicent1.demojpa.daicent1.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
    public List<School>findAllByNameContaining(String name);
}
