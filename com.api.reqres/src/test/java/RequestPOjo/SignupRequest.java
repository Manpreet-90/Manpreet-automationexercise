package RequestPOjo;

public class SignupRequest {
	
	
	  public SignupRequest(String name, String job) {
		super();
		this.name = name;
		this.job = job;
		
	}
	  public String getName() {
		return name;
	}



	  public void setName(String name) {
		  this.name = name;
	  }



	  public String getJob() {
		  return job;
	  }



	  public void setJob(String job) {
		  this.job = job;
	  }
	  @Override
	public String toString() {
		return "SignupRequest [name=" + name + ", job=" + job + "]";
	}
	  private String  name ;
	  private String  job ;
	 
	  
	
	public static class Builder  //no constructor only methods (setter methods) builderclass pattern
	{
		 private String  name ;
		  private String  job ;
	
		  
		  public Builder Name(String name) {
			  this.name = name;
			  return this;
		  }
		  
		  public Builder job(String job) {
			  this.job = job;
			  return this;
		  }
		
		  
		  public SignupRequest Build()   //create object of upper class always return something
		  {
			  SignupRequest signuprequets=new SignupRequest(name,job);
			  return signuprequets;
		  }
		  
	}

}
