public class Coche extends VehiculoTerrestre {
    private double capaciadTanqueLitros;
    private double consumoLitrosPor100Km;

    public Coche(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, int unasRuedas, double unaCapacidad, double unConsumo) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad, unasRuedas);
        this.capaciadTanqueLitros = unaCapacidad;
        this.consumoLitrosPor100Km = unConsumo;
    }

    @Override public double consumoPorKm() { return 10.5; }
    @Override public double autonomiaKm() { return 450.0; }

    public double getCapaciadTanqueLitros() { return capaciadTanqueLitros; }
    public double getConsumoLitrosPor100Km() { return consumoLitrosPor100Km; }
}