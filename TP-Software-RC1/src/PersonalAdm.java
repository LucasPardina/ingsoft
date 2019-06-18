import java.util.ArrayList;

public class PersonalAdm {
ArrayList <Turnos> allTurnos;
ArrayList <Paciente> allPacientes;
ArrayList <Doctor> misObservers;

public PersonalAdm()
{
    allTurnos = new ArrayList();
    allPacientes = new ArrayList();
}

public void registrarObserver(Doctor d)
{
    misObservers.add(d);
}

public void notificarObservers()
{
    
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



}
