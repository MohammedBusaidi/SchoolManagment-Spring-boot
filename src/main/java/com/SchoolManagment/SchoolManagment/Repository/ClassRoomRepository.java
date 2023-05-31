package com.SchoolManagment.SchoolManagment.Repository;

import com.SchoolManagment.SchoolManagment.Entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom, Long> {
}
