package day04;

public class testMyStudent {
	public static void main(String[] args){
		myStudent stu01 = new myStudent("xiaohong",23,1);
		System.out.println(stu01.toString());
		
		myStudent stu02 = new myStudent("xiaohuang",22,2);
		System.out.println(stu02.toString());
		
		
		myStudent stu03 = new myStudent("xiaodeng",23,5);
	
	
		System.out.println(stu03.toString());
		
		stu01.setStudentId(4);
		System.out.println(stu01.toString());
		System.out.println(stu02.toString());
		System.out.println(stu03.toString());


	}

}
