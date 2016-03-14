/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Array que almacena los números de la lista
    private int[] listaEnteros;
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        listaEnteros = new int[0];
    }

    /**
     * Método para añadir elementos a la lista
     */
    public void add(int elemento){
        int tamaño = listaEnteros.length;
        int[] temp = new int[tamaño + 1];
        for (int cont = 0; cont < tamaño; cont++){
            temp[cont] = listaEnteros[cont];
        }
        temp[tamaño] = elemento;
        listaEnteros = temp;
    }

    /**
     * Método para añadir elementos a la lista, 
     * indicando por parámetro en qué posición se almacenarán
     * Si la posición no es válida no hace nada
     */
    public void add(int posicion,int elemento){
        int tamaño = listaEnteros.length;
        if ((posicion >= 0) && (posicion <= tamaño)){
            int[] temp = new int[tamaño + 1];
            int indiceListaEnteros = 0;
            for (int indiceTemp = 0; tamaño >= indiceListaEnteros; indiceListaEnteros++){
                if (posicion == indiceTemp){
                    temp[indiceTemp] = elemento;
                }
                else {
                    temp[indiceListaEnteros] = listaEnteros[indiceTemp];
                    indiceTemp++;
                }
            }
            listaEnteros = temp;
        }
    }

    /**
     * Método para vaciar la lista
     */
    public void clear(){
        listaEnteros = new int[0];
    }

    /**
     * Método para buscar un elemento en la lista pasado por parametro
     * Si lo encuentra devuelve true, si no devolvera false
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        for (int indice = 0; indice < listaEnteros.length; indice++){
            if (elemento == listaEnteros[indice]){
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * Método que devuelve un elemento localizado en la posicion indicada por parámetro
     * Si la posicion no es válida devuelve -1
     */
    public int get(int posicion){
        int encontrado = -1;
        if ((posicion >= 0) && (posicion < listaEnteros.length)){
            encontrado = listaEnteros[posicion];
        }
        return encontrado;
    }
    
    /**
     * Método que modifica el valor de un elemento situado en la posicion pasada por parámetro por otro valor pasado por parámetro
     * Si la posicion no es válida no hace nada
     */
    public void set(int posicion,int elemento){
        if ((posicion >= 0) && (posicion < listaEnteros.length)){
            listaEnteros[posicion] = elemento;
        }
    }
    
    /**
     * Método que ddevuelve el indice de la primera coincidencia con el elemento pasado por parámetro
     * Si no encuentra ninguno devuelve -1
     */
    public int indexOf(int elemento){
        int indice = -1;
        int cont = 0;
        boolean encontrado = false;
        for (cont = 0; (cont < listaEnteros.length) && (!encontrado); cont++){
            if (listaEnteros[cont] == elemento){
                encontrado = true;
                indice = cont;
            }
        }
        return indice;
    }
    
    /**
     * Método que nos permite saber si la lista está vacía
     * Si lo está devuelve true, si no devuelve false
     */
    public boolean isEmpty(){
        boolean estaVacia = false;
        if (listaEnteros.length == 0){
            estaVacia = true;
        }
        return estaVacia;
    }
    
    /**
     * Método que permite eliminar un elemento de la lista
     * Los demas se desplazarán una posición si fuera necesario
     */
    public int remove(int posicion){
        int elemento = -1;
        int tamaño = listaEnteros.length;
        if ((posicion >= 0) && (posicion < tamaño)){
            int[] temp = new int[tamaño - 1];
            int indiceListaEnteros = 0;
            for (int indiceTemp = 0; tamaño > indiceListaEnteros; indiceListaEnteros++){
                if (posicion == indiceListaEnteros){
                    elemento = listaEnteros[indiceListaEnteros];
                }
                else {
                    temp[indiceTemp] = listaEnteros[indiceListaEnteros];
                    indiceTemp++;
                }
            }
            listaEnteros = temp;
        }
        return elemento;
    }
    
    /**
     * Método que devuelve el tamaño de la lista
     */
    public int size(){
        return listaEnteros.length;
    }
}
