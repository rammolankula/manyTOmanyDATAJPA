# manyTOmanyDATAJPA
Here i worked on many to many mapping 
#### 1.many students can learn many courses
#### 2.parent.class is student
#### 3.child.class is courses
#### 4.set the data for many courses
#### 5.set the data for many students and make  FORIGN  KEY TABLE separtely using @JOINTABLE

	@ManyToMany
	@JoinTable(
			name="FKTABLEFORTWOTABLES",             // here joining separate table for "foriegn key" from both tables Parent& Child    
			joinColumns=@JoinColumn(name="stdFk"),  // here iam giving different column names to ForiegnKey table ,stdFk,crsFk
			inverseJoinColumns = @JoinColumn(name="crsFk"))
	private List<Courses> courseslist;

		
