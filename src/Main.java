import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("Menu \n" +
                    "1. Dodaj egzemplarz książki \n" +
                    "2. Wyporzycz książke \n" +
                    "3. Oddaj książke \n" +
                    "4. Wyswietl książki autora \n" +
                    "5. Koniec");

            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor){
                case 1:
                    biblioteka.dodajKsiazke();
                    break;
                case 2:
                    //1 znajdź ksiązke
                    //2 wyporzycz (o ile jest wolny)
                    System.out.println("Podaj Tytul");
                    String tytul = scanner.nextLine();
                    Ksiazka k = biblioteka.znajdzKsiazke(tytul);
                    if (k == null){
                        break;
                    }

                    Egzemplarz egzemplarz = biblioteka.znajdzEgzemplarzKsiazki(k);
                    Wypozyczenie wypozyczenie = new Wypozyczenie(egzemplarz);
                    Egzemplarz.setStan(Egzemplarz.Stan.Wypozyczony);
                    break;
                case 3:
                    System.out.println("Podaj książke którą chcesz oddać");
                    Ksiazka k = biblioteka.znajdzKsiazke(tytul);
                    if (k.equals(Egzemplarz.Stan.Wypozyczony)){
                        Wypozyczenie oddac = new Wypozyczenie(wypozyczenie);

                    }
                    break;
                case 4:
                    biblioteka.znajdzKsiazkiAutora();
                    break;
                case 5:
                    return;
            }
        }
    }
}