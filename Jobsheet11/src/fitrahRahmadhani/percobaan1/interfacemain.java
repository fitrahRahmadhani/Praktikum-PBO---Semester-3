package fitrahRahmadhani.percobaan1;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude, sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude, masterCumlaude);
    }
}
