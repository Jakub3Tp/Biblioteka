import java.util.Objects;

public class Ksiazka {
    private String tytul;
    private Autor autor;
    private Gatunek gatunek;
    private int rokWydania;

    public Ksiazka(String tytul, Autor autor, Gatunek gatunek, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    @Override
    public String toString(){
        return String.format("%s; %s; %d", autor.toString(), tytul, rokWydania);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return rokWydania == ksiazka.rokWydania && Objects.equals(tytul, ksiazka.tytul) && Objects.equals(autor, ksiazka.autor) && gatunek == ksiazka.gatunek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, autor, gatunek, rokWydania);
    }
}
