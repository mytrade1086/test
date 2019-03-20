package constructorDemo;

class subclass extends Superclass {

	public int classnum;
	public String subject;

	subclass(int rollnolocal, String namelocal,int classnumlocal,String subjectlocal) {
		super(rollnolocal,namelocal);
		classnum = classnumlocal;
		subject= subjectlocal;

		System.out.println("Roll num is:"+rollno +" Name is "+name+ "Classnum is "+classnum+" Subject is "+subject);
		
	}


	
	public static void main(String[]args) {
		
		subclass s=new subclass(101,"sumit",1,"maths");
	}
	

}

