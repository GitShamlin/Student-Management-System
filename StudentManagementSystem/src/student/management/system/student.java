package student.management.system;

import java.util.Scanner;

public class student {

	private String StudentName, StudentId, enrollmentId, Address, Courses = "";
	private long contact_No;
	private char class_level;
	private static int courseFee = 1500, sid = 1000, eid = 100;
	private int Fees = 0, amount, Bal_Fees=0;
	
	public student(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		StudentName = sc.next();
		System.out.println("Enter your address : ");
		Address = sc.next();
		System.out.println("Enter your contact number : ");
		contact_No = sc.nextLong();
		System.out.println("\npress 'F' for Fresher \npress 'J' for Junior \npress 'S' for Senior");
		System.out.println("Enter your class level : ");
		class_level = sc.next().charAt(0);
		System.out.println("Your student id is :");
		studentid();
		System.out.println(StudentId);
	
	}
	
	private void studentid() {
		sid++;
		StudentId = class_level+""+sid;
		
	}
	
	public void show_status() {
		
		System.out.println("Name :" + StudentName);
		System.out.println("Student ID :" + StudentId);
		System.out.println("Address :" + Address);
		System.out.println("Contact Number :" + contact_No);
		System.out.println("Class Level :" + class_level);
		System.out.println("Courses Enrolled :" + Courses);
		System.out.println("Balance Fees :" + Bal_Fees);
	}

	public void pay_tuition_fee() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your fees amount :");
		amount = sc.nextInt();
		Bal_Fees = Bal_Fees -amount;
		System.out.println("Payment successful");
		System.out.println("Now your balance is : "+Bal_Fees);
	}

	public void view_balance() {
		
		System.out.println("Your balance fees is :"+Bal_Fees);
	}

	public void enroll() {
		
		String course = ""  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("The courses available are:");
		System.out.println("press 1 for Java\npress 2 for C\npress 3 for C++\npress 4 for Python\npress 5 for C#");
		System.out.println("How many course you want to enroll?");
		int no_of_course = sc.nextInt();
		System.out.println("What are the courses would you like to enroll?");
		for(int i=1;i<=no_of_course;i++) {
			System.out.println("Enetr course "+i);
			int option = sc.nextInt();
			switch(option) {
			case 1:
				course = "Java";
				enrollmentID("J");
				break;
			case 2:
				course = "C";
				enrollmentID("C");
				break;
			case 3:
				course = "C++";
				enrollmentID("CP");
				break;
			case 4:
				course = "Python";
				enrollmentID("PY");
				break;
			case 5:
				course = "C#";
				enrollmentID("CS");
				break;
			default:
				System.out.println("Invalid input");
			}
			Courses = Courses+"\n"+course;
			Fees += courseFee;
			Bal_Fees = Fees;
			
		}
		System.out.println("Successfully enrolled!");
		System.out.println("Your total fees is :"+Fees);

	}
	
	private void enrollmentID(String c) {
		eid++;
		enrollmentId = c+""+eid;
		System.out.println("Your enrollment id for this course :"+enrollmentId);
	}

}