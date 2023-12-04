# manyTOmanyDATAJPA
Here i worked on many to many mapping 
<pre>
&#8594; 1.many students can learn many courses
&#8594; 2.parent.class is student
&#8594; 3.child.class is courses
&#8594; 4.set the data for many courses
&#8594; 5.set the data for many students and make  FORIGN  KEY TABLE separtely using @JOINTABLE
</pre>

	@ManyToMany
	@JoinTable(
			name="FKTABLEFORTWOTABLES",             // here joining separate table for "foriegn key" from both tables Parent& Child    
			joinColumns=@JoinColumn(name="stdFk"),  // here iam giving different column names to ForiegnKey table ,stdFk,crsFk
			inverseJoinColumns = @JoinColumn(name="crsFk"))
	private List<Courses> courseslist;

		
