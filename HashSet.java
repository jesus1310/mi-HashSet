/**
 * Write a description of class HashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashSet
{
    // Creamos un ArrayList de enteros
    private ArrayListInt lista;

    /**
     * Constructor for objects of class HashSet
     */
    public HashSet()
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
}