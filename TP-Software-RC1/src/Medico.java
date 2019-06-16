import java.util.LinkedList;

public class Medico {
private String nombre;
private LinkedList<Turnos> ListaT;

public Medico(String n)
{
    this.nombre=n;
}

public void setTurnos(LinkedList<Turnos> l)
{
    this.ListaT = l;
}

public LinkedList<Turnos> getTurnos()
{
    return this.ListaT;
}
}
