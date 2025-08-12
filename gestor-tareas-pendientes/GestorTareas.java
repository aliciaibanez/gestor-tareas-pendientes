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

    /**
     * Metodo 'eliminarTarea'
     * Elimina la tarea cuya numeración obtenida al listar las tareas coincide
     * con el parametro indicado.
     * Devuelve true si la tarea existe y se elimina y false en caso contrario
     */
    public boolean eliminarTarea (int posicion) {
        boolean existeTarea = false;
        int i = posicion - 1;
        if (i  < tareasPendientes.size()) {
            tareasPendientes.remove(i);
            existeTarea = true;
        }
        return existeTarea;
    }

    /**
     * Metodo 'getPrimeraTareaConElTexto'
     * Devuelve un String conteniendo la primera tarea que contenga el texto
     * indicado como parametro. En caso de que no haya ninguna coincidencia
     * devuelve la cadena vacía. Hay que hacerlo con un bucle for-each.
     */

    public String getPrimeraTareaConElTexto(String tareaABuscar) {
        String tareaADevolver = "";
        for (String tarea : tareasPendientes) {
            if (tarea.contains(tareaABuscar)) {
                tareaADevolver = tarea;
                break;
            }  
        }
        return tareaADevolver;
    }

    /**
     * Metodo 'getListadoTareasWhile'
     * Devuelve un String con todas las tareas pendientes, una en cada línea, 
     * precedidas de su posicion (empezando en 1), un punto y un
     * espacio (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la
     * cadena vacía. Hay que hacerlo con un bucle while.
     */
    public String getListadoTareasWhile() {
        String tareasADevolver = "";
        int i = 0;
        while (i < tareasPendientes.size()) {
            tareasADevolver += (i+1) + ". " + tareasPendientes.get(i) + "\n";
            i++;
        }
        return tareasADevolver;
    }

    /**
     * Metodo 'imprimirListadoTareasWhile'
     * Imprime por pantalla todas las tareas
     * pendientes, una en cada línea, precedidas de su posicion (empezando en 1), un
     * punto y un espacio (por ejemplo: "1. Hacer la cama"). Si no hay tareas
     * imprime una línea en blanco. El método no devuelve nada.
     */
    public void imprimirListadoTareasWhile() {
        int i = 0;
        while (i < tareasPendientes.size()) {
            System.out.println ((i+1) + ". " + tareasPendientes.get(i));
            i++;
        }
    }

    /**
     * Metodo 'getPrimeraTareaConElTextoWhile'
     * Devuelve un String conteniendo la primera
     * tarea que contenga el texto indicado como parametro. En caso de que no haya
     * ninguna coincidencia devuelve la cadena vacía. Hay que hacerlo con un bucle
     * while. La coincidencia tiene que ser case-sensitive. El metodo debe
     * ser lo mas eficiente posible (si hay un bucle no debe dar vueltas innecesarias)
     */
    public String getPrimeraTareaConElTextoWhile(String tareaABuscar) {
        String tareaADevolver = "";
        int i = 0;
        while (i < tareasPendientes.size()) {
            if (tareasPendientes.get(i).contains(tareaABuscar)) {
                tareaADevolver = tareasPendientes.get(i);
                break;
            }
            i++;
        }
        return tareaADevolver;
    }

    /**
     * Metodo 'imprimePrimeraTareaConTextoWhile'
     * Imprime por pantalla la primera tarea
     * que contenga el texto indicado como parametro. En caso de que no haya ninguna
     * coincidencia imprime una línea en blanco. La coincidencia tiene que ser
     * case-sensitive.
     */
    public void imprimePrimeraTareaConTextoWhile(String tareaABuscar) {
        int i = 0;
        while (i < tareasPendientes.size()) {
            if (tareasPendientes.get(i).contains(tareaABuscar)) {
                System.out.println(tareasPendientes.get(i));
                break;
            }
        }
    }

    /**
     * Metodo 'getPrimerasTareas'
     * Devuelve un String conteniendo las primeras n tareas
     * (siendo n el parametro del metodo), una en cada linea con su número delante.
     * En caso de que no haya suficientes se devuelven solo las que haya. En caso de
     * no haber tareas se devuelve la cadena vacía.
     */
    public String getPrimerasTareas(int n) {
        String tareaADevolver = "";
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (n == 0) {
                tareaADevolver = "";
            }
            if (n < tareasPendientes.size() && i < n) {
                tareaADevolver += (i + 1) + ". " + tareasPendientes.get(i) + "\n";

            }
            if (n > tareasPendientes.size() && i < n) {
                tareaADevolver += (i + 1) + ". " + tareasPendientes.get(i) + "\n";

            }
            if (n == tareasPendientes.size()) {
                tareaADevolver += (i + 1) + ". " + tareasPendientes.get(i) + "\n";

            }
        }
        return tareaADevolver;
    }

    /**
     * Metodo 'imprimePrimerasTareas'
     * Imprime por pantalla las primeras n tareas (siendo
     * n el parametro del metodo), una en cada linea con su número delante. En caso
     * de que no haya suficientes se imprimen solo las que haya. En caso de no haber
     * tareas se imprime una linea en blanco. El metodo no devuelve nada y debe usar
     * el método anterior
     */
    public void imprimePrimerasTareas(int n) {
        System.out.println(getPrimerasTareas(n));
    }

    /**
     * Metodo 'hayTareaConElTextoEficiente'
     * Devuelve true si hay al menos una tarea que
     * contenga el texto indicado como parámetro y false en caso contrario. El
     * metodo se debe ejecutar de la forma mas rapida posible
     */
    public boolean hayTareaConElTextoEficiente (String texto) {
        boolean existeTarea = false;
        if(existeTareaConElTexto(texto) == true) {
            existeTarea = true;
        }
        return existeTarea;
    }

    /**
     * Metodo 'getTareasConElTexto'
     * Devuelve un String conteniendo todas las tareas que
     * contienen el texto indicado como parametro, una en cada linea (sin número
     * asociado). El String devuelto contiene una ultima linea adicional que indica
     * el numero de tareas encontradas o el texto "No se encontraron coincidencias".
     * La coincidencia tiene que ser case-sensitive.
     */
    public String getTareasConElTexto(String texto) {
        String tareaADevolver = "";
        int contadorTareas = 0;
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (tareasPendientes.get(i).contains(texto)) {
                contadorTareas++;
                tareaADevolver += tareasPendientes.get(i) + "\n";
            }
        }

        if (contadorTareas != 0) {
            tareaADevolver +=  contadorTareas;
        }

        if (contadorTareas == 0 || tareasPendientes.size() == 0) {
            tareaADevolver +=  "No se encontraron coincidencias";
        }

        return tareaADevolver;
    }

    /**
     * Metodo 'imprimirTareasConElTexto'
     * Muestra por pantalla todas las tareas que
     * contienen el texto indicado como parametro, una en cada linea. Se imprime una
     * ultima linea adicional que indica el numero de tareas encontradas o el texto
     * "No se encontraron coincidencias" si no hay ninguna que contenga el texto. La
     * coincidencia tiene que ser case-sensitive.
     */
    public void imprimirTareasConElTexto(String texto) {
        System.out.println(getTareasConElTexto(texto));
    }

    /**
     * Metodo 'eliminaPrimeraTareaConElTexto'
     * Elimina la primera tarea que contiene el
     * texto indicado por parámetro. Devuelve true si se eliminó una tarea o false
     * en caso contrario. Hay que hacerlo lo mas eficiente posible
     */
    public boolean eliminaPrimeraTareaConElTexto(String texto) {
        boolean hayTarea = false;
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if(tareasPendientes.get(i).contains(texto)) {
                hayTarea = true;
                tareasPendientes.remove(i);
                break;
            }
        }
        return hayTarea;
    }

    /**
     * Metodo 'eliminaTodasLasTareasConElTexto'
     * Elimina todas las tareas que contienen un
     * texto pasado como parametro. Devuelve el numero de tareas eliminadas. Hay que
     * hacerlo con un bucle while.
     */
    public int eliminaTodasLasTareasConElTexto(String texto) {
        int contador = 0;
        int i = 0;
        while (i < tareasPendientes.size()) {
            if (tareasPendientes.get(i).contains(texto)) {
                tareasPendientes.remove(i);
                contador++;
            } else {
                i++;
            }
        }
        return contador;
    }
}