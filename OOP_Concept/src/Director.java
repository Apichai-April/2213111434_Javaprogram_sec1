
public class Director {
	 
	private String name;
	private String email;
	private char   gender;
	
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	public Director(String name,String email) {
		this.name = name;
		this.email = email;
			
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		String FullGenName = "";
				if((gender == 'm'|| gender == 'M')){
					FullGenName = "Male"; 			
	}
		else if (gender == 'f' || gender == 'F') {
		FullGenName = "Female";
	}
				else {
					FullGenName = null;
				}
		return FullGenName;		
	}
	
	
	public String toString() {
		return getName() +"("+ getEmail() + " ; "+ getGenderName()+")";
	}
	
 }


