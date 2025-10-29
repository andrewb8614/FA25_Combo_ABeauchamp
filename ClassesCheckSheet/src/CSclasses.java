
public class CSclasses {

	public static void main(String[] args) {

		Course baseCourse = new Course("CSC1060", 7, 30, 4);
		InPersonCourse inPerson = new InPersonCourse("CSC1070", 10, 25, 3, 204);
		FullRemoteCourse fullRemote = new FullRemoteCourse("CSC1080", 12, 40, 3, "teacher@email.com");
		RealTimeRemoteCourse realTime = new RealTimeRemoteCourse("CSC1090", 15, 40, 3, "zoom.link", "MWF",
				"1:00–2:00PM");

		// printCourseDetails(baseCourse);
		printInPersonCourseDetails(inPerson);
		printFullRemoteCourseDetails(fullRemote);
		printRealTimeRemoteCourseDetails(realTime);
	}

	public static void printCourseDetails(Course course) {

		System.out.println("Course Number: " + course.getCourseNumber());
		System.out.println("Students: " + course.getNumStudents() + "/" + course.getMaxStudents());
		System.out.println("Credits: " + course.getCredits());

	}

	public static void printInPersonCourseDetails(InPersonCourse course) {

		
		 System.out.println("IN PERSON COURSE DETAILS");

		printCourseDetails(course);
		System.out.println("Room Number: " + course.getRoomNum());

	}

	public static void printFullRemoteCourseDetails(FullRemoteCourse course) {

		System.out.println("");
		System.out.println("FULL REMOTE COURSE DETAILS");

		printCourseDetails(course);
		System.out.println("Instructor Email: " + course.getInstructorEmailAddress());
		System.out.println();
	}

	public static void printRealTimeRemoteCourseDetails(RealTimeRemoteCourse course) {
		System.out.println("");
		 System.out.println("REAL TIME REMOTE COURSE DETAILS");
		printCourseDetails(course);
		System.out.println("Zoom Link: " + course.getZoomLink());
		System.out.println("Meeting Days: " + course.getMeetDays());
		System.out.println("Meeting Time: " + course.getMeetTime());
		System.out.println();
	}

}
