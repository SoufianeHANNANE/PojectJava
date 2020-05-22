public class Hangar {
    public static void main(String[] args) {
    	Car Merco = new Car("cla",12555);
		Boat maritime = new Boat("speed",5545);
    	System.out.println(Merco.doStuff());
    	System.out.println(maritime.doStuff());
    }
}