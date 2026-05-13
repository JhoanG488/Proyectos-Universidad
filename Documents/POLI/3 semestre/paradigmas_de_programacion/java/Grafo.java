import java.util.*;

public class Grafo {

    private Map<String, List<String>> adyacencia;
 
    
    public Grafo(){
        adyacencia = new HashMap<>();

    
}
//add vertice

public void AgregarVertice (String vertice){
    adyacencia.putIfAbsent(vertice , new ArrayList<>());
}

public void AgregarAristas (String origen, String destino){
    adyacencia.get(origen).add(destino); //Solo si es el grafo (DIRIGIDO)
    adyacencia.get(destino).add(origen);//Si el grafo no es dirigido


}

//Mostrar el grafo
public void MostrarGrafo (){
    for (String vertice : adyacencia.keySet()) {
        System.out.println(vertice + "->"+adyacencia.get(vertice));
    }
}

public void dfsRecursivo(int nodo, boolean[] visitado, List<List<Integer>> adj) {
    // 1. Marcar el nodo actual como visitado
    visitado[nodo] = true;
    System.out.print(nodo + " ");

    // 2. Recorrer todos los vecinos del nodo
    for (int vecino : adj.get(nodo)) {
        if (!visitado[vecino]) {
            // 3. Llamada recursiva para profundizar
            dfsRecursivo(vecino, visitado, adj);
        }
    }
}


// Ejemplo conceptual de BFS en Java
public void bfs(int inicio, List<List<Integer>> adj) {
    boolean[] visitado = new boolean[adj.size()];
    Queue<Integer> cola = new LinkedList<>();

    visitado[inicio] = true;
    cola.add(inicio);

    while (!cola.isEmpty()) {
        int nodo = cola.poll();
        System.out.print(nodo + " ");
        
        for (int vecino : adj.get(nodo)) {
            if (!visitado[vecino]) {
                visitado[vecino] = true;
                cola.add(vecino);
            }
        }
    }
}

}