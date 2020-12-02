
public class Team {
	
	private String name;
	private String message;
	private String firstMessage;
	private int order;
	
	
	
	
	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public Team(String name, String firstMessage, String message) {
		super();
		this.name = name;
		this.message = message;
		this.firstMessage = firstMessage;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFirstMessage() {
		return firstMessage;
	}
	
	

}
