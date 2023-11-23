import javax.swing.JOptionPane;

public class pilas {
    public static void main(String[] args) throws Exception {

        int tam, op, el;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el tamaño de la pila"));
        pilasClass miPila = new pilasClass(tam);

        // Agregué la declaración de la variable op
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un valor\n2. Eliminar un valor\n3. Salir"));

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
                default:break;
            }
        } while (op < 3);
    }
}
