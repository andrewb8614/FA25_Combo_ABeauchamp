
public class OnlineCourse extends Course {

	public OnlineCourse(String courseNumber, int numStudents, int maxStudents, int credits) {
		super(courseNumber, numStudents, maxStudents, credits);
	}
}

class FullRemoteCourse extends OnlineCourse {
	String instructorEmailAddress;

	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits,
			String instructorEmailAddress) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.instructorEmailAddress = instructorEmailAddress;
	}
	 public String getInstructorEmailAddress() {
	        return instructorEmailAddress;
	    }
}

class RealTimeRemoteCourse extends OnlineCourse {
	String zoomLink;
	String meetDays;
	String meetTime;

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoomLink,
			String meetDays, String meetTime) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomLink = zoomLink;
		this.meetDays = meetDays;
		this.meetTime = meetTime;
		
		
		
	}
	public String getZoomLink() {
	    return zoomLink;
	}

	public String getMeetDays() {
	    return meetDays;
	}

	public String getMeetTime() {
	    return meetTime;
	}
	
}
