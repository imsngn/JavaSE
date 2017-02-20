package day03;

public class Student {
	
	private String name;
	private int classNo;
	private int id;
	private int age;
	private String sex;
	
	public void setName(String str) {	
		name = str;
	}
	public void setClass(int num){
		classNo = num;
	}
	public void setId(int idnum){
		id =idnum;
	}
	public void setAge(int ageNum){
		age = ageNum;	
	}
	public void setSex(String sexStr){
		sex = sexStr;
	}
	public void study(){
		if (sex == "female") {
			System.out.println("she is studying now");
		}
		else {
			System.out.println("he is studying now");
		}
	}
	public String toString() {
		return "name: "+name+" classNo "+classNo+" id "+id+" age "+age+ " sex "+sex;
	}
	
	public Student(String stuName, int stuClassNo, int stuId, int stuAge,String stuSex){
		name = stuName;
		classNo = stuClassNo;
		id = stuId;
		age = stuAge;
		sex = stuSex;
	}
	public Student() {
	
	}
}
