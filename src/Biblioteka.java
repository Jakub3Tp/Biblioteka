import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();

    public void dodajKsiazke(){
        // TODO dodanie nowego egzemplarza ksiazki. Jesli ksiazki juz istnieje wez referencje w przeciwnym
        // TODO przypadku stworz nowa ksiazke
    }

    public Ksiazka znajdzKsiazke (String tytul){
        return null;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiAutora(Autor autor){
        ArrayList<Ksiazka> KsiazkiAutora = new ArrayList<>();
        for (Ksiazka k : ksiazki) {
            if (k.getAutor().equals(autor)) {
                KsiazkiAutora.add(k);
            }
        }
        return KsiazkiAutora;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku(Gatunek gatunek){
        ArrayList<Ksiazka> ksiazkaPoGatunku = new ArrayList<>();
        for (Ksiazka k : ksiazki) {
            if (k.getGatunek().equals(gatunek)) {
                ksiazkaPoGatunku.add(k);
            }
        }
        return ksiazkaPoGatunku;

    }
    public Egzemplarz znajdzEgzemplarzKsiazki(Ksiazka ksiazka){
        for (Egzemplarz e : egzemplarze) {
            if (e.getKsiazka().equals(ksiazka) && e.getStan() == Egzemplarz.Stan.Wolny) {
                return e;
            }
        }
        return null;
    }
}
