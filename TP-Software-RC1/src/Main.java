
public class Main {
    
    public static void main(String[] args)
    {
        PersonalAdm personalAdm = new PersonalAdm();
        Doctor Martin = new Doctor("Martin", personalAdm);
        Doctor Julian = new Doctor("Julian", personalAdm);
        personalAdm.registrarObserver(Martin);
        personalAdm.registrarObserver(Julian);
        
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
