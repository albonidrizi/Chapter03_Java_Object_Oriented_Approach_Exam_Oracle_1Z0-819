package enumm;

public class Aircraft {
    private final int altitudeFl=300;
    private final boolean isRvsmCapable=true;
    private class VerticalSeparation {
        private int separationInFeet;
        VerticalSeparation() {
            if (altitudeFl >= 290 && altitudeFl <= 410 && isRvsmCapable) { separationInFeet = 1000;} else { separationInFeet = 2000; }
        }
        public int getSeparationInFeet() { return separationInFeet; }
    }
    public int getSeparationFeet() {
        VerticalSeparation vsep = new VerticalSeparation();
        return vsep.getSeparationInFeet();
    }


    public int localGetSeparationFeet() {
        class VerticalSeparation { // No access modifier
            private int separationInFeet =3;
            VerticalSeparation() {
                if (altitudeFl >= 290 && altitudeFl <= 410 && isRvsmCapable) { separationInFeet = 1000; }
                else { separationInFeet = 2000; }
            }
            public int getSeparationInFeet() { return separationInFeet; }
        }
        VerticalSeparation vsep = new VerticalSeparation();
        return vsep.getSeparationInFeet(); // Must be instantiated in same block
    }

}
