package manyTOmany.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import manyTOmany.domain.Courses;
import manyTOmany.repository.Couresesrepository;
@Component
public class Courserunner implements CommandLineRunner {

	@Autowired
	Couresesrepository courserepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		courserepo.save(new Courses(1000,"java","python",8.9));
		courserepo.save(new Courses(2000,"kotlin","python",9.9));
		courserepo.save(new Courses(3000,"ruby","python",10.9));
		courserepo.save(new Courses(4000,"ML","python",11.9));
	}

}
