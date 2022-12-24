package fitrahRahmadhani;

public class PC extends Komputer implements IKeyboard, IMouse, IPrinter{
    protected String monitor, keyboard, mouse;

    public PC(String monitor, String keyboard, String mouse, String merk, String cpu, int ram, String vga){
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.merk = merk;
        this.cpu = cpu;
        this.ram = ram;
        this.vga = vga;
    }

    public void cetak_data() {
        System.out.println("\n=== DATA PC ===");
        System.out.println("Monitor: " + this.monitor);
        System.out.println("Mouse: " + this.mouse);
        System.out.println("Keyboard: " + this.keyboard);
        System.out.println("Merk Motherboard: " + this.merk);
        System.out.println("Prosesor: " + this.cpu);
        System.out.println("RAM: " + this.ram  + " GB");
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
            System.out.println("PC masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh kanan PC ditekan");
        }
    }

    public void klik_kiri() {
        if(this.power == 0){
            System.out.println("PC masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh kiri PC ditekan");
        }
    }

    public void tekan_enter() {
        if(this.power == 0){
            System.out.println("PC masih dalam kondisi OFF");
            System.out.println("Hidupkan terlebih dahulu");
        }else{
            System.out.println("Tomboh enter PC ditekan");
        }
    }

    public void hidupkan_os() {
        if(this.power == 1){
            System.out.println("PC masih dalam kondisi ON");
        }else if(this.power == 0){
            this.power = 1;
            System.out.println("PC berhasil dihidupkan");
        }
    }

    public void matikan_os() {
        if(this.power == 0){
            System.out.println("PC masih dalam kondisi OFF");
        }else if(this.power == 1){
            this.power = 0;
            System.out.println("PC berhasil dimatikan");
        }
    }
    
}