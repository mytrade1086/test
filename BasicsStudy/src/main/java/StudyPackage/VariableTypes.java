package StudyPackage;

public class VariableTypes {
	static int datastatic=10;
	private int privatemember;
	public int publicparentvariable;
	public float floatdata;
	
	
	public static void main(String[] args) {
	
	System.out.println("Before Increment Static variable: Default Value set to 10 "+datastatic);
	datastatic=datastatic+2;
	System.out.println("Post Increment Static variable by 2 "+datastatic);
	
	
	VariableTypes t=new VariableTypes();
	System.out.println("Before increment private variable: "+t.privatemember);
	t.privatemember=t.privatemember+1;
	System.out.println("After increment private variable by 1 "+t.privatemember);
	
	
	ChildVariableTypes c=new ChildVariableTypes();
	
	System.out.println("Print Static variable from Child Class "+c.childcounter);
	
	VariableTypes t1=new VariableTypes();
	System.out.println(t1.privatemember+" "+t1.publicparentvariable);
	
	t.printInstanceVariable1();
	t.printStaticVariable();
	
//	t.floatdata=10.0f;
//	System.out.println("division by 0 for float "+t.floatdata/0 );
	
	
	
	}
	
	
	
	
	public void printInstanceVariable1() {
		
		System.out.println(privatemember);
	}
	
	
public void printStaticVariable() {
		
		System.out.println(datastatic);
	}
	

}




 