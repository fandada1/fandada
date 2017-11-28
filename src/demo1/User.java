package demo1;

public class User {
	private int userId;
	private int userNumber;
	private String userName;
	private String userPwd;
	private int userGendar;
	private int userVIPLeve;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserGendar() {
		return userGendar;
	}
	public void setUserGendar(int userGendar) {
		this.userGendar = userGendar;
	}
	public int getUserVIPLeve() {
		return userVIPLeve;
	}
	public void setUserVIPLeve(int userVIPLeve) {
		this.userVIPLeve = userVIPLeve;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public User(int userId) {
		super();
		this.userId = userId;
		
	}

	public User(int userId, int userNumber,String userName, String userPwd, int userGendar, int userVIPLeve) {
		super();
		this.userId = userId;
		this.userNumber = userNumber;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userGendar = userGendar;
		this.userVIPLeve = userVIPLeve;
	}
	
	public User(int userId,int userNumber, String userName, String userPwd) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userGendar = 1;
		this.userVIPLeve = 1;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ",userNumber ="+userNumber+",userName=" + userName +",userPwd="+ userPwd +",userGendar="
				+userGendar +",userVIPLeve="+ userVIPLeve+"]";
	}

}
