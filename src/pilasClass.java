public class pilasClass {
    int vectorPila [];
    int cima;

    //Constructor
    public pilasClass(int tamaño){
        vectorPila = new int[tamaño];
        cima=-1;
    }

    //Método para insertar un valor (Push)
    public void empujar(int dato){
        cima++;
        vectorPila[cima]=dato;
    }

    //Método para eliminar un valor (pop)
    public int eliminar(){
        int eliminado = vectorPila[cima];

        cima--;

        return eliminado;
    }

    //Método para verificar si la pila esta vacia

    public boolean estaVacia(){
        return cima == -1;
    }

    //Método para verificar si la pila esta llena

    public boolean estaLlena(){
        return vectorPila.length-1 == cima;
    }

    //Método para imprimir todos los elememntos de la pila

    public void imprimir(){
        System.out.println("");
        for (int i=vectorPila.length-1;i>-1; i--)
        System.out.println(i+": "+ vectorPila[i]);
    }

    // Método para imprimir el elemento que esta en la cima

    public int cimaPila(){
        System.out.println("El ultimo dato fue: "+ vectorPila[cima]);
        return vectorPila[cima];
    }

    //Método para imprimir el tamaño de la pila
    public void tamanioPila(){
        System.out.println("El tamaño de la pila es de: "+ vectorPila.length);
    }
}

