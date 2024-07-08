public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpeladoMedioTiempo("Juan", 1, "Asistente", 20, 15);
        empleados[1] = new EmpeladoMedioTiempo("Ana", 2, "Recepcionista", 25, 12);
        
        Generente gerente = new Generente();
        double totalGastos = gerente.calcularGastosTotales(empleados);

        System.out.println("Los gastos totales en salarios son: $" + totalGastos);
    }

    

        

    
}
