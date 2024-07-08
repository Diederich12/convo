public class Generente  {


    public double calcularGastosTotales(Empleado[] empelados) {
        double totalGastos = 0.0;
        for (Empleado empleado : empelados) {
            totalGastos += empleado.calcularSalario();
        }
        return totalGastos;
   }
    
}
