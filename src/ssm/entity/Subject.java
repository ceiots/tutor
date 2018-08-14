package ssm.entity;

public class Subject {
    
	private String id;
	private String grade; 
	private String subject; 
	private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String fee;
	
	public Subject() {
		super();
	}


	public Subject(String id, String grade, String subject, String startDate, String endDate, String startTime, String endTime,
			String fee) {
		super();
		this.id = id;
		this.grade = grade;
		this.subject = subject;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.fee = fee;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getFee() {
		return fee;
	}


	public void setFee(String fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return " [id:" + id + ", grade: " + grade + ", subject: " + subject + ", startDate: " + startDate + ", endDate: " + endDate + ", startTime: " + startTime
				+ ", endTime: " + endTime + ", fee: " + fee + "]";
	}
}
