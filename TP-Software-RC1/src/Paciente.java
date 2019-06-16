import java.util.List;

public class Paciente {
    private String nombre ;
    private String apellido;
    private String direccion;
    private int edad;
    private HistorialMedico historial;
    private List<String> misMedicamentos;
    private List<String> alergias;
    
    public Paciente(String n,String a,String d, int e)
    {
        this.nombre = n;
        this.apellido = a;
        this.direccion = d;
        this.edad = e;
    }
    
    
    
    
}
