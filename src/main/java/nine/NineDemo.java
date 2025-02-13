package nine;

/*
 * UVOD.
 * Postoje tipovi podataka:
 * 1. PROSTI
 * 2. SLOŽENI
 *   2.1 RAW TYPE(sirovi složeni)
 *   2.2 P
 *
 */

import nine.collection.intro.Box;

import java.util.Collection;

public class NineDemo {
    public static void main(String[] args) {
        //RAW TYPE
        Box sirovaKutija = new Box();
        //PARAMETRIZIRANU kutiju
        Box<String, Integer> novaKutija = new Box<>();
        Box<Double, Integer> brojevnaKutija = new Box<>();
        Box<String, String> tekstualnaKutija = new Box<>();



    }
}
