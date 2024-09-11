import java.util.Scanner;
import emailAdminApp.*;

public class StudentDatabaseApp{
	public static void main (String[] args){
		
		//Ask how new users we want to add
		System.out.print("Enter number of new Students to enroll: ");
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		StudentDB[] students=new StudentDB[numOfStudents];

		//Create n number of new students
		for(int n=0;n<numOfStudents;n++){
			students[n]=new StudentDB();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n=0;n<numOfStudents;n++){
			System.out.println(students[n].toString());
		}
	}
}