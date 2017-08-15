package builder;

/**
 * 
 */
public class HouseBuilderDirector {

	private HouseBuilder builder;
	
    public HouseBuilderDirector(final HouseBuilder builder) {
    	this.builder = builder;
    }

    /**
     * 
     */
    public House construct() {
        // call the necessary methods and return the consistent object
    	return builder.buildFloor().buildWall().buildRoof().build();
    }

}