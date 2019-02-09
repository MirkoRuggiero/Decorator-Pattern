package patterns.structural.facade.motore;

import lombok.Data;

@Data
public class Batteria {

    private double capacitàResidua;

    public Batteria(double capacitàResidua) {
        this.capacitàResidua = capacitàResidua;
    }

    public boolean caricaSufficiente() {
        return capacitàResidua > 0.5d;
    }

}
