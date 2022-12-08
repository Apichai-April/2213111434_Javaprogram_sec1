import javax.swing.*;

public class Lab502 {
    static String email;
	public static void main(String[] args) {	
		inputEmail();
		
	}
	
	public static void inputEmail() {
		String ans = "";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail:");
		checkEmailError(email);
         ans = JOptionPane.showInputDialog("Continu[y||Y to contiune] : ");
		}while(ans.equalsIgnoreCase("y"));
	}
	
	public static void checkEmailError(String chkEmail) {
		while(chkEmail.startsWith("@")||chkEmail.contains(" ")){
		chkEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
	}
		chkEmail = chkEmail.toLowerCase();
				boolean checkemail = chkEmail.endsWith("@gmail.com")||chkEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkemail)
				? "Your e-mail is "+ chkEmail
				: "your e-mail is not hotmail or gmail dot com");
	}

}
