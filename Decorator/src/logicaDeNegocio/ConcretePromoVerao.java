package Decorator.src.logicaDeNegocio;

public class ConcretePromoVerao implements DecoratorPromoção{

    double valorbonus;

    @Override
    public int Calcula(int milhaVoada) {
        return milhaVoada*2;
    }

    @Override
    public double CalculaBonus(int milhasVoadas){
        valorbonus = milhasVoadas * 0.2;
        return valorbonus; 
    }
}
