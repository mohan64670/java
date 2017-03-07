package inheritance;

public class MainClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A a = new B();
		 a.method();
		 System.out.println(a.i);
		 /*
		  *  when u give reference of subclass to parent class variable and are calling 
		  *  the subclass method by the reference variable of Parent class.Since it refers 
		  *  to the subclass object and subclass method overrides the Parent class method, 
		  *  subclass method is invoked at runtime.
		  *  here we are trying to do the same but Method is overridden not the datamembers,
		  *  so runtime polymorphism can’t be achieved by data members. 
		  *  Since you are accessing the datamember which is not overridden, 
		  *  hence it will access the datamember of Parent class always.
		  */
		 
		 B b = new B ();
		 b.method();
		 System.out.println(b.i);
	}

}
