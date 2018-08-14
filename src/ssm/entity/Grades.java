package ssm.entity;

import java.math.BigDecimal;

public class Grades {
    
	private String id;
	private String time; 
	private BigDecimal score; 
	
	public Grades() {
		super();
	}


	public Grades(String id, String time,BigDecimal score) {
		super();
		this.id = id;
		this.time = time;
		this.score = score;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public BigDecimal getScore() {
		return score;
	}


	public void setScore(BigDecimal score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return " [id:" + id
				+ "]";
	}
}
