import java.util.ArrayList;

public class Doctor {
private String nombre;
private ArrayList <Turnos> misTurnos;
private PersonalAdm persAdm;  //Sujeto a quien observo

public Doctor(String n, PersonalAdm pa)
{
    nombre = n;
    persAdm = pa;
    persAdm.registrarObserver(this);  //me registro como observador a PersonalAdm
}

public ArrayList<Turnos> getTurnos()
{
    return misTurnos;
}

public void actualizar(ArrayList <Turnos> t)
{
    misTurnos = t;
}
public void recetar(Paciente p, Medicamento m)
{     
    //tendria que devolver un string avisando si se pudo recetar o no
}



}
