import java.util.List;

public class Banka {
    private long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;

    public Banka () {
        brojRacuna = (long) Math.random();
    }

    public void kreirajNovogKorisnika(String ime, String prezime) {
        korisnici.add(new Korisnik(ime, prezime));
    }

    public void kreirajNovogUposlenika(String ime, String prezime) {
        uposlenici.add(new Uposlenik(ime, prezime));
    }

    public void kreirajRacunZaKorisnika(Korisnik korisnik){
        Racun r=new Racun(korisnik);
    }

}
