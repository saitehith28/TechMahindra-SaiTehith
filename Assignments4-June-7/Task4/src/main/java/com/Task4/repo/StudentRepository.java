package com.Task4.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Task4.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}
