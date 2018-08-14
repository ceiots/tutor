package ssm.entity;

public class Orders {

	    private String orderNum; 
	    private Integer orderStatus; 
	    private String createTime; 
	    private String finishTime; 
	    private String tutorName; 
	    private String parentName; 
	    
	    public Orders(){
	    	
	    }
	  
		public Orders(String orderNum, Integer orderStatus, String createTime, String finishTime, String tutorName,
				String parentName) {
			super();
			this.orderNum = orderNum;
			this.orderStatus = orderStatus;
			this.createTime = createTime;
			this.finishTime = finishTime;
			this.tutorName = tutorName;
			this.parentName = parentName;
		}

		public String getOrderNum() {
			return orderNum;
		}

		public void setOrderNum(String orderNum) {
			this.orderNum = orderNum;
		}

		public Integer getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(Integer orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getCreateTime() {
			return createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFinishTime() {
			return finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getTutorName() {
			return tutorName;
		}

		public void setTutorName(String tutorName) {
			this.tutorName = tutorName;
		}

		public String getParentName() {
			return parentName;
		}

		public void setParentName(String parentName) {
			this.parentName = parentName;
		}

		@Override
		public String toString() {
			return "[orderNum: " + orderNum + ", orderStatus: " + orderStatus + ", createTime: " + createTime 
					+ "finishTime: " + finishTime + ", tutorName: " + tutorName + ", parentName: " + parentName + "]";
		} 
} 

