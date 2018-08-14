package ssm.entity;

import java.sql.Timestamp;

public class ChatRecord {

	    private String userId; 
	    private String toUserId; 
	    private String message; 
	    private Timestamp time;
	    private String status;
		
	    public ChatRecord(){
	    	
	    }

		public ChatRecord(String userId, String toUserId, String message, Timestamp time, String status) {
			super();
			this.userId = userId;
			this.toUserId = toUserId;
			this.message = message;
			this.time = time;
			this.status = status;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}



		public String getToUserId() {
			return toUserId;
		}



		public void setToUserId(String toUserId) {
			this.toUserId = toUserId;
		}



		public String getMessage() {
			return message;
		}



		public void setMessage(String message) {
			this.message = message;
		}



		public Timestamp getTime() {
			return time;
		}



		public void setTime(Timestamp time) {
			this.time = time;
		}



		public String getStatus() {
			return status;
		}



		public void setStatus(String status) {
			this.status = status;
		}



		@Override
		public String toString() {
			return " [userId: " + userId + ", toUserId: " + toUserId + ", message: " + message 
					+ " , time: " + time + " , stauts: " + status + "]";
		} 
}
