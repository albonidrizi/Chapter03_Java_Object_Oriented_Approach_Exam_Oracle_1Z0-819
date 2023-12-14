public abstract class Aircraft {

    private String manufacturer;
    private int maxSpeed;
    private int maxAltitude;

    public Aircraft(String manufacturer, int maxSpeed, int maxAltitude){
        this.manufacturer = manufacturer;
        this.maxSpeed =maxSpeed;
        this.maxAltitude = maxAltitude;
    }

    public abstract void fly();

    public void land(){
        System.out.println("This aircraft is landing.");
    }

    public void turn(){
        System.out.println("The aircraft is turning");
    }
}
