package student.management.system;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		int choice,NoOfStudents,cont;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Student Management System\n");
		System.out.println("Enter how many student to enroll:");
		NoOfStudents = s.nextInt();
		student[] stud = new student[NoOfStudents+1];
		
		for (int i = 1; i <= NoOfStudents; i++) 
		{
			System.out.println("---------------------------Student "+i+"---------------------------------------");
			System.out.println("Student "+i);
			stud[i] = new student();
			System.out.println("\nWelcome");
			do {
				System.out.println("1)Enroll\n2)View Balance\n3)Pay Tuition Fee\n4)Show Status\n");
				System.out.println("Enter your choice :");
				choice = s.nextInt();
				switch(choice) {
				case 1:
					stud[i].enroll();
					break;
				case 2:
					stud[i].view_balance();
					break;
				case 3:
					stud[i].pay_tuition_fee();
					break;
				case 4:
					stud[i].show_status();
					break;
				default:
					System.out.println("Invalid choice");
				}
				System.out.println("Do you want to continue press 'y' else press'n':");
				cont = s.next().charAt(0);
			}while(cont =='y');
			System.out.println("---------------------------------------------------------------------------");
		}
		System.out.println("\n===================================================================================");
		System.out.println("The total number of students details:");
		for (int i = 1; i <= NoOfStudents; i++) 
		{
			System.out.println("\n-----------------------------Student "+i+"-------------------------------------");
			stud[i].show_status();
			System.out.println("---------------------------------------------------------------------------");
		}
		System.out.println("===================================================================================");

	}

}
