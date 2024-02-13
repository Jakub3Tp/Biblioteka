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
}
