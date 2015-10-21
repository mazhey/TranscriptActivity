import java.util.ArrayList;

public class Transcript {
	static ArrayList<CourseEnrollment> course = new ArrayList<CourseEnrollment>();
	

	public Transcript() {

	}
	public void addCourse(CourseEnrollment course) {
		
		Transcript.course.add(course);
	}

	public static ArrayList<CourseEnrollment> getCourses() {
		for (CourseEnrollment crs : course) {
			System.out.println("Course: " + crs.courseCode);
		}
		return course;
	}

	public static double getOverallGPA() {
		double upper=0;
		double down=0;
		for(CourseEnrollment crs: course)
		{
			upper=upper+(crs.quality*crs.credit);
		}
		for(CourseEnrollment crs: course)
		{
			down=down+crs.credit;
		}
		return upper/down;
	}

	
	public double gradetoQuality(String grade) {
		int value=-1;
		if (grade.toUpperCase().equals("A")) {
			value=4;
		} else if (grade.toUpperCase().equals("B")) {
			value=3;
		} else if (grade.toUpperCase().equals("C")) {
			value=2;
		} else if (grade.toUpperCase().equals("D")) {
			value=1;
		} else if (grade.toUpperCase().equals("E")
				|| grade.toUpperCase().equals("F")) {
			value=0;
		}
		return value;
	}
	
	public String getFormattedGPA(){
		System.out.println("Course    \tCredits\t\t\tGrade\tQuality Points");
		System.out.println("----------\t-------\t\t\t-----\t--------------");
		for (CourseEnrollment crs : course) {
			String s = crs.courseCode
					+"\t" + crs.credit
					+"\t\t\t" + crs.grade
					+"\t" + crs.quality;
			System.out.println(s);}
		String result = String.format("%.2f", Transcript.getOverallGPA());
		System.out.println("\n\t\t\t\t\t    GPA:\t" +result+"\n");
					
					
		

		return "";
		
		
			
}
}
