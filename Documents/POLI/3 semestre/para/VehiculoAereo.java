public abstract class VehiculoAereo extends Vehiculo {
    private double altitudMaxima;

    public VehiculoAereo(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, double altitud) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad);
        this.altitudMaxima = altitud;
    }

    public double getAltitudMaxima() { return altitudMaxima; }
    public abstract void despegar();
}