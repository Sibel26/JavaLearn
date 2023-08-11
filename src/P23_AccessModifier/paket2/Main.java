package P23_AccessModifier.paket2;

import P23_AccessModifier.paket1.*;

public class Main {
    public static void main(String[] args) {
        Veriler veriler = new Veriler();
        veriler.selam();
        veriler.selam();
    }

    public static class child {
        // inner class // child class
    }
}
