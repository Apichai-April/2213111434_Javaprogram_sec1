
public class Author {

	
		private String name;
		private String email;
		
	
	
         public Author(String name,String email) {
        	 this.name = name;
        	 this.email = email;
	 
   }
         public Author() {
        	 this.name = "";
        	 this.email = null;
         }
         public String getName() {
        	 return this.name;
         }
         
         public void setemail(String email) {
        	 
         }
         
         public String getEmail() {
			return this.email;
        	 
         }
         public String toString() {
        	 return name +"(" +email +")";
         }
         
 }

