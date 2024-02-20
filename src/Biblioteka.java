import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    private ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    private ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void dodajKsiazke() {
        System.out.println("Podaj gatunek");
        String tytul = scanner.nextLine();
        System.out.println("Podaj gatunek");
        Gatunek gatunek = switch (scanner.nextLine()) {
            case "horror" -> Gatunek.Horror;
            case "fantastyka" -> Gatunek.Fantasy;
            case "kryminal" -> Gatunek.Kryminal;
            case "satyra" -> Gatunek.Satyra;
            case "biografia" -> Gatunek.Biografia;
            default -> null;
        };
        System.out.println("Podaj rok wydania");
        int rokWydania = Integer.parseInt(scanner.nextLine());
        Autor autor = dodajAutora();
        Ksiazka ksiazka = new Ksiazka(tytul, autor, gatunek, rokWydania);
        if(!ksiazki.contains(ksiazka)){
            ksiazki.add(ksiazka);
        }

        Egzemplarz egzemplarz = new Egzemplarz();
        egzemplarz.setKsiazka(ksiazka);
        egzemplarz.setStan(Egzemplarz.Stan.Wolny);
        egzemplarze.add(egzemplarz);
    }

    public Autor dodajAutora() {
        System.out.println("Podaj imie autora");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko autora");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj rok urodzenia");
        int rokUrodzenia = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj rok smierci autora (0 jesli żyje)");
        int rokSmierci = Integer.parseInt(scanner.nextLine());
        return new Autor(imie, nazwisko, rokUrodzenia, rokSmierci);
    }

    public Ksiazka znajdzKsiazke( String tytul) {
        for (Ksiazka k : ksiazki) {
            if (k.getTytul().equals(ksiazki tytul)) {
                return k;
            }
        }

        public ArrayList<Ksiazka> znajdzKsiazkiAutora (Autor autor){
            ArrayList<Ksiazka> wynik = new ArrayList<>();
            for (Ksiazka k : ksiazki) {
                if (k.getAutor().equals(autor)) {
                    wynik.add(k);
                }
                return null;
            }

            public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku (Gatunek gatunek){
                ArrayList<Ksiazka> wynik = new ArrayList<>();
                for (Ksiazka k : ksiazki) {
                    if (k.getGatunek() == gatunek) {
                        wynik.add(k);
                    }
                    return null;
                }
                public Egzemplarz znajdzEgzemplarzKsiazki (Ksiazka ksiazka){
                    for (Egzemplarz e : egzemplarze) {
                        if (e.getKsiazka().equals(ksiazki) && e.getStan() == Egzemplarz.Stan.Wolny) {
                            return e;
                        }
                        return null;
                    }
                }
            }
        }
    }
}