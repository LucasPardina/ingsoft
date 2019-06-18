import java.util.ArrayList;

public class Paciente {
    private String nombre ;
    private String apellido;
    private String direccion;
    private int edad;
    private HistorialMedico historial;
    private ArrayList <Medicamento> misMedicamentos;
    private ArrayList <Medicamento> alergias;
    
    public Paciente(String n,String a,String d, int e)
    {
        this.nombre = n;
        this.apellido = a;
        this.direccion = d;
        this.edad = e;
        misMedicamentos = new ArrayList();
        alergias = new ArrayList();
    }
    
    public bool addMedicamento(Medicamento m)
    {
        if(alergias.contains(m))
        {
            return false;
        }
        else
        {
            misMedicamentos.add(m);
            return true;
        }
    }
    
    public String getNombre()
    {
        return nombre;
    }
            
    
    
    

    
    
    
}
