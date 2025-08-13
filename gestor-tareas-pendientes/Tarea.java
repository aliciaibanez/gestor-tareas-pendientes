public class Tarea
{
    String textoTarea;
    boolean completada;
    /**
     * Constructor for objects of class Tarea
     */
    public Tarea()
    {
        textoTarea = "";
        completada = false;
    }

    public void setTextoTarea(String texto)
    {
        textoTarea = texto;
    }
    
    public void setCompletada(boolean estado)
    {
        completada = estado;
    }
    
    public String getTextoTarea()
    {
        return textoTarea;
    }
    
    public boolean getCompletada()
    {
        return completada;
    }
    
    public String toString() {
        return textoTarea;
    }
}