import java.util.Scanner;
public class TranscriptApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Transcript transcript = new Transcript();
		String grade;
		String proceed = "y";
		while (proceed.equalsIgnoreCase("y")) {
			CourseEnrollment course = new CourseEnrollment();
			course.setCourseCode(Validator.getcourseCode(sc, "Please enter course code"));
			course.setCredit(Validator.getCredit(sc, "Give your credit"));
			course.setGrade(Validator.getGrade(sc, "Give your grade"));
			grade = course.getGrade();
			course.setQuality(transcript.gradetoQuality(grade));
			transcript.addCourse(course);
			System.out.print("Do you want to keep going?");
			proceed = sc.next();
		}
		sc.close();
		transcript.getFormattedGPA();
	}
	
	

}
