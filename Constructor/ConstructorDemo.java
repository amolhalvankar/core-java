public class ConstructorDemo{
	public static void main(String[]args){
		Employee e1 = new Employee();  // Default constructor
		Employee e2 = new Employee(2,"Pruthvi",25000); // paramterised constructor


		e1.setEmpId(1);
		e1.setName("Amol");
		e1.setSalary(20000);

		e1.printinfo();
		e2.printinfo();

		System.out.println(e1);
		System.out.println(e2);



	}

}
    
class Employee{
		private int empId;
		private String name;
		private float salary;
		

		Employee(){System.out.println("Default Constructor");}

		Employee(int empId, String name, float salary){

			System.out.println("Paramiterised Constructor");
			this.empId = empId;
			this.name = name;
			this.salary= salary;

		}


		// Getter method & setter for empID
		int getEmpId(){return this.empId; }
		void setEmpId(int id){this.empId = id;}

		// Getter method & setter for name
		String getName(){return this.name; }
		void setName(String name){this.name = name;}

		// Getter method & setter for salary
		float getSalary(){return this.salary; }
		void setSalary(float salary){this.salary = salary;}

		void printinfo(){

			System.out.println("ID="+ this.empId + ", NAME=" + this.name +  ", SALARY=" + this.salary);

		}



	}
