import java.util.ArrayList;

public class Doctor {
private String nombre;
private ArrayList <Turnos> misTurnos;

public Doctor(String n)
{
    this.nombre=n;
}

public ArrayList<Turnos> getTurnos()
{
    return misTurnos;
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
