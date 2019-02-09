package patterns.structural.adapter.target.objects;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@NoArgsConstructor
public class CalcolaStipendi {

    private List<Impiegato> impiegatoList = new ArrayList<>();

    public void aggiungiImpiegato(Impiegato impiegato) {
        impiegatoList.add(impiegato);
    }

    public void calcola() {
        AtomicLong sum = new AtomicLong();
        if (impiegatoList.isEmpty()) {
            System.out.println("Non ci sono impiegati!");
        } else {
            System.out.println(impiegatoList.stream().mapToInt(Impiegato::stipendio).sum());
        }
    }
}
