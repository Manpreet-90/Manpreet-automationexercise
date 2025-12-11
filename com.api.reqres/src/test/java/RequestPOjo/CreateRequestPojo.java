package RequestPOjo;

public class CreateRequestPojo {
	public CreateRequestPojo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	private String email;
	@Override
	public String toString() {
		return "CreateRequestPojo [email=" + email + ", password=" + password + "]";
	}
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
