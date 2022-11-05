package com.daicent1.demojpa.daicent1.repository;

import com.daicent1.demojpa.daicent1.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
