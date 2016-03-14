/**
 * Write a description of class HashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // Creamos un ArrayList de enteros
    private ArrayListInt lista;

    /**
     * Constructor for objects of class HashSet
     */
    public MiHashSet()
    {
        lista = new ArrayListInt();
    }

    /**
     * Añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor){
        boolean encontrado = true;
        if(!lista.contains(valor)) {
            lista.add(valor);
        }
        else {
            encontrado = false;
        }
        return encontrado;
    }

    /**
     * Vacía el conjunto.
     */
    public void clear(){
        lista.clear();
    }

    /**
     * Devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento){
        return lista.contains(elemento);
    }

    /**
     * Devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty(){
        return lista.isEmpty();
    }

    /**
     * Elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento){
        boolean eliminado = false;
        if(lista.contains(elemento)) {
            int index = lista.indexOf(elemento);
            lista.remove(index);
            eliminado = true;
        }
        return eliminado;
    }

    /**
     * Devuelve el numero de elementos del conjunto
     */
    public int size(){
        return lista.size();
    }

    /**
     * Devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString(){
        String texto = "[";
        for(int i = 0; i < lista.size(); i++) {
            if(i == 0){
                texto += lista.get(i);
            }
            else {
                texto += ", " + lista.get(i);
            }
        }
        texto += "]";
        return texto;
    }
    
    /**
     * Devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto){
        boolean esIgual = true;
        if(otroConjunto.size() == lista.size()) {
            for(int indice = 0;indice < lista.size() && esIgual;indice++)
            {
                if(!(otroConjunto.contains(lista.get(indice))))
                {
                    esIgual = false;
                }
            }
        }
        else {
            esIgual = false;
        }
        return esIgual;
    }
}