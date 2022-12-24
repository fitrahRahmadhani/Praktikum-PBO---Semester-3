package fitrahRahmadhani;

public class Laptop extends Komputer implements IKeyboard, IMouse, IPrinter{
    
    public Laptop(String merk, String cpu, int ram, String vga){
        this.merk = merk;
        this.cpu = cpu;
        this.ram = ram;
        this.vga = vga;
    }

    public void cetak_data() {
        System.out.println("\n=== DATA LAPTOP ===");
        System.out.println("Merk: " + this.merk);
        System.out.println("Prosesor: " + this.cpu);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("GPU: " + this.vga);
        System.out.print("Status: ");
        if(this.power == 1){
            System.out.println("Power ON");
        }else if(this.power == 0){
            System.out.println("Power OFF");
        }
    }

    public void klik_kanan() {
        if(this.power == 0){
            System.out.println("Laptop masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh kanan laptop " + this.merk + " ditekan");;
        }
    }

    public void klik_kiri() {
        if(this.power == 0){
            System.out.println("Laptop masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh kiri laptop " + this.merk + " ditekan");
        }
    }

    public void tekan_enter() {
        if(this.power == 0){
            System.out.println("Laptop masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh enter laptop " + this.merk + " ditekan");
        }
    }

    public void hidupkan_os() {
        if(this.power == 1){
            System.out.println("Laptop masih dalam kondisi ON");
        }else if(this.power == 0){
            this.power = 1;
            System.out.println(this.merk + " berhasil dihidupkan");
        }
    }

    public void matikan_os() {
        if(this.power == 0){
            System.out.println("Laptop masih dalam kondisi OFF");
        }else if(this.power == 1){
            this.power = 0;
            System.out.println("Laptop berhasil dimatikan");
        }
    }
    
}