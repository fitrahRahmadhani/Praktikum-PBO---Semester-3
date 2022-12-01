package fitrahRahmadhani;

public class Pemburu {
    protected String name;
    Pemburu(String name){
        this.name = name;
    }
    public void berburu(TyrannosaurusRex trex){
        System.out.println(this.name +" sedang berburu trex yang terletak di " + trex.getLokasi() +" dengan ciri " + trex.getCiriCiri());
    }
}
