package logicaDeNegocio;

public class ConcretePromoCliente implements IStrategy{

    @Override
    public int Calcula(int milhasvoadas) {
        if(milhasvoadas > 2000){
            int bonus = (int) (milhasvoadas * 1.1);
            return bonus;
        }else{
            return milhasvoadas;
        }
    }
}
