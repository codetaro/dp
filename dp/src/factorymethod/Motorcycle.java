package factorymethod;

public class Motorcycle implements Vehicle {

    public Motorcycle(){
    	/* constructor is protected.
 	       clients need to use the factory method */
    }

    @Override
    public void design(){
    	System.out.println("Designing Motorcycle");
    }

    @Override
    public void manufacture(){
    	System.out.println("Manufacturing Motorcycle");
    }

}
