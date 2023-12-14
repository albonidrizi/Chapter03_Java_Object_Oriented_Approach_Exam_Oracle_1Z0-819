// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("*********************************");

        Helicopter helicopter  = new Helicopter("Boeing",200, 5000);
        helicopter.fly();
        helicopter.hover();
        System.out.println("*********************************");

        Airplane airplane = new Airplane("Airbus",600,10000);
        airplane.takeoff();
        airplane.turn();
        airplane.land();
        System.out.println("**********************************");

        JetFighter jetFighter = new JetFighter("Lockheed Martin",1200,15000);
        jetFighter.firMissile();
        jetFighter.evasiveManeuver();
        jetFighter.land();
        jetFighter.emergencyProtocol();
        JetFighter jetFighter2 = new JetFighter("Lockheed Martin",1200,15000);
        JetFighter jetFighter3 = new JetFighter("Lockheed Martin",1200,15000);
        JetFighter jetFighter4 = new JetFighter("Lockheed Martin",1200,15000);
        System.out.println("**********************************");

        int numberOfJetFighters =  JetFighter.getNumberOfJetFighters();

        System.out.println("Toral jet fighters created: "+numberOfJetFighters);


    }
}