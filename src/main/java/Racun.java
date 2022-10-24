public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;

    Racun(Osoba korisnikRacuna){
        brojRacuna=(long) Math.random();
    }

    boolean izvrsiUplatu(double uplata){
        stanjeRacuna=stanjeRacuna+uplata;
        return true;
    }
    boolean izvrsiIsplatu(double isplata){
        if(isplata<=stanjeRacuna || odobrenjePrekoracenja==true){
            stanjeRacuna=stanjeRacuna-isplata;
            return true;
        }
        return false;
    }

    boolean provjeriOdobrenjePrekoracenja(double broj){
        return odobrenjePrekoracenja;
    }

    void odobriPrekoracenje(double broj) {
        odobrenjePrekoracenja=true;
    }

}
