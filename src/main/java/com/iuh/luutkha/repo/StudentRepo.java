package com.iuh.luutkha.repo;

import java.util.Collection;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iuh.luutkha.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<User, Integer> {
	@Query("SELECT s FROM students s")
	Collection<Student> findAllStudents();

	@Modifying
	@Query(value = "delete from students s where s.name= :name", nativeQuery = true)
	void deleteStudentsByName(@Param("name") String name);

	@Modifying
	@Query(value = "update students set name= :name where id = :id", nativeQuery = true)
	void updateStudentName(String name, Integer id);

}
