package Day5;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = null;
		System.out.print("Enter Student's Id: ");
		int studentID = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Student's Name: ");
		String studentName = sc.nextLine();
		
		System.out.print("Enter Student's address: ");
		String addr = sc.nextLine();
		
		String opt;
		while(true) {
			System.out.print("Whether the student is from NIT(Yes/No): ");
			opt = sc.next();
			if(opt.compareToIgnoreCase("yes")==0 || opt.compareToIgnoreCase("no")==0) {
				break;
			}
			else {
				System.err.println("Wrong Input");
			}
		}
		if(opt.compareToIgnoreCase("yes")==0) {
			student = new Student(studentID,studentName,addr);
		}
		else {
			sc.nextLine();
			System.out.print("Enter the college name: ");
			String college =sc.nextLine();
			student = new Student(studentID,studentName,addr,college);
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println(" Student Details");
		System.out.println();
		
		System.out.println("Student id: "+ student.getStudentId());
		System.out.println("Student name: "+student.getStudentName());
		System.out.println("Address: "+student.getStudentAddress());
		System.out.println("College Name: "+student.getCollegeName());
		sc.close();
	}

}

