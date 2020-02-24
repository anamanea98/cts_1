package eu.ase.ro;

public class Wolf implements Runner {
	private final int WOLF_SPEED = 50;

	public Wolf(){}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return WOLF_SPEED;
	}

	@Override
	public String toString() {
		return "Wolf [WOLF_SPEED=" + WOLF_SPEED + "]";
	}
	
	
	
	
}
