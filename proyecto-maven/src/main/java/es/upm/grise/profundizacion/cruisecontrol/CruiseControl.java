package es.upm.grise.profundizacion.cruisecontrol;
public class CruiseControl {
	
	@SuppressWarnings("unused")
	private Speedometer speedometer;
	private Integer speedSet;
	private Integer speedLimit;

	/*
	 * Constructor
	 */
	public CruiseControl(Speedometer speedometer) {
		
		this.speedometer = speedometer;
		this.speedSet = null;
		this.speedLimit = null;
	}

    public CruiseControl() {
    }
	
	/*
	 * Method to test
	 */
	public void setSpeedSet(int speedSet) throws SpeedSetAboveSpeedLimitException, IncorrectSpeedSetException {
		
		if(speedSet <= 0 )
			throw new IncorrectSpeedSetException();
		
		if(speedLimit != null) {
			if(speedSet > speedLimit)
				throw new SpeedSetAboveSpeedLimitException();
		}
		
		this.speedSet = speedSet;
	}

	/*
	 * Other setters & getters
	 */
	public Integer getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(Integer speedLimit) {
		this.speedLimit = speedLimit;
	}

	public Integer getSpeedSet() {
		return speedSet;
	}

}
