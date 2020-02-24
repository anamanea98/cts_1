package eu.ase.ro;

public class Grizzly extends Bear {
	private final int GRIZZLY_SPEED = 10;

	public Grizzly() {
		super();
	}
	
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return GRIZZLY_SPEED;
	}

	@Override
	public String toString() {
		return "Grizzly [GRIZZLY_SPEED=" + GRIZZLY_SPEED + "]";
	}

}
