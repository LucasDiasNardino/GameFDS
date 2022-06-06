package Decorator.src.logicaDeNegocio;
public class ConcreteCalculoNormal implements DecoratorPromoção {

    double valorbonus; 

    @Override
    public int Calcula(int milhaVoada) {
        return milhaVoada;
    }

    @Override
    public double CalculaBonus(int milhaVoada) {
        valorbonus = 0;
        return valorbonus; 
    }
}
