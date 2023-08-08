package lamdaEx;

import Maps.Student;

public class Lamda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamda l=(a)->{System.out.println(a.toString());};

		l.add(new Student("R1","as","hyd","TS"));
		// it is added in server
	}

}
