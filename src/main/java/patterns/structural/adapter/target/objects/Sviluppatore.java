package patterns.structural.adapter.target.objects;

public class Sviluppatore implements Impiegato {
    @Override
    public void stampaDescrizionePosizione() {
        System.out.println("Lo sviluppatore è in carico dell'implementazione del SRS prodotto dagli analisti funzionali");
    }

    @Override
    public String senorityNecessaria() {
        return "0 anni";
    }

    @Override
    public int stipendio() {
        return 1200;
    }


}
