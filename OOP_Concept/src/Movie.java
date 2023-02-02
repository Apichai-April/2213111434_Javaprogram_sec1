
public class Movie {
	
	private String id;
	private String name;
	private Director director;
	
	
	public Movie() {
		id = "";
		name ="";
		director = null;
		
	}
	
	public Movie(String id, String name, Director director) {
		this.id = "";
		this.name = "";
		this.director = director;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Director getdirector() {
		return  this.director;
	}
	
	public void setDirector(Director director) {
		this.director = director;
		
	}
	
	public String toString() {
		return getId() + " " + getName()+" direct by "+ getdirector().toString();
		
	}

}
