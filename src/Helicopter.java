public class Helicopter extends Aircraft{

    public Helicopter(String manufacturer, int maxSpeed, int maxAltitude){
        super(manufacturer,maxSpeed,maxAltitude);
    }

    @Override
    public void fly(){
        System.out.println("The helicopter is flying");
    }

    public void hover(){
        System.out.println("The helicopter is hovering.");
    }

}
