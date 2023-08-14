package Day5;

public class Student {
	private int studentId;
	private String studentName, studentAddress, collegeName;
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}

	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this(studentId,studentName,studentAddress);
		this.collegeName = collegeName;
	}

	
	
}
