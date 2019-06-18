
public class Main {
    
    public static void main(String[] args)
    {
    Autent cuadro1 = new Autent();
    cuadro1.setVisible(true);
    Usuario user = new Usuario(1);
    user.SetTipo("Admin");
    if(user.isDoctor())
    {
        System.out.printf("El usuario "+user.getID()+" es un doctor\n");
    }
    else
    {
        System.out.printf("El usuario "+user.getID()+" no es un doctor\n");
    }

    }
    
}
