package com.SchoolManagment.SchoolManagment.Repository;

import com.SchoolManagment.SchoolManagment.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
