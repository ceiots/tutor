package ssm.entity;

public class Chater {
	private String id;
	private String pic;
	private String name;
	private String lastWords;

	public Chater(){
	}
	
	public Chater(String id, String pic, String name, String lastWords) {
		super();
		this.id = id;
		this.pic = pic;
		this.name = name;
		this.lastWords = lastWords;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastWords() {
		return lastWords;
	}

	public void setLastWords(String lastWords) {
		this.lastWords = lastWords;
	}

	@Override
	public String toString() {
		return " [id:" + id + ", pic:" + pic + ", name:" + name + ", lastWords:" + lastWords + "]";
	}
	
}
