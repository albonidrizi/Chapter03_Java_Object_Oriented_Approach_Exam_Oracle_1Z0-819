public class Airplane extends Aircraft {

    public Airplane(String manufacturer, int maxSpeed, int maxAltitude ){
        super(manufacturer,maxSpeed,maxAltitude);
    }

    @Override
    public void fly() {
        System.out.println("The airplane is flying");
    }

    public void takeoff(){
        System.out.println("The airplane is taking off.");
    }
}
