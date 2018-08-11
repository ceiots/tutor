package ssm.entity;

import java.math.BigDecimal;

public class Student {

	    private String id; // 主键
	    private String pic; // 用户姓名
	    private String name; // 密码
	    private String university; 
	    private String college; 
	    private String profession; 
	    private BigDecimal fraction;
	    
	    public Student(){
	    	
	    }
	    
		public Student(String id, String pic, String name, String university, String college, String profession,
				BigDecimal fraction) {
			super();
			this.id = id;
			this.pic = pic;
			this.name = name;
			this.university = university;
			this.college = college;
			this.profession = profession;
			this.fraction = fraction;
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
		public String getUniversity() {
			return university;
		}
		public void setUniversity(String university) {
			this.university = university;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public BigDecimal getFraction() {
			return fraction;
		}
		public void setFraction(BigDecimal fraction) {
			this.fraction = fraction;
		}
		@Override
		public String toString() {
			return "Student [id: " + id + ", pic: " + pic + ", name: " + name + ", university: " + university + ", college: "
					+ college + ", profession: " + profession + ", fraction: " + fraction + "]";
		} 
}
