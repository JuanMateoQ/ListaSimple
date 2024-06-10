import javax.swing.*;

// Author: Juan Mateo
public class Main {
    public static void main(String[] args) {
        int opcion;
        ListaSimple list = new ListaSimple(); // Se crea una instancia de ListaSimple para manejar la lista enlazada.

        do {
            // Muestra un cuadro de diálogo para que el usuario elija una opción.
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "          ELIJA UNA OPCION \n" +
                            "     || Solo Para la Creación ||\n" +
                            "1. Crear Nodos al Inicio de la Lista.\n" +
                            "2. Crear Nodos al Final de la Lista.\n\n" +
                            "     || Aún no se que Hace ||\n" +
                            "3. Recorrer la Lista.\n\n" +
                            "     || Inserción en la Lista Creada ||\n" +
                            "4. Insertar Nodo al Inicio.\n" +
                            "5. Insertar Nodo al Final.\n\n" +
                            "     || Eliminación de la Lista Creada ||\n" +
                            "6. Eliminar Nodo al Inicio de la Lista.\n" +
                            "7. Eliminar Nodo al Final de la Lista.\n\n" +
                            "     || Buscar y Mostrar ||\n" +
                            "8. Buscar un Nodo.\n" +
                            "9. Ver Lista.\n\n" +
                            "     || *** ||\n" +
                            "0. SALIR"));

            switch (opcion) {
                case 1:
                    // Llama al método para crear un nodo al inicio de la lista y muestra un mensaje con la lista actual.
                    list.crearNodoInicioLista();
                    JOptionPane.showMessageDialog(null, "LISTA CREADA NODOS POR INICIO\n" + list);
                    break;
                case 2:
                    // Llama al método para crear un nodo al final de la lista y muestra un mensaje con la lista actual.
                    list.crearNodoFinalLista();
                    JOptionPane.showMessageDialog(null, "LISTA CREADA NODOS  POR FINAL\n" + list);
                    break;
                case 3:
                    // Llama al método para recorrer la lista.
                    list.recorrer();
                    break;
                case 4:
                    // Llama al método para insertar un nodo al inicio de la lista y muestra un mensaje con la lista actual.
                    list.insertarNodoInicio();
                    JOptionPane.showMessageDialog(null, "INSERTA NODO INICIO DE LISTA CREADA\n" + list);
                    break;
                case 5:
                    // Llama al método para insertar un nodo al final de la lista y muestra un mensaje con la lista actual.
                    list.insertarNodoFinal();
                    JOptionPane.showMessageDialog(null, "INSERTA NODO AL FINAL DE LISTA CREADA\n" + list);
                    break;
                case 6:
                    // Pregunta al usuario si desea eliminar el primer nodo de la lista.
                    int opcion2 = JOptionPane.showConfirmDialog(null, "Desea eliminar el primer nodo?");
                    if (opcion2 == JOptionPane.YES_OPTION) {
                        // Llama al método para eliminar el primer nodo y muestra un mensaje con la lista resultante.
                        list.eliminarNodoInicio();
                        JOptionPane.showMessageDialog(null, " * Elemento Eliminado con Éxito * \nLista Resultante: " + list);
                    }
                    break;
                case 7:
                    // Pregunta al usuario si desea eliminar el último nodo de la lista.
                    int opcion3 = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el nodo final?");
                    if (opcion3 == JOptionPane.YES_OPTION) {
                        // Llama al método para eliminar el último nodo y muestra un mensaje con la lista resultante.
                        list.eliminarAlFinal();
                        JOptionPane.showMessageDialog(null, "* Elemento Eliminado con Éxito * \nLista Resultante: " + list);
                    }
                    break;
                case 8:
                    // Código para buscar un nodo en la lista (aún no implementado).
                    break;
                case 9:
                    // Muestra la lista actual.
                    JOptionPane.showMessageDialog(null, "LISTA CONCATENADA\n" + list);
                    break;
                default:
                    break;
            }
        } while (opcion != 0); // Repite el ciclo hasta que el usuario elija la opción de salir.
    }
}
