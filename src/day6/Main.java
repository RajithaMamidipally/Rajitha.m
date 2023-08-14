package day6;

import java.util.Scanner;

public class Main {
	 public static Hosteller getHostellerDetails() {
	        Scanner sc = new Scanner(System.in);
	        Hosteller hosteller = new Hosteller();

	        System.out.println("Enter the Student Details & Hostel Details:");
	        System.out.print("Student ID: ");
	        hosteller.setStudentId(sc.nextInt());
	        sc.nextLine(); // Consume the newline character left by nextInt()

	        System.out.print("Student Name: ");
	        hosteller.setName(sc.nextLine());

	        System.out.print("Department Id: ");
	        hosteller.setDepartmentId(sc.nextInt());
	        sc.nextLine();

	        System.out.print("Gender[M/F]: ");
	        hosteller.setGender(sc.nextLine());

	        System.out.print("Phone Number: ");
	        hosteller.setPhone(sc.nextLine());

	        System.out.print("Hostel Name: ");
	        hosteller.setHostelName(sc.nextLine());

	        System.out.print("Room Number: ");
	        hosteller.setRoomNumber(sc.nextInt());

	        return hosteller;
	    }

	    public static void main(String[] args) {
	        Hosteller hosteller = getHostellerDetails();

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Modify Room Number(Y/N): ");
	        char modifyRoom = sc.next().charAt(0);
	        if (modifyRoom == 'Y' || modifyRoom == 'y') {
	            System.out.print("New Room Number: ");
	            hosteller.setRoomNumber(sc.nextInt());
	        }

	        System.out.print("Modify Phone Number(Y/N): ");
	        char modifyPhone = sc.next().charAt(0);
	        if (modifyPhone == 'Y' || modifyPhone == 'y') {
	            System.out.print("New Phone Number: ");
	            sc.nextLine(); // Consume the newline character left by nextInt()
	            hosteller.setPhone(sc.nextLine());
	        }

	        System.out.println("\nThe Student Details are as follows:");
	        System.out.println("Student ID: " + hosteller.getStudentId());
	        System.out.println("Student Name: " + hosteller.getName());
	        System.out.println("Department ID: " + hosteller.getDepartmentId());
	        System.out.println("Student Gender: " + hosteller.getGender());
	        System.out.println("Student Phone No: " + hosteller.getPhone());
	        System.out.println("Hostel Name: " + hosteller.getHostelName());
	        System.out.println("Room No: " + hosteller.getRoomNumber());
	    }
	}

