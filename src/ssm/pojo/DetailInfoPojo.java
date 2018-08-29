package ssm.pojo;

import java.math.BigDecimal;

public class DetailInfoPojo {
	
	private String time;
	private BigDecimal score;

	public DetailInfoPojo() {
		super();
	}

	public DetailInfoPojo(String time, BigDecimal score) {
		super();
		this.time = time;
		this.score = score;
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
		return "{time=" + time + ", score=" + score + "}";
	}

}
