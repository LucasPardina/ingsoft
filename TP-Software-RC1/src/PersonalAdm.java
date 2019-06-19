import java.util.ArrayList;

public class PersonalAdm {
ArrayList <Turnos> allTurnos;
ArrayList <Paciente> allPacientes;
ArrayList <Doctor> misObservers;

public PersonalAdm()
{
    allTurnos = new ArrayList();
    allPacientes = new ArrayList();
    misObservers = new ArrayList();
}

public void registrarObserver(Doctor d)
{
    misObservers.add(d);
}

public void notificarObservers()
{
    for(int i=0; i < misObservers.size(); i++){
        Doctor doc = misObservers.get(i);
        doc.actualizar(allTurnos);
    }
}

public void borrarObserver(Doctor d)
{
    misObservers.remove(d);
}

public void borrarTurno(Turnos t)
{
    allTurnos.remove(t);
}

public void crearTurno(Paciente p, Doctor d, String fecha)
{
   Turnos t = new Turnos(p, d, fecha);
   allTurnos.add(t);
   notificarObservers();
}

public ArrayList <Turnos> verTurnos()
{
   return allTurnos; 
}

public void crearPaciente(String nombre, String apellido)
{
    Paciente p = new Paciente(nombre, apellido);
    allPacientes.add(p);
}

public ArrayList <Paciente> getPacientes()
{
    return allPacientes;
}



}
