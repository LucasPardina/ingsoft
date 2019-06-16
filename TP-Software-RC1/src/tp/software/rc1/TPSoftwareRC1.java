package tp.software.rc1;

public class TPSoftwareRC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Autent cuadro1 = new Autent();
    cuadro1.setVisible(true);
    Usuario user = new Usuario(1);
    user.SetTipo("Admin");
    if(user.isMedico())
    {
        System.out.printf("El usuario "+user.getID()+" es un medico\n");
    }
    else
    {
        System.out.printf("El usuario "+user.getID()+" no es un medico\n");
    }
    }
    
}
