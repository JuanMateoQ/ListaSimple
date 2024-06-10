import javax.swing.*;

public class ListaSimple {
    // Atributos privados de la clase
    private NodoListaSimple nodoDeInicio;  // Apunta al primer nodo de la lista
    private NodoListaSimple nodoAuxiliar1; // Nodo auxiliar utilizado en varios métodos
    private NodoListaSimple nodoAuxiliar2; // Otro nodo auxiliar utilizado en varios métodos

    // Constructor que llama al constructor de la superclase (Object)
    public ListaSimple(){
        super();
    }

    // Método para crear nodos al inicio de la lista
    public void crearNodoInicioLista(){
        this.nodoDeInicio = new NodoListaSimple();
        this.nodoDeInicio.setInformación(JOptionPane.showInputDialog("Ingrese el nombre del primer nodo: "));
        this.nodoDeInicio.setLiga(null);

        int opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar más nodos: ");
        while(opcion == JOptionPane.YES_OPTION){
            nodoAuxiliar1 = new NodoListaSimple();
            nodoAuxiliar1.setInformación(JOptionPane.showInputDialog("Ingrese el nombre del siguiente nodo: "));
            nodoAuxiliar1.setLiga(nodoDeInicio);
            this.nodoDeInicio = this.nodoAuxiliar1;
            opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar más nodos: ");
        }
    }

    // Método para crear nodos al final de la lista
    public void crearNodoFinalLista() {
        this.nodoDeInicio = new NodoListaSimple();
        this.nodoDeInicio.setInformación(JOptionPane.showInputDialog("Ingrese el nombre del 1er nodo"));
        this.nodoDeInicio.setLiga(null);
        this.nodoAuxiliar2 = this.nodoDeInicio;
        int opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar mas nodos?");
        while (opcion == JOptionPane.YES_OPTION) {
            NodoListaSimple aux = new NodoListaSimple();
            aux.setInformación(JOptionPane.showInputDialog("Ingrese el nombre del siguiente nodo"));
            aux.setLiga(null);
            this.nodoAuxiliar2.setLiga(aux);
            this.nodoAuxiliar2 = aux;
            opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar mas nodos?");
        }
    }

    // Método para insertar un nodo al inicio de la lista
    public void insertarNodoInicio(){
        this.nodoAuxiliar1 = new NodoListaSimple();
        this.nodoAuxiliar1.setInformación(JOptionPane.showInputDialog("Ingrese el nombre de nodo"));
        this.nodoAuxiliar1.setLiga(this.nodoDeInicio);
        this.nodoDeInicio = this.nodoAuxiliar1;
    }

    // Método para insertar un nodo al final de la lista
    public void insertarNodoFinal(){
        this.nodoAuxiliar2 = this.nodoDeInicio;
        while(this.nodoAuxiliar2.getLiga() != null){
            this.nodoAuxiliar2 = nodoAuxiliar2.getLiga();
        }

        this.nodoAuxiliar1 = new NodoListaSimple();
        this.nodoAuxiliar1.setInformación(JOptionPane.showInputDialog("Ingrese el nombre del nodo"));
        this.nodoAuxiliar1.setLiga(null);
        this.nodoAuxiliar2.setLiga(this.nodoAuxiliar1);
    }

    // Método para recorrer la lista y mostrar la información de cada nodo
    public void recorrer(){
        nodoAuxiliar1 = this.nodoDeInicio;
        while (nodoAuxiliar1 != null){
            JOptionPane.showMessageDialog(null, nodoAuxiliar1.getInformación());
            nodoAuxiliar1 = nodoAuxiliar1.getLiga();
        }
    }

    // Método para eliminar el primer nodo de la lista
    public void eliminarNodoInicio() {
        nodoAuxiliar1 = nodoDeInicio;
        if (this.nodoAuxiliar1.getLiga() == null) {
            this.nodoDeInicio = null;
        } else {
            this.nodoDeInicio = nodoAuxiliar1.getLiga();
        }
    }

    // Método para eliminar el último nodo de la lista
    public void eliminarAlFinal(){
        NodoListaSimple aux1 = this.nodoDeInicio;
        NodoListaSimple aux2 = new NodoListaSimple();

        if(aux1.getLiga() == null){
            nodoDeInicio = null;
            return;
        }
        while(aux1.getLiga() != null){
            aux2 = aux1;
            aux1 = aux1.getLiga();
        }
        aux2.setLiga(null);
        aux1.setLiga(null);
        aux1 = null;
    }

    // Método que devuelve una representación en String de la lista
    public String toString() {
        NodoListaSimple aux;
        String salida = "";
        aux = this.nodoDeInicio;

        while (aux != null) {
            salida += aux.getInformación() + "\n";
            aux = aux.getLiga();
        }
        return salida;
    }
}
