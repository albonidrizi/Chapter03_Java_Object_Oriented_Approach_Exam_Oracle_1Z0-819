public interface CombatReady {

    void firMissile();

    void evasiveManeuver();

    default void emergencyProtocol() {
        System.out.println("Fillo protokollin e emergjences");
    }

}
