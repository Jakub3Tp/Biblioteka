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
        for (Ksiazka k: ksiazki){
           if (autor.equals(Egzemplarz.Stan.Wolny)){

           }
        }
        return null;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku(Gatunek gatunek){
        for (Ksiazka k: ksiazki){

        }
        return null;
    }
    public Egzemplarz znajdzEgzemplarzKsiazki(Ksiazka ksiazka){
        for (Egzemplarz e: egzemplarze){
            if(Egzemplarz.Stan.Wolny){

            }
        }
        return null;
    }
}
