import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> fibonacci() {
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int index =2;
        while(fibo.size()<40){
            fibo.add(fibo.get(index-1)+ fibo.get(index-2));
            index++;
        }
        System.out.println(fibo);
        return fibo;
    }
    public static String szyfrCezara(String slowo, int klucz){
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String alfabetPrzesuniety = alfabet.substring(klucz)+alfabet.substring(0,klucz);
        String szyfr = "";
        for (int i = 0; i <slowo.length() ; i++) {
            szyfr = szyfr+alfabetPrzesuniety.charAt(i);

        }
        return szyfr;
    }
    public static Integer wyszukiwanieBinarne(ArrayList<Integer> ListaDoWyszukiwaniaBina,
                                              int szukana){
        int liczba =0;
        int poczatek = 0;
        int koniec = ListaDoWyszukiwaniaBina.size()-1;
        while (koniec - poczatek>1){
        int srodek = (poczatek+koniec)/2;
        if (ListaDoWyszukiwaniaBina.get(srodek)>=szukana){
            koniec = srodek;
        }
        else {
            poczatek = srodek;
        }
        }
        int roznica1 = szukana-ListaDoWyszukiwaniaBina.get(poczatek);
        int roznica2 = ListaDoWyszukiwaniaBina.get(koniec) - szukana;
        if (roznica1>roznica2){
            liczba = ListaDoWyszukiwaniaBina.get(koniec);
        }
        else{
            liczba = ListaDoWyszukiwaniaBina.get(koniec);
        }
        return liczba;
    }
    public static boolean czyPalindrom(String slowo){
        String slowoOdKonca = "";
        for (int i = 0; i <slowo.length() ; i++) {
            slowoOdKonca = slowo.charAt(i)+slowoOdKonca;

        }
        if (slowo.equals(slowoOdKonca)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static Integer liczbaPalindromiczna(Integer liczba){
        Integer pomoc = liczba;
        Integer pomoc2 = liczba;
        while (!czyPalindrom(liczba.toString())){
            liczba++;
        }

        while (!czyPalindrom(pomoc2.toString())){
            pomoc2--;
        }
        return liczba - pomoc > pomoc - pomoc2 ? pomoc2: liczba;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer>fibki = fibonacci();
        System.out.println(wyszukiwanieBinarne(fibki, 54));
        System.out.println(czyPalindrom("kajak"));
        System.out.println(liczbaPalindromiczna(790));
        System.out.println(szyfrCezara("abc",3));
    }
}