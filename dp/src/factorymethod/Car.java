package factorymethod;

public class Car implements Vehicle {

    Car(){
    	/* constructor is protected.
    	   clients need to use the factory method */
    }

    @Override
    public void design(){
    	System.out.println("Design Car");
    }

    @Override
    public void manufacture(){
    	System.out.println("Manufacturing Car");
    }

}
