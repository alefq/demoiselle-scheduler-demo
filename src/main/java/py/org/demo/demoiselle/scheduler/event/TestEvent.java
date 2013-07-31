package py.org.demo.demoiselle.scheduler.event;

public class TestEvent {
	private final String message;

	public TestEvent(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}