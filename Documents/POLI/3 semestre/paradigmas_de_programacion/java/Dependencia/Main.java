package Dependencia;

public class Main {
    public static void main(String[] args) {
        // Crear el examen
        Examen miExamen = new Examen("SIS101", "Parcial Programación II", "Sistemas", 60);

        // Agregar preguntas (Composición)
        miExamen.agregarPregunta(1, "¿Qué es el polimorfismo?", "Teórica", 1.5, "...", true);
        miExamen.agregarPregunta(2, "¿Java es un lenguaje compilado?", "V/F", 1.0, "Verdadero", false);
        miExamen.agregarPregunta(3, "Explique la herencia.", "Abierta", 2.5, "...", true);

        // Mostrar información inicial
        miExamen.mostrarInformacionExamen();
        miExamen.listarPreguntas();

        // Operaciones de gestión
        System.out.println("\n--- Realizando cambios ---");
        miExamen.eliminarPregunta(2); // Eliminar la pregunta 2
        
        Pregunta p = miExamen.buscarPregunta(3);
        if (p != null) {
            p.cambiarPuntaje(3.0); // Editar puntaje de la pregunta 3
            p.setObligatoria(false);
        }

        miExamen.cambiarEstado(true); // Activar examen

        // Resultado Final
        System.out.println("\n--- Examen Actualizado ---");
        miExamen.mostrarInformacionExamen();
        miExamen.listarPreguntas();
    }
}