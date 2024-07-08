public class EmpeladoTiempoCompleto  extends Empleado{

    public double  salarioMensual;

    public EmpeladoTiempoCompleto(String Nombre, String NumId, String cargo, double salarioMensual){
        super(Nombre, NumId, cargo);
        this.salarioMensual = salarioMensual;
    }
     
   
    @Override 
    public double calcularSalario(){
        return salarioMensual;
}   }
