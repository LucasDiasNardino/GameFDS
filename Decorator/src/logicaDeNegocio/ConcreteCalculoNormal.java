package Decorator.src.logicaDeNegocio;
public class ConcreteCalculoNormal implements IPromoção {

    @Override
    public int Calcula(int milhaVoada) {
        
        return milhaVoada;
    }
}
