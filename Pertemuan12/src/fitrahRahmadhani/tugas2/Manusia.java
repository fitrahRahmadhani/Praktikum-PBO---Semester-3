package fitrahRahmadhani.tugas2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: DVI");
            System.out.println("Volatase televisi: " + ((TelevisiJadul)perangkat).getVoltase());
        }else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi jadul dengan input: HDMI");
            System.out.println("Volatase televisi: " + ((TelevisiModern)perangkat).getVoltase());
        }
    }
}

