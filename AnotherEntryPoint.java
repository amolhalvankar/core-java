public class AnotherEntryPoint{
	static{
		System.out.println("Static-start");
		myfun();
		System.out.println("Static-end");
	}

	public static void main(String[]args){
      System.out.println("main");
	}


	public static void myfun(){
		System.out.println("My Function");
           
	}
}