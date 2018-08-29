package ssm.entity;

import java.util.List;

public class Blog {

	private String id;
	private String created_at;
	private int share_count;
	private int favorite_count;
	private int comment_count; 
	private int like_count; 
	private String text;
	
	private String userId;
	private String gender;
	private String name;
	private String avatar_image;
	private int follow_count;
	private boolean follow_me;
	
	private List<Pics> pics;
	
	public Blog() {
		super();
	}

	public Blog(String id, String created_at, int share_count, int favorite_count, int comment_count, int like_count,
			String text, String userId, String gender, String name, String avatar_image, int follow_count,
			boolean follow_me, List<Pics> pics) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.share_count = share_count;
		this.favorite_count = favorite_count;
		this.comment_count = comment_count;
		this.like_count = like_count;
		this.text = text;
		this.userId = userId;
		this.gender = gender;
		this.name = name;
		this.avatar_image = avatar_image;
		this.follow_count = follow_count;
		this.follow_me = follow_me;
		this.pics = pics;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getShare_count() {
		return share_count;
	}

	public void setShare_count(int share_count) {
		this.share_count = share_count;
	}

	public int getFavorite_count() {
		return favorite_count;
	}

	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar_image() {
		return avatar_image;
	}

	public void setAvatar_image(String avatar_image) {
		this.avatar_image = avatar_image;
	}

	public int getFollow_count() {
		return follow_count;
	}

	public void setFollow_count(int follow_count) {
		this.follow_count = follow_count;
	}

	public boolean isFollow_me() {
		return follow_me;
	}

	public void setFollow_me(boolean follow_me) {
		this.follow_me = follow_me;
	}

	public List<Pics> getPics() {
		return pics;
	}

	public void setPics(List<Pics> pics) {
		this.pics = pics;
	}

	@Override
	public String toString() {
		return " [ id：" + id + ", created_at：" + created_at + ", share_count：" + share_count + ", favorite_count："
				+ favorite_count + ", comment_count：" + comment_count + ", like_count：" + like_count + ", text：" + text
				+ ", user :{ id：" + userId + ", gender：" + gender + ", name：" + name + ", avatar_image：" + avatar_image
				          + ", follow_count：" + follow_count + ", follow_me：" + follow_me + "},"
				+ "pics: " + pics + "]";
	}
	
	
}
