package Day4;

import java.util.Scanner;

public class StudentReportCard {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		System.out.print("enter no of subjects: ");
		int noOfSubjects = sc.nextInt();
		
		int[] marks = new int[noOfSubjects];
		marksEntry(marks);
		printMarks(name , marks);
		sc.close();

	}

	

	private static void marksEntry(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for subject -"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
		

	}

	private static void printMarks(String name, int[] marks) {
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("          REPORT CARD         ");
		
		System.out.println("STUDENT NAME: "+name.toUpperCase());
		System.out.println("------------------------------");
		System.out.println(" SUBJECT\tMARKS");
		System.out.println("------------------------------");
		for(int i=0; i<marks.length ; i++) {
			System.out.println("SUBJECT-"+ (i+1)+"\t "+marks[i]);
			
		}
		int total = 0;
        int length = marks.length;

        for (int num : marks) {
            total += num;
        }

        double average = (double) total / length;

//        // Print the results
//        System.out.println("Total: " + total);
//        System.out.println("Average: " + average);
		System.out.println("------------------------------");
		System.out.printf("Total:%d     Avg:%2f \n",total,average);
		System.out.println("------------------------------");
	}
}
