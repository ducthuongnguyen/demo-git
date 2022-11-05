package com.daicent1.demojpa.daicent1.repository;

import com.daicent1.demojpa.daicent1.model.Clasz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazsRepository extends JpaRepository<Clasz,Long> {
}
