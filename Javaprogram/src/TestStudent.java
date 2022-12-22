import java.util.*;
public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[4]; 
		for(int i=0;i<std.length;i++) {
			std[i] = new Student(); 			
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("--------------------------------------");
			System.out.print("Input student name: ");			
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again:");
				std[i].setScore(scan.nextInt());
			}//end while()
			System.out.println();
		} //end for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("--------------------------------------");
		for(Student stds : std) {
			if(stds.isPass()) {
				System.out.println(">> "+stds.getName()+" get grade "
						+" "+stds.findGrade(stds.getScore())+"");
			}
		}
		

	}

}