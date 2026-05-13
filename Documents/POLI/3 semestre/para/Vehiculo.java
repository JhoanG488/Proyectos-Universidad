public abstract class Vehiculo {
    private String placa, marca;
    private int anio;
    private double velocidadMaxima;

    public Vehiculo(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad){
        this.placa = unaPlaca;
        this.marca = unaMarca;
        this.anio = unAnio;
        this.velocidadMaxima = unaVelocidad;
    }

    // Getters y Setters
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public int getAnio() { return anio; }
    public double getVelocidadMaxima() { return velocidadMaxima; }

    public abstract double autonomiaKm();

    public String tipo(){
        return this.getClass().getSimpleName();
    }
}