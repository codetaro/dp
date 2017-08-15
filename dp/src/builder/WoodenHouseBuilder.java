package builder;

/**
 * 
 */
public class WoodenHouseBuilder implements HouseBuilder {

	private House house;
	
    /**
     * Default constructor
     */
    public WoodenHouseBuilder() {
    	house = new House();
    }


    /**
     * 
     */
    public HouseBuilder buildFloor() {
        house.setFloorType("wood");
        return this;
    }

    /**
     * 
     */
    public HouseBuilder buildWall() {
        house.setWallType("wood");
        return this;
    }

    /**
     * 
     */
    public HouseBuilder buildRoof() {
        house.setRoofType("wood");
        return this;
    }

    /**
     * 
     */
    public House build() {
        return house;
    }

}