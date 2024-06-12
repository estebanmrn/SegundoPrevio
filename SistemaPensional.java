import java.util.List;
import java.util.ArrayList;
public class SistemaPensional
{
    private List<RegimenPensional> regimenes;
    
    public SistemaPensional(){
        this.regimenes = new ArrayList<>();
    }
    
    public void agregarRegimen (RegimenPensional regimen){
        regimenes.add(regimen);
    }
    
    public void afiliarTrabajadores (Trabajador trabajador, RegimenPensional regimen){
        regimen.afiliarTrabajador(trabajador);
    }
    
    public double calcularPensionTrabajador(Trabajador trabajador){
        return trabajador.getRegimen().calcularPension(trabajador.getAñosCotizados(), trabajador.getSalario());
    }
    
    public double calcularTrabajadorRais(Trabajador trabajador, double saldoAcumulado, int expectativaVida){
        if(trabajador.getRegimen() instanceof Rais){
            return ((Rais) trabajador.getRegimen()).calcularPension(expectativaVida, saldoAcumulado);
        }
        return 0;
    }
    
    public double calcularAporteMensual (Trabajador trabajador){
        return trabajador.getRegimen().calcularAporteMensual(trabajador.getSalario());
    }
    
    public double simularPensionFuturaTrabajador(Trabajador trabajador, double saldoAcumulado, int expectativaVida) {
        return trabajador.getRegimen().simularPensionFutura(trabajador.getSalario(), trabajador.getAñosCotizados(), saldoAcumulado, expectativaVida);
    }
}
