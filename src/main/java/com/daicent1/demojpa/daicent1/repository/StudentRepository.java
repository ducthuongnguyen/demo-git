package com.daicent1.demojpa.daicent1.repository;

import com.daicent1.demojpa.daicent1.model.Student;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
//   @Query( value = "select stu.name, s2.name from student stu\n" +
//           "join subandstu s on stu.stu_id = s.stu_id\n" +
//           "join subject s2 on s.sub_id = s2.sub_id\n" +
//           "    where score=(select max(score)from subandstu\n" +
//           "    join subject s3 on subandstu.sub_id = s3.sub_id\n" +
//           "    where s3.sub_id= :sub_id)")
// List<Student>findAllByScore(@Param("sub_id") Long sub_id);

}
