package fitrahRahmadhani.tugas2;

public class TelevisiJadul extends Elektronik{
    private String modelInput;

    TelevisiJadul(){    }

    public String getModelInput(){
        return modelInput;
    }

    @Override
    public int getVoltase() {
        return 220;
    }
}

