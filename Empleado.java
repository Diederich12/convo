public abstract class Empleado {
    private String Nombre;
    private String NumId;
    private String cargo;
    
    public Empleado(String Nombre, String NumId,String cargo ){
        this.Nombre = Nombre;
        this.NumId = NumId;
        this.cargo = cargo;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNumId() {
        return NumId;
    }

    public void setNumId(String numId) {
        NumId = numId;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract double calcularSalario();

    



}
