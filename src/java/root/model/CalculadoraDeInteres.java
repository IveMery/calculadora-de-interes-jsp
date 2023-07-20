package root.model;

public class CalculadoraDeInteres {

    private double capital;
    private double tasaInteresAnual;
    private int numeroAnios;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public int getNumeroAnios() {
        return numeroAnios;
    }

    public void setNumeroAnios(int numeroAnios) {
        this.numeroAnios = numeroAnios;
    }

    public double calcularInteresSimple() {
        return capital * (tasaInteresAnual / 100) * numeroAnios;
    }
}
