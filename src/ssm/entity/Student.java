package ssm.entity;

import java.math.BigDecimal;

public class Student {

	    private String id; // 主键
	    private String pic; // 用户姓名
	    private String name; // 密码
	    private String university; 
	    private String college; 
	    private String profession; 
	    private BigDecimal totalFraction; //总分
	    private BigDecimal Chinese;//语文
	    private BigDecimal Maths;
	    private BigDecimal English;
	    private BigDecimal scienceComprehensives; //理综合
	    private BigDecimal artsComprehensive;   //文综  
	    public Student(){
	    	
	    }
	    
		public Student(String id, String pic, String name, String university, String college, String profession,
				BigDecimal totalFraction, BigDecimal chinese, BigDecimal maths, BigDecimal english,
				BigDecimal scienceComprehensives,BigDecimal artsComprehensive) {
			super();
			this.id = id;
			this.pic = pic;
			this.name = name;
			this.university = university;
			this.college = college;
			this.profession = profession;
			this.totalFraction = totalFraction;
			this.Chinese = chinese;
			this.Maths = maths;
			this.English = english;
			this.scienceComprehensives = scienceComprehensives;
			this.artsComprehensive = artsComprehensive;
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
		
		public BigDecimal getTotalFraction() {
			return totalFraction;
		}

		public void setTotalFraction(BigDecimal totalFraction) {
			this.totalFraction = totalFraction;
		}

		public BigDecimal getChinese() {
			return Chinese;
		}

		public void setChinese(BigDecimal chinese) {
			Chinese = chinese;
		}

		public BigDecimal getMaths() {
			return Maths;
		}

		public void setMaths(BigDecimal maths) {
			Maths = maths;
		}

		public BigDecimal getEnglish() {
			return English;
		}

		public void setEnglish(BigDecimal english) {
			English = english;
		}
		
	
		public void setScienceComprehensives(BigDecimal scienceComprehensives) {
			this.scienceComprehensives = scienceComprehensives;
		}
		public BigDecimal getScienceComprehensives() {
			return scienceComprehensives;
		}
		public void setArtsComprehensive(BigDecimal artsComprehensive) {
			this.artsComprehensive = artsComprehensive;
		}
		public BigDecimal getArtsComprehensive() {
			return artsComprehensive;
		}

		@Override
		public String toString() {
			return "[id: " + id + ", pic: " + pic + ", name: " + name + ", university: " + university + ", college: "
					+ college + ", profession: " + profession + ", totalFraction: " + totalFraction + ", subjects: ["
					+ "{name: 语文, fraction: " + Chinese + "},"
					+ "{name: 数学, fraction: " + Maths + "},"
					+ "{name: 英语, fraction: " + English + "},"
					+ "{name: 理综, fraction: " + scienceComprehensives + "}"
					+ "{name: 文综, fraction: " + artsComprehensive + "}"
					+ "]";
		} 
} 

