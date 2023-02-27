package Ejercicio3;


import java.util.*;

public class Graph<V>{
        //Lista de adyacencia
        private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v){
        if(adjacencyList.containsKey(v)){
            return false;
        }
        adjacencyList.put(v, null);
        return true;
    }

    public boolean addEdge(V v1, V v2){
        if(!adjacencyList.containsKey(v1)){
            addVertex(v1);
        }
        if(!adjacencyList.containsKey(v2)){
            addVertex(v2);
        }
        adjacencyList.get(v1).add(v2);
        return true;
    }

    public Set<V> obtainAdjacents(V v) throws Exception{
        if(!adjacencyList.containsKey(v)){
            throw new Exception("El vértice no existe");
        }
        return adjacencyList.get(v);
    }

    public boolean containsVertex(V v){
        return adjacencyList.containsKey(v);
    }
    @Override
    public String toString(){
        return adjacencyList.toString();
    }
    public List<V> onePath(V v1, V v2) {

        if (!adjacencyList.containsKey(v1) || !adjacencyList.containsKey(v2)) { //Si no existe alguno de los vertices
            return null; //Devuelve null
        } else {
            List<V> camino = new ArrayList<>(); //Creamos una lista para guardar el camino
            camino.add(v1); //Añadimos el primer vertice
            if (v1.equals(v2)) { //Si el primer vertice es igual al segundo
                return camino; //Devuelve el camino
            } else {
                for (V v : adjacencyList.get(v1)) { //Recorremos los vertices adyacentes al primero
                    if (onePath(v, v2) != null) { //Si el camino entre el vertice adyacente y el segundo no es nulo
                        camino.addAll(onePath(v, v2)); //Añadimos el camino a la lista
                        return camino; //Devolvemos el camino
                    }
                }
            }
        }
        return null; //Si no se cumple ninguna de las condiciones anteriores, devuelve null


    }

}





