import javax.swing.*;
import java.util.ArrayList;



public class LjubavniKalkulator01 {
    ArrayList<Integer> lista = new ArrayList<>();
    ArrayList<Integer> lista2 = new ArrayList<>();
    ArrayList<Integer> zavrsnaLista = new ArrayList<>();
    String strZavrsnaLista;
    public LjubavniKalkulator01(String ime1, String ime2) {

        System.out.println("Prvo ime: " + ime1 + "; drugo ime: " + ime2);

        lista = pretvoriImeUNizBrojeva(ime1.toLowerCase(), ime2.toLowerCase());
        System.out.println(lista);

        if (ime1.length() == ime2.length() || ime1.length() < ime2.length()) {
            lista2 = ispisiPrvuPravilnuListu(ime1.toLowerCase(), ime2.toLowerCase(), lista);
        }

        if (ime1.length() > ime2.length()) {
            lista2 = ispisiPrvuPravilnuListu2(ime1.toLowerCase(), ime2.toLowerCase(), lista);
        }

        zavrsnaLista = LjubavniKalkulator02.rekurzija(lista2);
        strZavrsnaLista = zavrsnaLista.toString();
    }

    private ArrayList<Integer> ispisiPrvuPravilnuListu(String ime1, String ime2, ArrayList<Integer> lista) {
        ArrayList<Integer> lista2 = new ArrayList<>();
        char[] niz1 = ime1.toCharArray();
        char[] niz2 = ime2.toCharArray();

        for (int i = 0, p = 0, m = lista.size() - 1; i < niz1.length; i++, p++, m--) {
            lista2.add(lista.get(p) + lista.get(m));
        }

        for (int i = niz1.length; i < lista.size() - niz1.length; i++) {
            lista2.add(lista.get(i));
        }

        return lista2;

    }

    public static ArrayList<Integer> ispisiPrvuPravilnuListu2(String ime1, String ime2, ArrayList<Integer> lista) {
        // Ako je ime1 ve�e od ime2, tj du�e
        ArrayList<Integer> lista2 = new ArrayList<>();
        char[] niz1 = ime1.toCharArray();
        char[] niz2 = ime2.toCharArray();

        for (int i = 0, p = 0, m = lista.size() - 1; i < ime2.length(); i++, p++, m--) {
            lista2.add(lista.get(p) + lista.get(m));
        }

        for (int i = niz2.length; i < lista.size() - niz2.length; i++) {
            lista2.add(lista.get(i));
        }

        return lista2;
    }

    String spojImena;

    private ArrayList<Integer> pretvoriImeUNizBrojeva(String ime1, String ime2) {
        ArrayList<Integer> lista = new ArrayList<>();
        spojImena = ime1 + ime2;

        char[] niz = spojImena.toCharArray();

        int p;
        for (int i = 0; i < niz.length; i++) {
            p = 0;
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    p++;
                }
            }
            lista.add(p);
        }
        return lista;
    }
}
