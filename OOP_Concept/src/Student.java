public class Student {
	
	private String name;
	private int score;

	public void setName(String Name) {
		name = Name;	
	}
	private String address;
	private String[] courses;
	private int[] grades; 
	private int numCourses; 
	private static final int MAX_COURSE = 30;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE]; // allocate arrays
		grades = new int[MAX_COURSE];
		numCourses = 0; // no courses so far
	}


	
	public String getName() {
		return name;
		
	}

	public void setScore(int Score) {
		score = Score;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return name + "(" + address + ")";
	}

	public int getScore() {
		return score;
	}
	/**Adds a course and grade*/
	public void addCourseGrade(String course,int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public boolean checkScore() {
		if(score>=0 && score<=100) 
			return true;
		else 
			return false;	
	}
	/**Prints all courses and their grades*/
	public void printGrades() {
		System.out.print(name); 
		for(int i=0; i<numCourses;i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);			
		}
		System.out.println();
	}

	public boolean isPass() {
		if(score>=50)
			return true;
		else 
			return false;
	}	
	public double getAverageGrade() {
		int sum=0;
		for(int i=0; i<numCourses;i++) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	  }
	}