package fitrahRahmadhani.tugas2;

public class TelevisiModern extends Elektronik{
    private String modelInput;

    TelevisiModern(){    }

    public String getModelInput() {
        return modelInput;
    }

    @Override
    public int getVoltase() {
        return 220;
    }
}
