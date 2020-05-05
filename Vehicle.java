public abstract class Vehicle {  
    public String brand;
    private int kilometers;

    // Constructors
    public Vehicle (String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // Getters
    public String getBrand() {  
        return this.brand;  
    }  
  
    public int getKilometers() {  
        return this.kilometers;  
    }  
  
    // Setters
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public void setBrand(String brand) {  
        this.brand = brand;  
    } 

    public abstract String doStuff();
}