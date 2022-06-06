package Decorator.src.logicaDeNegocio;

public class ConcretePromoCliente implements DecoratorPromoção{

    double valorbonus;

    @Override
    public int Calcula(int milhasvoadas) {
        if(milhasvoadas > 2000){
            int bonus = (int) (milhasvoadas * 1.1);
            return bonus;
        }else{
            return milhasvoadas;
        }
    }

    @Override
    public double CalculaBonus(int milhasVoadas){
        valorbonus = milhasVoadas * 0.45;
        return valorbonus; 
    }
}
