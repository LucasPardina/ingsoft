
public class Usuario {
private int id;
private String tipo ="";

public Usuario(int n)
{
    this.id = n;
}

public boolean isMedico()
{
    if(this.tipo=="Med")
    {
        return true;
    }
    else
    {
        return false;  
    }
}

public int getID()
{
    return this.id;
}

public String getTipo()
{
    return this.tipo;
}

public void SetId( int a)
{
    this.id=a;
}

public void SetTipo(String a)
{
    this.tipo = a;
}

}
