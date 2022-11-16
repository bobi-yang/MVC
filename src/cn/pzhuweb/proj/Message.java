package cn.pzhuweb.proj;

public class Message {
	public boolean success;
	public String mSg;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getmSg() {
		return mSg;
	}
	public void setmSg(String mSg) {
		this.mSg = mSg;
	}
	public Message(boolean success, String mSg) {
		super();
		this.success = success;
		this.mSg = mSg;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
}
