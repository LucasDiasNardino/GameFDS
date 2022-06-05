package Decorator.src.logicaDeNegocio;

public class ConcrtePromoVerao implements IPromoção{

    @Override
    public int Calcula(int milhaVoada) {
        // TODO Auto-generated method stub
        return milhaVoada*2;
    }
}
