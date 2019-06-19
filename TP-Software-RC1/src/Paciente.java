import java.util.ArrayList;

public class Paciente {
    private String nombre ;
    private String apellido;
    private String direccion;
    private int edad;
    private HistorialMedico historial;
    private ArrayList <Medicamento> misMedicamentos;
    private ArrayList <Medicamento> alergias;
    private FormaDePago mifdp;
    
    public Paciente(String n,String a)
    {
        this.nombre = n;
        this.apellido = a;
        misMedicamentos = new ArrayList();
        alergias = new ArrayList();    
    }
    
    public boolean addMedicamento(Medicamento m)
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
    
    public void setfdp(FormaDePago fdp)
    {
        mifdp = fdp;
    }
            
    
    
    

    
    
    
}
