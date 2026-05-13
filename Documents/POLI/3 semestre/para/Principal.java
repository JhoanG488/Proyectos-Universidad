import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Vehiculo> misVehiculos = new ArrayList<>();

        // Agregamos diferentes tipos
        misVehiculos.add(new Coche("PIE435", "Audi", 2026, 350, 4, 20, 7));
        misVehiculos.add(new Moto("XYZ123", "Yamaha", 2024, 180, 2, "Deportivo"));
        misVehiculos.add(new Avion("AIR999", "Boeing", 2022, 900, 12000, 4));
        misVehiculos.add(new Helicoptero("HEL001", "Bell", 2025, 250, 5000, 2));

        for (Vehiculo v : misVehiculos) {
            System.out.println("------------------------------------------");
            
            // Lógica para visualizar CATEGORÍA SUPERIOR
            if (v instanceof VehiculoTerrestre) {
                System.out.println("[CATEGORÍA: VEHÍCULO TERRESTRE]");
            } else if (v instanceof VehiculoAereo) {
                System.out.println("[CATEGORÍA: VEHÍCULO AÉREO]");
            }

            // Lógica para visualizar DETALLES ESPECÍFICOS
            System.out.println("Subtipo: " + v.tipo());
            System.out.print("Datos: " + v.getPlaca() + " - " + v.getMarca());

            if (v instanceof Coche) {
                Coche c = (Coche) v;
                System.out.println(" - Tanque: " + c.getCapaciadTanqueLitros() + "L");
            } else if (v instanceof Moto) {
                Moto m = (Moto) v;
                System.out.println(" - Manubrio: " + m.getTipoManubrio());
            } else if (v instanceof VehiculoAereo) {
                VehiculoAereo a = (VehiculoAereo) v;
                System.out.println(" - Altitud Máx: " + a.getAltitudMaxima() + "m");
            }
        }
    }
}