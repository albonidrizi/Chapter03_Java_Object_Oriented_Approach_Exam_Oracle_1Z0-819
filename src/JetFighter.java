public class JetFighter extends Airplane implements CombatReady {

    private  static int numberOfJetFighters = 0;

    public JetFighter(String manufacturer, int maxSpeed, int maxAltitude){
        super(manufacturer,maxSpeed,maxAltitude);
        numberOfJetFighters++;
    }

    @Override
    public void firMissile(){
        System.out.println("Firing missile!");
    }

    @Override
    public void evasiveManeuver(){
        System.out.println("Preforming evasive maneuver");
    }

    @Override
    public void emergencyProtocol() {
        System.out.println("Mos fillo me protokollin e emergjences");
    }

    public void engageEnemy(){
        System.out.println("Engaging enemy!");
    }

    public static int getNumberOfJetFighters(){
        return numberOfJetFighters;
    }

}

