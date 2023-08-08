package Arrays;

class Student
{
	public String name;
	public String city;
	public long phNo;
	public Student(String name, String city, long phNo) {
		
		this.name = name;
		this.city = city;
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", phNo=" + phNo + "]";
	}
	
	
}

public class L1Array {

	static int[] n= {1,2,3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(n.length);
		
		Student[] students= {
				             new Student("a1","b1",456446431),
				             new Student("a2","b2",265465426543132l),
				             new Student("a3","b3",4564654635313l)
		                     };
		Class c1=students.getClass();
		System.out.println(c1.toGenericString());
		for(Student st:students)
		System.out.println(st.toString());

	}

}
