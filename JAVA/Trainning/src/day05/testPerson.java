package day05;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("张三", 23, "female");
		System.out.println(person.toString());
		
		
		Employee employee = new Employee("李四",22,"femal", "研发工程师");
		System.out.println(employee.toString());
		
		
		Employee employee02 = new Employee("王二",22,"male", "产品工程师");
		System.out.println(employee02.toString());
		
		
		employee02.setGender("female");
		System.out.println(employee02.toString());

	}

}
