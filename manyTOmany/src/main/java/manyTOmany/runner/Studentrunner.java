package manyTOmany.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import manyTOmany.domain.Students;
import manyTOmany.repository.Couresesrepository;
import manyTOmany.repository.Studentsrepository;

@Component
public class Studentrunner implements CommandLineRunner{
	
	@Autowired
	Couresesrepository courserepo;
	
	@Autowired
	Studentsrepository stdrepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*Here i worked on many to many mapping 
		 * 1.many students can learn many courses
		 * 2.parent.class is student
		 * 3.child.class is courses
		 * set the data for many courses
		 * set the data for many students and make  FORIGN  KEY TABLE separtely using @JOINTABLE*/
		
		Students std1=new Students();
		std1.setStudentId(1);
		std1.setStudentLname("Ram");
		std1.setStudentName("Molankula");
		std1.setCourseslist(Arrays.asList(
				courserepo.findBycourseId(1000),
				courserepo.findBycourseId(2000),
				courserepo.findBycourseId(3000),
				courserepo.findBycourseId(4000)
				));
		
		stdrepo.save(std1);
		
		Students std2=new Students();
		std2.setStudentId(2);
		std2.setStudentLname("Ganesh");
		std2.setStudentName("Ganesh");
		std2.setCourseslist(Arrays.asList(
				courserepo.findBycourseId(1000),
				courserepo.findBycourseId(2000),
				courserepo.findBycourseId(3000),
				courserepo.findBycourseId(4000)
				));
		stdrepo.save(std2);
		
	}
	
	

}
