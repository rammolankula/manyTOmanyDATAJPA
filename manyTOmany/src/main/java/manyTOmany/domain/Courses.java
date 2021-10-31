package manyTOmany.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Courses {
	@Id
	@NonNull
	private Integer courseId;
	private String courseName1;
	private String courseName2;
	private double courseCost;

}
