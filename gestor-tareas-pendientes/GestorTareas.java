import java.util.ArrayList;
public class GestorTareas
{
    ArrayList<String> tareasPendientes;
    /**
     * Constructor for objects of class GestorTareas
     */
    public GestorTareas()
    {
        tareasPendientes = new ArrayList<>();
    }

    /**
     * Metodo 'agregarTarea' que agrega una tarea al final de la lista.
     * Requiere un parametro de tipo String con el contenido de la tarea.
     */
    public void agregarTarea(String tarea)
    {
        tareasPendientes.add(tarea);
    }

    /**
     * Método 'devolverTareas' que devuelve un String con todas las tareas, una
     * en cada línea. Si no hay tareas, esa línea contiene la cadena
     * vacía. No requiere parametros.
     */
    public String devolverTareas() {
        String tareasADevolver = "";
        for (String listaTareas : tareasPendientes) {
            tareasADevolver += listaTareas + "\n";
        }
        return tareasADevolver;
    }

    /**
     * Metodo 'getNumeroTareas' que devuelve el numero de tareas pendientes
     * existentes. No requiere parámetros.
     */
    public int getNumeroTareas() {
        return tareasPendientes.size();
    }

    /**
     * Metodo 'getNumeroTareas2' que devuelve el numero de tareas pendientes
     * actuales y no requiere parámetros. No se puede usar el metodo size de la
     * clase ArrayList.
     */
    public int getNumeroTareas2() {
        int numeroTareasPendientes = 0;
        for (String listaTareas : tareasPendientes) {
            numeroTareasPendientes++;
        }
        return numeroTareasPendientes;
    }

    /**
     * Metodo 'getTareaMasAntigua' que devuelve la primera tarea que se agrego 
     * al gestor de tareas; si no tareas devuelve la cadena vacia. No requiere
     * parametros.
     */
    public String getTareaMasAntigua(){
        String tareaMasAntigua = "";
        if (tareasPendientes.size() != 0) {
            tareaMasAntigua = tareasPendientes.get(0);
        }
        return tareaMasAntigua;
    }

    /**
     * Metodo 'imprimirTareaMasAntigua' que imprime la primera tarea que se agrego
     * al gestor de tareas; si no hay tareas imprime una línea en blanco. No
     * requiere parametros.
     */
    public void imprimirTareaMasAntigua() {
        String tareaMasAntigua = "";
        if (tareasPendientes.size() != 0) {
            tareaMasAntigua = tareasPendientes.get(0);
        }
        System.out.println ( "La tarea más antigua es " + tareaMasAntigua);
    }

    /**
     * Metodo 'getListadoTareas' que devuelve un String con todas las tareas pendientes, 
     * una en cada línea, precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la cadena vacía.
     * No requiere parametros.
     */
    public String getListadoTareas() {
        String tareasADevolver = "";
        for (int i = 0; i < tareasPendientes.size(); i++) {
            tareasADevolver += (i+1) + ". " + tareasPendientes.get(i) + "\n";
        }
        return tareasADevolver;
    }

    /**
     * Metodo 'imprimirListadoTareas' que imprime por pantalla todas las tareas pendientes, 
     * una en cada línea, precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas imprime una línea en blanco. 
     * El método no devuelve nada. No requiere parametros.
     */
    public void imprimirListadoTareas() {
        if (tareasPendientes.size() != 0) {
            for (int i = 0; i < tareasPendientes.size(); i++) {
                System.out.println((i + 1) + ". " + tareasPendientes.get(i));
            }
        }
        else {
            System.out.println ("");
        }
    }

    /**
     * Metodo 'getTareasEnUnaSolaLinea' que devuelve todas las tareas pendientes en una sola 
     * linea separadas por comas, y por un espacio y con dos corchetes al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]". Si no hay tareas devuelve la cadena "[]". 
     */
    public String getTareasEnUnaSolaLinea() {
        String tareasADevolver = "[";
        if(tareasPendientes.size() != 0) {
            for (int i = 0; i < tareasPendientes.size(); i++) {
                tareasADevolver += tareasPendientes.get(i);
                if (i < tareasPendientes.size() -1) {
                    tareasADevolver += ", ";
                }

            }
        }
        return tareasADevolver + "]";
    }

    /**
     * Metodo 'imprimirTareasEnUnaSolaLinea' que imprime todas las tareas pendientes en una sola 
     * linea separadas por comas, y por un espacio y con dos corcehete al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]. Si no hay tareas imprime una línea con dos corchetes 
     * del tipo "[]". No requiere parametros.
     */
    public void imprimirTareasEnUnaSolaLinea () {
        String tareasADevolver = "[";
        if( tareasPendientes.size() != 0) {
            for (int i = 0; i < tareasPendientes.size(); i++) {
                tareasADevolver += tareasPendientes.get(i);
                if (i < tareasPendientes.size() -1)  {
                    tareasADevolver += ",";
                }
            }
        }
        else {
            tareasADevolver = "[]";
        }
        System.out.println (tareasADevolver + "]");
    }

    /**
     * Metodo 'existeTareaConElTexto' que devuelve true si hay al menos una tarea que contenga 
     * el texto indicado como parametro, false en caso contrario. Hay que hacerlo con bucle for-each.
     * Requiere de parametro de tipo String con el texto a buscar.
     */
    public boolean existeTareaConElTexto(String textoABuscar){
        boolean existe = false;
        String[] palabrasAEncontrar = textoABuscar.toLowerCase().split(("\\s+"));
        for (String tarea : tareasPendientes) {
            for (String palabra : palabrasAEncontrar) {
                if(tarea.contains(palabra)) {
                    existe = true;
                }
            }
        }
        return existe;
    }

    /**
     * Metodo getTareasImportantes:
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\\n3. Estudiar (Importante)\\n") 
     * siempre que la tarea contenga la palabra "importante" 
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo devuelve la cadena vacía
     */
    public String getTareasImportantes () {
        String tareaADevolver = "";
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (tareasPendientes.get(i).toLowerCase().contains("importante")) {
                tareaADevolver += (i + 1) + ". " + tareasPendientes.get(i) + "\n";
            }
        }
        return tareaADevolver;

    }

    /**
     * Metodo imprimirTareasImportantes:
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\\n3. Estudiar (Importante)\\n") 
     * siempre que la tarea contenga la palabra "importante"  
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo imprime una línea en blanco.
     **/
    public void imprimirTareasImportantes() {
        System.out.println(getTareasImportantes());
    }

    /**
     * Metodo getTareasImpares:
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama\\n3.Estudiar\\n") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo devuelve la cadena vacía.
     */
    public String getTareasImpares() {
        String tareaADevolver = "";
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (i % 2 == 0 ) {
                tareaADevolver += (i+1) + ". " + tareasPendientes.get(i) + "\n";
            }
        }
        return tareaADevolver;
    }

    /**
     * Metodo imprimirTareasImpares:
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo imprime una línea en blanco.
     */
    public void imprimirTareasImpares() {
        System.out.println(getTareasImpares());
    }
}
