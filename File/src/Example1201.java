import java.io.*;
import java.util.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		// use Scanner class for read data from file
		
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while(read.hasNext()) {
			String fname = read.next();  //read data1 from file to fname
			//String lname = read.next();  //read data2 from file to lname
			read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(fname + "("+email+")");
			
		}
		read.close();
		

	}

}
