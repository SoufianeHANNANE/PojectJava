public class Car extends Vehicle {
	
	public Car(String name,int kilometers) {  
        super(name, kilometers); 
    }
	
	//@Override
    public String doStuff() {  
        return "Je suis " + this.getbrand() + " et je fais vroum vroum !";  
    }

}