public class Autor {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int rokSmerci;

    public Autor(String imie, String nazwisko, int rokUrodzenia, int rokSmerci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.rokSmerci = rokSmerci;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public int getRokSmerci() {
        return rokSmerci;
    }

    public void setRokSmerci(int rokSmerci) {
        this.rokSmerci = rokSmerci;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%d-%d)", nazwisko, imie, rokUrodzenia, rokSmerci );
    }
}
