package com.SchoolManagment.SchoolManagment.Repository;

import com.SchoolManagment.SchoolManagment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
