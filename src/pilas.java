import javax.swing.JOptionPane;

public class pilas {
    public static void main(String[] args) throws Exception {

        int tam, op, el;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el tamaño de la pila"));
        pilasClass miPila = new pilasClass(tam);

        // Agregué la declaración de la variable op
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un valor\n2. Salir"));

            switch (op) {
                case 1:
                    el = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el valor del elemento"));
                    miPila.empujar(el);
                    miPila.imprimir();
                break;

                case 2:
                default:break;
            }
        } while (op < 2);
    }
}
