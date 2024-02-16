public class TypeOfFunction{
	

     // Static function
	static void fun1(){

		System.out.println("Static: fun 1");
	}

     // instance function (non-stati)
	public void fun3(){
		System.out.println("Program For Functions Type : fun3");
	}
	public void fun2(){

		System.out.println("Instance : fun2");
	}

	public static void main(String [] ars){

        // Static Fun call using class name
		TypeOfFunction.fun1();

        // Instance Fun call using object
		TypeOfFunction obj = new TypeOfFunction ();
		obj.fun2();
		obj.fun3();


	}


}