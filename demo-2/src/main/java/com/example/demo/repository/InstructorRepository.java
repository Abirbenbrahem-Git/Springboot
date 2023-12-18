package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instructor;

import org.springframework.transaction.annotation.Transactional;
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
	List<Instructor> findBySpecialite(String specialite);
	
	
	@Transactional
	@Modifying
	@Query("delete from Instructor o where o.id1 = ?1")
	void deleteByid(Long id1);

}
