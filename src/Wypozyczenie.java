import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Wypozyczenie {

    private static final int dlugosc = 30;
    //Nie robić ale to jest wypadek
    private static double stawka = 0.1;
    private Egzemplarz egzemplarz;
    private LocalDate dataWypozyczenia;
    private LocalDate dataOddania;
    private LocalDate planowanaDataOddania;

    public Wypozyczenie(Egzemplarz egzemplarz) {
        this.egzemplarz = egzemplarz;
        dataWypozyczenia = LocalDate.now();
        planowanaDataOddania = dataWypozyczenia.plusDays(dlugosc);
        egzemplarz.setStan(Egzemplarz.Stan.Wypozyczony);
    }

    public double oddaj(){
        dataOddania = LocalDate.now();
        egzemplarz.setStan(Egzemplarz.Stan.Wolny);
        if (dataOddania.isAfter(planowanaDataOddania)){
            int dni = (int) DAYS.between(dataOddania, dataWypozyczenia);
            return dni*stawka;
        }
        return 0;
    }
}
