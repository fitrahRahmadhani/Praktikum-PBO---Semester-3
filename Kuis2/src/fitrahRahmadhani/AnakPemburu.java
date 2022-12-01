package fitrahRahmadhani;

public class AnakPemburu extends Pemburu implements IMengambilTelur{

    AnakPemburu(String name) {
        super(name);
    }

    @Override
    public void berburu(TyrannosaurusRex trex){
        System.out.println(this.name + " membantu ayahnya berburu trex");
    }

    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println(this.name + " ditugaskan untuk mencuri telur " + dino.getNama() + " yang terletak di " + dino.getLokasi() +" dengan ciri " + dino.getCiriCiri());
    }
    
}
