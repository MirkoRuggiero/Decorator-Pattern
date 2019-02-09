package patterns.structural.facade.motore;

import lombok.Data;

@Data
public class Serbatoio {

    private final static double MAX = 60d;
    private double benzinaResidua;

    public Serbatoio(double benzinaResidua) {
        this.benzinaResidua = benzinaResidua;
    }

    public boolean benzinaSufficiente() {
        return benzinaResidua > 0.5d;
    }

}
