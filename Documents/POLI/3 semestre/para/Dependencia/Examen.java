package Dependencia;
import java.util.ArrayList;
import java.util.List;

public class Examen {
    private String codigo;
    private String titulo;
    private String asignatura;
    private int duracionMinutos;
    private boolean estado; // true: activo, false: desactivado
    private List<Pregunta> listaPreguntas;

    public Examen(String codigo, String titulo, String asignatura, int duracionMinutos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.asignatura = asignatura;
        this.duracionMinutos = duracionMinutos;
        this.estado = false; // Por defecto inicia desactivado
        this.listaPreguntas = new ArrayList<>();
    }

    // Método que refuerza la COMPOSICIÓN: El examen crea la pregunta
    public void agregarPregunta(int numero, String enunciado, String tipo, double puntaje, String respuesta, boolean obligatoria) {
        Pregunta nuevaPregunta = new Pregunta(numero, enunciado, tipo, puntaje, respuesta, obligatoria);
        listaPreguntas.add(nuevaPregunta);
    }

    public boolean eliminarPregunta(int numero) {
        return listaPreguntas.removeIf(p -> p.getNumero() == numero);
    }

    public Pregunta buscarPregunta(int numero) {
        for (Pregunta p : listaPreguntas) {
            if (p.getNumero() == numero) return p;
        }
        return null;
    }

    public void listarPreguntas() {
        if (listaPreguntas.isEmpty()) {
            System.out.println("El examen no tiene preguntas aún.");
        } else {
            listaPreguntas.forEach(Pregunta::mostrarInformacion);
        }
    }

    public double calcularPuntajeTotal() {
        return listaPreguntas.stream().mapToDouble(Pregunta::getPuntaje).sum();
    }

    public void cambiarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del examen actualizado a: " + (estado ? "Activo" : "Desactivado"));
    }

    public void mostrarInformacionExamen() {
        System.out.println("=== EXAMEN: " + titulo + " ===");
        System.out.println("Código: " + codigo + " | Asignatura: " + asignatura);
        System.out.println("Duración: " + duracionMinutos + " min | Estado: " + (estado ? "Activo" : "Inactivo"));
        System.out.println("Puntaje Total: " + calcularPuntajeTotal());
        System.out.println("-----------------------------");
    }
}