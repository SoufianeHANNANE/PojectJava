public abstract class Vehicle {
    //-----------------------------------------------------
	//les atributs
    //-----------------------------------------------------
	private String brand; 
	private int kilometers;
	
	
	
    //-----------------------------------------------------
	//les méthodes
    //-----------------------------------------------------
	
	// constructeurs
	public Vehicle(String brand, int kilometers){
		this.brand = brand;
		this.kilometers = kilometers;
	}
	
	
	// accesseurs et mutateurs 
	 
    public String getbrand() {  
        return this.brand;  
    }  

    public void setbrand(String brand) {  
        this.brand = brand;  
    }  

    public int getkilometers() {  
        return this.kilometers;  
    }  

    public void setkilometers(int kilometers) {
        this.kilometers = kilometers;
    }
	
	public abstract String doStuff();
}