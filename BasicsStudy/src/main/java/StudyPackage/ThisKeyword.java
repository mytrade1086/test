package StudyPackage;

public class ThisKeyword {
	
	public int var1;
	public int var2;
	
	
	//Default Constructor
	ThisKeyword(){
		this(5);
		
		System.out.println("Default Constructor");				
	}
	
	//Constructor with 1 parameter	
ThisKeyword(int data){
		this(5,6);
		System.out.println("Int Constructor");	
	}

//Constructor with 2 parameters	
ThisKeyword(int data,int data1){
		System.out.println("Int Constructor with 2 Arguments");
	
}



public void method1() {
	
	
	System.out.println("Method 1 Called");
	this.method2();  // not necessary to add this.
}

public void method2() {
	
	
	System.out.println("Method 2 Called");
}


public void putdata(int x,int y) {
	
	var1=x;
	var2=y;
	
	System.out.println(var1+" "+var2);
	
	

}


public void putdata2(int var1,int var2) {
	
	this.var1=var1;
	this.var2=var2;
	
	//System.out.println(var1+" "+var2);
	
	

}


  public static void main(String[] args) {
		
	  ThisKeyword th=new ThisKeyword();//Calling Default
	  
	  th.method1();
	 //th.putdata(10, 20);
	  th.putdata2(100, 200);
	  
	  System.out.println(th.var1+" "+th.var2);
	  //
	  

	}

}
