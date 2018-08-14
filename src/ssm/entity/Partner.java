package ssm.entity;

public class Partner {
	private String id;
	private String pic;
	private String author;
	private String name;
	private Integer votes;

	
	public Partner(){
		
	}
	
	public Partner(String id, String pic, String author, String name, Integer votes) {
		super();
		this.id = id;
		this.pic = pic;
		this.author = author;
		this.name = name;
		this.votes = votes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return " [id:" + id + ", pic:" + pic + ", author:" + author + ", name:" + name + ", votes:" + votes
				+ "]";
	}
	
}
