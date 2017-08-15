package client;

import builder.ConcreteHouseBuilder;
import builder.HouseBuilder;
import builder.HouseBuilderDirector;
import builder.WoodenHouseBuilder;

/**
 * 
 */
public class BuilderClient {

    /**
     * 
     */
    public static void main(final String[] arguments) {
        // Construct a concrete house
    	HouseBuilder builder = new ConcreteHouseBuilder();
    	HouseBuilderDirector houseBuilderDirector = new HouseBuilderDirector(builder);
    	System.out.println(houseBuilderDirector.construct());
    	
    	// Construct a wooden house
    	builder = new WoodenHouseBuilder();
    	houseBuilderDirector = new HouseBuilderDirector(builder);
    	System.out.println(houseBuilderDirector.construct());
    }

}