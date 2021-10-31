package manyTOmany.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Students {
	@Id
	@NonNull
	private Integer studentId;
	private String studentName;
	private String studentLname;
	
	@ManyToMany
	@JoinTable(
			name="FKTABLEFORTWOTABLES",             // here joining separate table for "foriegn key" from both tables Parent& Child    
			joinColumns=@JoinColumn(name="stdFk"),  // here iam giving different column names to ForiegnKey table ,stdFk,crsFk
			inverseJoinColumns = @JoinColumn(name="crsFk"))
	private List<Courses> courseslist;

}
