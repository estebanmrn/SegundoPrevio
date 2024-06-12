
public class Persona
{
    private String nombre, id, tipo;
    
    public Persona (){}
    
    public Persona (String nombre, String id, String tipo){
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
    }

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie id*/
    public String getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(String id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie tipo*/
    public String getTipo(){
        return this.tipo;
    }//end method getTipo

    /**SET Method Propertie tipo*/
    public void setTipo(String tipo){
        this.tipo = tipo;
    }//end method setTipo

//End GetterSetterExtension Source Code



}//End class