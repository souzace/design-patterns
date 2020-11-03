public class Originator {
	
	private String content;
	
	public String getContent() {
		return content;
	}	

	public void setContent(String content) {
		this.content = content;
	}

	public Memento createState() {
		return new Memento(content);
	}

	public void restore(Memento state) {
		content = state.getContent();
	}
	
}
