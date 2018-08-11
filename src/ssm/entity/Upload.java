package ssm.entity;

public class Upload {

	    private String userId; // 主键
	    private byte[] photo1; 
	    private byte[] photo2; 
	    private byte[] photo3; 
	    private byte[] video1;
	    private byte[] video2;
	    private byte[] video3;
		
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public byte[] getPhoto1() {
			return photo1;
		}

		public void setPhoto1(byte[] photo1) {
			this.photo1 = photo1;
		}

		public byte[] getPhoto2() {
			return photo2;
		}

		public void setPhoto2(byte[] photo2) {
			this.photo2 = photo2;
		}

		public byte[] getPhoto3() {
			return photo3;
		}

		public void setPhoto3(byte[] photo3) {
			this.photo3 = photo3;
		}

		public byte[] getVideo1() {
			return video1;
		}

		public void setVideo1(byte[] video1) {
			this.video1 = video1;
		}

		public byte[] getVideo2() {
			return video2;
		}

		public void setVideo2(byte[] video2) {
			this.video2 = video2;
		}

		public byte[] getVideo3() {
			return video3;
		}

		public void setVideo3(byte[] video3) {
			this.video3 = video3;
		}

		@Override
		public String toString() {
			return "Picture [userId: " + userId + ", photo1: " + photo1 + ", photo2: " + photo2 + ", photo3: " + photo3 
					+ " , video1: " + video1 + " , video2: " + video2 + " , video3: " + video3 + "]";
		} 
}
