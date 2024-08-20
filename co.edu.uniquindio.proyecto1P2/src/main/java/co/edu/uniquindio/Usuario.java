package co.edu.uniquindio;

public class Usuario {
    private String nombre;
    private int edad;
    private double peso;
    private VehiculoTransporte vehiculoAsociado;

    public Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public  void asociarVehiculo (VehiculoTransporte vehiculo){
        vehiculoAsociado = vehiculo;
    }

    @Override
    public String toString() {
        return "Usuario del transporte \n" +
                "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Peso: " + String.format("%.2f", peso)+ "\n";
    }
}
