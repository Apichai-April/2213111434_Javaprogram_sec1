
public class Theater extends Movie {
	private int theaterNo;
	
	
	public Theater() {
		super();
		this.theaterNo = 0;
		
	}
	
    public Theater(String id, String name, Director director, int theaterNo) {
    	super(id,name,director);
		this.theaterNo = theaterNo;
		
	//}
    
   // public String getTheaterName() {
    	if(theaterNo >= 1 && theaterNo <= 11) {
    //		return "Basic Theater";
    	}
  //  	else if
		
		
    }
    
   // public String toString() {
    	
   // }

}
