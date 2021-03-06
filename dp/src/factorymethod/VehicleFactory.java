package factorymethod;

public class VehicleFactory {

	/*
	 * This is the factory method exposed to the client. Client requests for an
	 * object by passing the type. Client does not need to know about which & how
	 * object is created internally.
	 */
	public Vehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException {

		if (vehicleType == null) {
			return null;
		}

		Vehicle vehicle = null;

		switch (vehicleType) {
		case "car":
			vehicle = new Car();
			break;
		case "truck":
			vehicle = new Truck();
			break;
		case "motorcycle":
			vehicle = new Motorcycle();
			break;
		default:
			throw new VehicleTypeNotFoundException();
		}

		return vehicle;
	}

}
