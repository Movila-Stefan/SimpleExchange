public class MonedaInternationala {

    private String numeMoneda;
    private double monedaInternationalaToRon;

    public MonedaInternationala(String numeMoneda, double monedaInternationalaToRon) {
        this.numeMoneda = numeMoneda;
        this.monedaInternationalaToRon = monedaInternationalaToRon;
    }

    public String getNumeMoneda() {
        return numeMoneda;
    }

    public void setNumeMoneda(String numeMoneda) {
        this.numeMoneda = numeMoneda;
    }

    public double getMonedaInternationalaToRon() {
        return monedaInternationalaToRon;
    }

    public void setMonedaInternationalaToRon(double monedaInternationalaToRon) {
        this.monedaInternationalaToRon = monedaInternationalaToRon;
    }
}
