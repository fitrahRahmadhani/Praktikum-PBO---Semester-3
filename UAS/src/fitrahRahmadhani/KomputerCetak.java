package fitrahRahmadhani;

final class KomputerCetak {
    public static void main(String[] args) {
        Laptop thinkbook = new Laptop("Lenovo Thinkbook Yoga 14s", "Intel i5 1135g7", 8, "Intel Iris Xe Graphic");
        Laptop spin = new Laptop("Acer Spin 5", "Intel i7 1165g7", 16, "Intel Iris Xe Graphic");

        Notebook samsung = new Notebook("Samsung Chromebook 4", "Intel Dual Core N4020", 4, "Intel UHD Graphics 600");
        Notebook hp = new Notebook("Hp Chromebook 11 G8", "Intel Dual Core N4020", 4, "Intel UHD Graphics 600");

        PC rakitan = new PC("Xiaomi XMMNT27HQ", "Logitec MX Key", "Logitec MX 2s", "Asus", "Ryzen 7 5700U", 16, "RTX 3080");

        Komputer[] arr = new Komputer[5];
        arr[0] = thinkbook;
        arr[1] = samsung;
        arr[2] = hp;
        arr[3] = spin;
        arr[4] = rakitan;
        cetak(arr);
        System.out.println();

        //DYNAMIC POLYMORPHISME
        Komputer komputer;
        komputer = thinkbook;
        komputer.hidupkan_os();
        komputer.klik_kanan();
        komputer.klik_kiri();
        komputer.tekan_enter();
        komputer.matikan_os();
        System.out.println();
        komputer = hp;
        komputer.hidupkan_os();
        komputer.klik_kanan();
        komputer.klik_kiri();
        komputer.tekan_enter();
        komputer.matikan_os();
        System.out.println();
        komputer = rakitan;
        komputer.hidupkan_os();
        komputer.klik_kanan();
        komputer.klik_kiri();
        komputer.tekan_enter();
        komputer.matikan_os();
    }
    final static void cetak(Komputer[] obj){
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof PC){
                ((PC)obj[i]).cetak_data();
            }else if(obj[i] instanceof Laptop){
                ((Laptop)obj[i]).cetak_data();
            }else if(obj[i] instanceof Notebook){
                ((Notebook)obj[i]).cetak_data();
            }
        }
    }
}
