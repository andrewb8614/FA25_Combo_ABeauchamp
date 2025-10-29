
public class InPersonCourse extends Course {

	
	private int roomNum;
	
	
	
	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, int roomNum) {
		super(courseNumber, numStudents, maxStudents, credits);
	this.roomNum = roomNum;
	
	
	}


	public int getRoomNum() {
	    return roomNum;
	}
	
	

}
