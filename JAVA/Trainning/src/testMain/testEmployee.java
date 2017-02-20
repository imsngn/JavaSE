package testMain;

import day04.Employee;

public class testEmployee {

	public static void main(String[] args) {
		Employee employee01 = new Employee("xiaoming",25,"male","junior engineer", 9000);
		
		
		Employee employee02 = new Employee("xiaohuang",24,"document engineer");
		employee02.setSex("female");
		employee02.setSalary(12000);
		
		
		Employee employee03 = new Employee();
		
		employee03.setAge(22);
		employee03.setName("xiaohong");
		employee03.setPosition("designer");
		
		System.out.println(employee01.toString());
		System.out.println(employee02.toString());

		System.out.println(employee03.toString());
		System.out.print("total salary for each month is ");
		System.out.println(employee01.getSalary() + employee02.getSalary() + employee03.getSalary());

	}

}
