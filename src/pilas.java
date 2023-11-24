import javax.swing.JOptionPane;

public class pilas {
    public static void main(String[] args) throws Exception {
        //Agregué la declaración de la variable op
        int tam, op, el;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el tamaño de la pila"));
        pilasClass miPila = new pilasClass(tam);

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona la opción que deceas ejecutar: \n1. Insertar un valor\n2. Eliminar un valor\n3. Mostrar el ultimo dato insertado\n4. Imprimir los datos de las pilas\n 5. Mostrar la longitud de la pila\n 6.Salir "));

            switch (op) {
                case 1:
                if (!miPila.estaLlena()){
                    el = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el valor del elemento"));
                    miPila.empujar(el);
                    miPila.imprimir();
                    }else{
                        JOptionPane.showMessageDialog(null,"Stack Overflow");
                    }

                break;

                case 2: if(!miPila.estaVacia()){
                    miPila.eliminar();
                    miPila.imprimir();
                    }else{
                        JOptionPane.showMessageDialog(null,"Stack Underflow"); 
                    }
                break;
                case 3:
                miPila.cimaPila();
                break;
                case 4: 
                miPila.imprimir();
                break;

                case 5:
                miPila.tamanioPila();
                break;
                case 6: 
                default:break;
            }
        } while (op < 6);
    }
}
