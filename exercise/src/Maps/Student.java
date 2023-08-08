package Maps;

public class Student {
	public String rNo;
	public String name;
	public String city;
	public String state;
	public Student(String rNo, String name, String city, String state) {
		this.rNo = rNo;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
