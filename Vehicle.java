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
	
	
	public Vehicle(String brand){
		this.brand = brand;
		this.kilometers = 100;
	}
	
	public Vehicle(int kilometers){
		this.brand = "amine";
		this.kilometers = kilometers;
	}
	
	
	public Vehicle(String brand){
		this.brand = brand;
	}
	
	public Vehicle(String kilometers){
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