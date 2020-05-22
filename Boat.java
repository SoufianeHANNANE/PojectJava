public class Boat extends Vehicle {
	 public Boat(String name,int kilometers) {  
        super(name, kilometers);
	}
	
	//@Override  
    public String doStuff() {  
        return "Je suis " + this.getbrand() + " et je fais glou glou !";  
    }
}