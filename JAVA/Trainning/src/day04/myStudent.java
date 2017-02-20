package day04;

public class myStudent {
	private static int id;
	private String name;
	private int age;
	private int classNo;
	public myStudent(String name, int age, int classNo) {
		super();
		this.name = name;
		this.age = age;
		this.classNo = classNo;
		id = id + 1;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		myStudent.id = id;
	}
	public int getStudentId(){
		return getId();
	}
	public void setStudentId(int id){
		setId(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	@Override
	public String toString() {
		return "myStudent [id =" + id + ", name=" + name + ", age=" + age + ", classNo=" + classNo + "]";
	}
	
	
	
}
