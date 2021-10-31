package manyTOmany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manyTOmany.domain.Students;

public interface Studentsrepository extends JpaRepository<Students,Integer> {

}
