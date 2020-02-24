package eu.ase.ro;

public class PolarBear extends Bear {
	private final int POLAR_BEAR_SPEED = 40;
	
	public PolarBear() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "PolarBear [POLAR_BEAR_SPEED=" + POLAR_BEAR_SPEED + "]";
	}



	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return POLAR_BEAR_SPEED;
	}

}
