public class Hangar{  
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes"); 
        Boat ussSlingshot = new Boat("UssSlingshot");
        
        System.out.print(mercedes.doStuff() + "\n");
        System.out.print(ussSlingshot.doStuff());
    }
}