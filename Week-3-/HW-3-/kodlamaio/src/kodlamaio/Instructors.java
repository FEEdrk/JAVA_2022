package kodlamaio;

public class Instructors {
	private String instructorId;
	private String instructorName;

	public Instructors() {
		super();
	}

	public Instructors(String instructorId, String instructorName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;

	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
