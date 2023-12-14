package enumm;

public class EnumExample {
    enum Ngjyra {
        KUQE("te kuqe"),
        BLU("te kaltert"),
        VERDHE("te verdh"),
        ZI("te zez");

        private final String pershkrimi;

        Ngjyra(String pershkrimi) {
            this.pershkrimi = pershkrimi;
        }

        public String getPershkrimi() {
            return pershkrimi;
        }
    }

    public static void main(String[] args) {
        Ngjyra ngjyra1 = Ngjyra.KUQE;
        Ngjyra ngjyra2 = Ngjyra.ZI;
        System.out.println("Flamuri yne ka ngjyr " + ngjyra1.getPershkrimi() +" dhe " + ngjyra2.pershkrimi );
    }
}
