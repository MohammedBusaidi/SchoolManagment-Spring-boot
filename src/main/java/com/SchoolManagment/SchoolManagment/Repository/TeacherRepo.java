package com.SchoolManagment.SchoolManagment.Repository;

import com.SchoolManagment.SchoolManagment.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
