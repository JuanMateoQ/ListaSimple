public class NodoListaSimple {
    // Atributos privados de la clase
    private String información;  // Almacena la información del nodo
    private NodoListaSimple liga;  // Apunta al siguiente nodo en la lista

    // Constructor que inicializa ambos atributos
    public NodoListaSimple(String información, NodoListaSimple liga){
        this.información = información;
        this.liga = liga;
    }

    // Constructor que solo inicializa la información, dejando la liga como null
    public NodoListaSimple(String información){
        this.información = información;
        this.liga = null;
    }

    // Constructor vacío que llama al constructor de la superclase (Object)
    public NodoListaSimple(){
        super();
    }

    // Método getter para obtener la información del nodo
    public String getInformación(){
        return this.información;
    }

    // Método setter para establecer la información del nodo
    public void setInformación(String información) {
        this.información = información;
    }

    // Método getter para obtener el nodo siguiente (liga)
    public NodoListaSimple getLiga(){
        return this.liga;
    }

    // Método setter para establecer el nodo siguiente (liga)
    public void setLiga(NodoListaSimple liga){
        this.liga = liga;
    }
}
