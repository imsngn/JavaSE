package day05;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("����", 23, "female");
		System.out.println(person.toString());
		
		
		Employee employee = new Employee("����",22,"femal", "�з�����ʦ");
		System.out.println(employee.toString());
		
		
		Employee employee02 = new Employee("����",22,"male", "��Ʒ����ʦ");
		System.out.println(employee02.toString());
		
		
		employee02.setGender("female");
		System.out.println(employee02.toString());

	}

}
