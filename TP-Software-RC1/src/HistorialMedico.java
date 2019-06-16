import java.util.LinkedList;

public class HistorialMedico {
private String historia;
private LinkedList<Turnos> consultas;

public HistorialMedico(){}

public void setHistoria (String s)
{
    this.historia = s;
}

public String getHistoria()
{
    return this.historia;
}

public LinkedList<Turnos> getConsultas()
{
    return this.consultas;
}
    
}
