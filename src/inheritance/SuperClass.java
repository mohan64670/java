package inheritance;

/*
 You will get a compile time error saying implicit default constructor A() 
 is undefined for Class A. Compiler will force you to write constructor in Class B. 
 Because, we are not defining constructor for Class B. So, compiler will be providing 
 default constructor. In that default constructor, first statement 
 is super() – it is a calling statement to default constructor of Class A. 
 But it is not defined in Class A. Therefore you will get a compile time error. 
 To avoid this error, write the constructor for sub class. 
 From that constructor call super class constructor explicitly. See the below code,*/

public class SuperClass {
	  protected static int i;
//	  SuperClass(){             // Either define a default constructor or call super class 
	  							// constructor explicitly in subclass constructor	  
//	  }
	 
	   public SuperClass(int i)
	    {
		 
	        System.out.println("Class A Constructor");
	    }
	}
	 
	class SubClass extends SuperClass
	{ 
	    int i;
	    public SubClass()
	    {
	        super(10);     //Explicitly Calling Class A constructor
	        System.out.println("Class B Constructor");
	    }
	    public static void main(String[] args) {
			
	    	SubClass s = new SubClass();
	    	System.out.println(SuperClass.i);
	    
		}

}
