import java.util.LinkedList;

public class Doctor {
private String nombre;
private LinkedList<Turnos> ListaT;

public Doctor(String n)
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

public String recetar(Paciente p, Medicamento m)
{     
    if(p.addMedicamento(m);)
    {
        return "Medicamento recetado con exito";
    }
    else
        return "El paciente " + p.getNombre() + " es alergico a " + m.getNombre();
}



}
