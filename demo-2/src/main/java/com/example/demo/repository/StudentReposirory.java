package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

import org.springframework.transaction.annotation.Transactional;
@Repository
public interface StudentReposirory extends JpaRepository<Student, Long> {

	List<Student> findByniveau(String niveau);
	
	
	@Transactional
	@Modifying
	@Query("delete from Student o where o.id = ?1")
	void deleteByid(Long id);
}
