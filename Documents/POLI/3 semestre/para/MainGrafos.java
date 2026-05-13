public class MainGrafos {
    public static void main(String[] args) {
        Grafo Grafo = new Grafo();

        //Crear grafos

        Grafo.AgregarVertice("A");
        Grafo.AgregarVertice("B");
        Grafo.AgregarVertice("C");
        Grafo.AgregarVertice("D");
        Grafo.AgregarVertice("E");

        //Crear conexiones 
        Grafo.AgregarAristas("A", "B");
        Grafo.AgregarAristas("A", "D");
        Grafo.AgregarAristas("B", "C");
        Grafo.AgregarAristas("B", "E");
        Grafo.AgregarAristas("D", "E");


        //DFS
        Grafo dfsRecursivo = new Grafo();
    dfsRecursivo.AgregarAristas("A", "B");
    dfsRecursivo.AgregarAristas("A", "C");
    dfsRecursivo.AgregarAristas("B", "D");
    dfsRecursivo.AgregarAristas("C", "A");
    dfsRecursivo.AgregarAristas("D", "B");



        //Mostrando el grafo
        Grafo.MostrarGrafo();
    }
}
