package ResponsePOjo;

public class CreateResponsejava {
	private String token;

	
	public CreateResponsejava() {
        // Empty constructor required for Jackson deserialization
    }

	@Override
	public String toString() {
		return "CreateResponsejava [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public CreateResponsejava(String token) {
		super();
		this.token = token;
	}
	

}
