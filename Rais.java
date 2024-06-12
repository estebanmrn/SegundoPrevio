
public class Rais extends RegimenPensional
{
    @Override 
    public double calcularPension (int expectativaVida, double saldoAcumulado){
        return saldoAcumulado / expectativaVida;
        
    }
    
    @Override 
    public double calcularAporteMensual (double salario){
        return salario * 0.16;
    }
    
    @Override 
    public double simularPensionFutura(double salario, int añosCotizados, double saldoAcumulado, int expectativaVida){
        return calcularPension(expectativaVida, saldoAcumulado);
    }
    
    }

