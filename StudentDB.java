package emailAdminApp;
import java.util.Scanner;

public class StudentDB{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1001;


	//constructor: prompt user to enter student's name and year
	public StudentDB(){
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter student First Name: ");
		this.firstName=in.nextLine();

		System.out.print("Enter student Last Name: ");
		this.lastName=in.nextLine();

		System.out.println("1- Freshman\n2- Sophmore\n3- Junior\n4- Senior \nEnter student Class Level: ");
		this.gradeYear=in.nextInt();
		//System.out.println(firstName+" "+lastName+" "+gradeYear);
		
		setStudentID();
		System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
	}	


	//Generate an ID
	private void setStudentID(){
		//Grade level + ID
		id++;
		this.studentID= gradeYear+""+id;
		//return this.studentID;
	}
	

	//Enroll in courses
	public void enroll(){
		//Get inside a loop,user hits 0
		do{
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")){
				courses=courses+"\n   "+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			else{	
				break;
			}
		}while(1!=0);

		//System.out.println("ENROLLED IN: "+courses);
		//System.out.println("TUITION BALANCE: "+tuitionBalance);
	}


	//View balance
	public void viewBalance(){
		System.out.println("Your balance is: $"+tuitionBalance);
	}


	//Pay tuition
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment =in.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of $ "+payment);
		viewBalance();
	}


	//Show Status
	public String toString(){
		return "Name: "+firstName+" "+lastName+
"\nGrade Level :"+gradeYear+"\nStudent ID: "+studentID+"\nCourses Enrolled: "+courses+"\nBalance: $"+tuitionBalance;
	}
}
	
