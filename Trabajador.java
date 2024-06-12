

public class Trabajador extends Persona
{
    private double salario; 
    private RegimenPensional regimen;
    private int añosCotizados;
    private int semanasCotizadas;
    
    public Trabajador(){}
    
    public Trabajador (String nombre, String id, String tipo, double salario, RegimenPensional regimen, int añosCotizados){
        super(nombre, id, tipo);
        this.salario = salario;
        this.regimen = regimen;
        this.añosCotizados = añosCotizados;
    }
//Start GetterSetterExtension Source Code

    /**GET Method Propertie salario*/
    public double getSalario(){
        return this.salario;
    }//end method getSalario

    /**SET Method Propertie salario*/
    public void setSalario(double salario){
        this.salario = salario;
    }//end method setSalario

    /**GET Method Propertie regimen*/
    public RegimenPensional getRegimen(){
        return this.regimen;
    }//end method getRegimen

    /**SET Method Propertie regimen*/
    public void setRegimen(RegimenPensional regimen){
        this.regimen = regimen;
    }//end method setRegimen
    
    public int getAñosCotizados(){
        return this.añosCotizados;
    }
    
    public void setAñosCotizados(int añosCotizados){
        this.añosCotizados = añosCotizados;
    }


}//End class