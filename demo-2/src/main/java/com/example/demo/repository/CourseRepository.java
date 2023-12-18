package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

import org.springframework.transaction.annotation.Transactional;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	List<Course> findBytitre(String titre);
}
