package ssm.pojo;

public class JsonToWeb {
    private String status;
    private String message;
    private int errorCode;
    private boolean result;
    private Object resultInfo;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Object getResultInfo() {
		return resultInfo;
	}
	public void setResultInfo(Object resultInfo) {
		this.resultInfo = resultInfo;
	}
	
	public JsonToWeb(String status, String message, int errorCode, boolean result, Object resultInfo) {
		this.status = status;
		this.message = message;
		this.errorCode = errorCode;
		this.result = result;
		this.resultInfo = resultInfo;
	}
	@Override
	public String toString() {
		return "{"+"\n" + "status: " + status + ", message: " + message + ", errorCode: " + errorCode + ", result: "
				+ result + ", resultInfo: " + resultInfo + "\n" + "}";
	}
    
}
