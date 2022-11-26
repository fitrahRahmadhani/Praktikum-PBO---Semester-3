package fitrahRahmadhani.percobaan1;

public class MutipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakrektor.beriSerifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSerifikatMawapres(masterCumlaude);
    }
}
