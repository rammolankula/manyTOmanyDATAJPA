package manyTOmany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manyTOmany.domain.Courses;

public interface Couresesrepository extends JpaRepository<Courses,Integer> {

	Courses findBycourseId(Integer courseId);
	
}
