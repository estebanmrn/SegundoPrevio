import java.util.List;
import java.util.ArrayList;
public abstract class RegimenPensional
{
    private String nombreRegimen; 
    private List<Trabajador> trabajadores;
    
    public RegimenPensional (){
        this.trabajadores = new ArrayList <>();
    }
    
    public List<Trabajador> getTrabajadores(){
        return trabajadores;
    }

    public void afiliarTrabajador (Trabajador trabajador){
        trabajadores.add(trabajador);
        System.out.println ("Trabajador afiliado al regimen: " + this.getClass().getSimpleName());
    }
    
    public abstract double calcularAporteMensual (double salario);
    
    
    public abstract double calcularPension(int añosCotizados, double salario);
    
    public abstract double simularPensionFutura(double salario, int añosCotizados, double saldoAcumulado, int expectativaVida);
    }


