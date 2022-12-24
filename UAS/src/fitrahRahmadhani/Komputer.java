package fitrahRahmadhani;

public abstract class Komputer implements IMouse, IKeyboard, IPrinter{
    protected String merk, cpu, vga;
    protected int ram, power; 
    public abstract void hidupkan_os();
    public abstract void matikan_os();
}
