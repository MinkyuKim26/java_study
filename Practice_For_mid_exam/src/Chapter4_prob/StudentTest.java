package Chapter4_prob;

class Student
{
	String name;
	int studentID;
	int age;
	public Student(String _name, int _studentID, int _age)
	{
		name = _name;
		studentID = _studentID;
		age = _age; 
	}
	public void Introduce()
	{
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학번 : " + studentID);
		System.out.println("학생의 나이 : " + age);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student("Kim", 20180001, 20);
		kim.Introduce();
		
	}

}
