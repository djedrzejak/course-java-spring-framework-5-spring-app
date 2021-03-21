package main.error;

public class TourNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TourNotFoundException(String message) {
		super(message);
	}
	
}
