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


}

