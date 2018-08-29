package ssm.entity;

public class Pics {

	private String id;
	private String userId;
	private String pid;
	private String url;
	
	public Pics() {
		super();
	}
	public Pics(String id, String userId, String pid, String url) {
		super();
		this.id = id;
		this.userId = userId;
		this.pid = pid;
		this.url = url;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "[pid：" + pid + ", url：" + url + "]";
	}
	
}
