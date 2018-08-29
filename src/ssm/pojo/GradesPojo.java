package ssm.pojo;

import java.util.List;

public class GradesPojo {
    
	private String id;
	private String subject;
	private List<DetailInfoPojo> detailInfoList;
	
	public GradesPojo() {
		super();
	}

	public GradesPojo(String id, String subject, List<DetailInfoPojo> detailInfoList) {
		super();
		this.id = id;
		this.subject = subject;
		this.detailInfoList = detailInfoList;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<DetailInfoPojo> getDetailInfoList() {
		return detailInfoList;
	}

	public void setDetailInfoList(List<DetailInfoPojo> detailInfoList) {
		this.detailInfoList = detailInfoList;
	}

	@Override
	public String toString() {
		return "{ subject=" + subject + ", detailInfo: [" + detailInfoList + "]}";
	}
	
}
