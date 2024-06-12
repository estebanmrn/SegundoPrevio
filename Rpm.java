
public class Rpm extends RegimenPensional
{
    @Override 
    public double calcularPension (int añosCotizados, double salario){
        double salarioPromedio = calcularSalarioPromedio(salario, añosCotizados);
        
        double porcentajePension = calcularPorcentajePension (añosCotizados);
        
        return salarioPromedio * porcentajePension;
    }
    
    
    private double calcularSalarioPromedio (double salario, int añosCotizados){
        return salario * 0.8; //suponiendo que la inflacion es del 20%
        
    }
    
    private double calcularPorcentajePension (int añosCotizados){
        double porcentajeBase = 0.65;
        int semanasBase = 1300;
        
        if(añosCotizados > semanasBase / 52){
            int semanasAdicionales = añosCotizados * 52 - semanasBase;
            porcentajeBase += semanasAdicionales / 50 * 0.015;
            porcentajeBase = Math.min(porcentajeBase, 0.8);
            
        }
        return porcentajeBase;
    }
    
    @Override 
    public double calcularAporteMensual(double salario){
        return salario * 0.16;
    }
    
    @Override
    public double simularPensionFutura (double salario, int añosCotizados, double saldoAcumulado, int expectativaVida){
        return calcularPension(añosCotizados, salario);
    }
    
    
    
}
