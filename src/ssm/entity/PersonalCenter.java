package ssm.entity;

public class PersonalCenter {

	    private Boolean identification; // 主键
	    private Boolean showToParent; // 用户姓名
	    
	    public PersonalCenter(){
	    	
	    }
	  
		public PersonalCenter(Boolean identification, Boolean showToParent) {
			super();
			this.identification = identification;
			this.showToParent = showToParent;
		}

		public Boolean getIdentification() {
			return identification;
		}

		public void setIdentification(Boolean identification) {
			this.identification = identification;
		}

		public Boolean getShowToParent() {
			return showToParent;
		}

		public void setShowToParent(Boolean showToParent) {
			this.showToParent = showToParent;
		}

		@Override
		public String toString() {
			return "[identification: " + identification + ", showToParent: " + showToParent +  "]";
		} 
} 

