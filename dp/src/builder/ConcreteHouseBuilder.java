package builder;

/**
 * 
 */
public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;
	
    /**
     * Default constructor
     */
    public ConcreteHouseBuilder() {
    	house = new House();
    }


    /**
     * 
     */
    public HouseBuilder buildFloor() {
        house.setFloorType("concrete");
        return this;
    }

    /**
     * 
     */
    public HouseBuilder buildWall() {
        house.setWallType("concrete");
        return this;
    }

    /**
     * 
     */
    public HouseBuilder buildRoof() {
        house.setRoofType("concrete");
        return this;
    }

    /**
     * 
     */
    public House build() {
        return house;
    }

}