import java.util.ArrayList;

public class Doctor {
private String nombre;
private ArrayList <Turnos> misTurnos;
private PersonalAdm persAdm;  //Sujeto a quien observo

public Doctor(String n, PersonalAdm pa)
{
    this.nombre=n;
    persAdm = pa;
}

public ArrayList<Turnos> getTurnos()
{
    return misTurnos;
}

public void actualizar(ArrayList <Turnos> t)
{
    misTurnos = t;
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
