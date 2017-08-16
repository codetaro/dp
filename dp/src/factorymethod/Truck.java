package factorymethod;

public class Truck implements Vehicle {

    Truck(){
    	/* constructor is protected.
 	       clients need to use the factory method */
    }

    @Override
    public void design(){
    	System.out.println("Designing Truck");
    }

    @Override
    public void manufacture(){
    	System.out.println("Manufacturing Truck");
    }

}
