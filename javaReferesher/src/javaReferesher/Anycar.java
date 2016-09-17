package javaReferesher;

public class Anycar<T> {
	private String car ;  
	private String make ;  
	private String miles ;  
	public String setMake(String make) {   
	return this.make = make;  
	}  
	public void setCar(String name) 
	{   
	this.car = name;  
	}  
	public String setMiles(String miles) 
	{   
	return this.miles = miles;  
	}  
	public <T> T makeCar(Class<T> t) throws InstantiationException, IllegalAccessException
	{   
	return t.newInstance();  
	} 	 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {    
		System.out.println("Lets make a car first");  
		Anycar<car> carMakingFactory = new Anycar<>();    
		carMakingFactory.setMake("2016");
		carMakingFactory.setCar("Maruthi");
		carMakingFactory.setMiles("27");
		car Maruthi = carMakingFactory.makeCar(car.class);
		Maruthi.drive();
		Maruthi.stop();
		Maruthi.park();
		}
	
}
class car{ 
public void drive(){  
System.out.println("car is going on the road"); 
}  
public void stop(){  
System.out.println("Stopped !"); 
} 
public void park(){  
System.out.println("car is parked"); 
} 
} 
