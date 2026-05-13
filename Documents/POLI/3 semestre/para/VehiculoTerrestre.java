public abstract class VehiculoTerrestre extends Vehiculo {
    private int ruedas;

    public VehiculoTerrestre(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, int unasRuedas) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad);
        this.ruedas = unasRuedas;
    }

    public int getRuedas() { return ruedas; }
    public abstract double consumoPorKm();
}
