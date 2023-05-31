package com.SchoolManagment.SchoolManagment.Repository;

import com.SchoolManagment.SchoolManagment.Entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Long> {
}
