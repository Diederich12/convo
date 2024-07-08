public class EmpeladoMedioTiempo extends Empleado {

    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpeladoMedioTiempo(String nombre, int numId, String cargo, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, nombre, cargo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
