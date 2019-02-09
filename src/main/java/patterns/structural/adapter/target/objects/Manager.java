package patterns.structural.adapter.target.objects;

public class Manager implements Impiegato {
    @Override
    public void stampaDescrizionePosizione() {
        System.out.println("I manager sono in carico della gestione di un singolo team di sviluppatori");
    }

    @Override
    public String senorityNecessaria() {
        return "5 anni";
    }

    @Override
    public int stipendio() {
        return 5000;
    }
}
