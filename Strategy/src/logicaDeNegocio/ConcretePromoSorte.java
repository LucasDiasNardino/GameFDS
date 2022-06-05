package logicaDeNegocio;

public class ConcretePromoSorte implements IStrategy{

    public double geraNum(){
        double nrandom = Math.random();
        
        return nrandom;
    }

    @Override
    public int Calcula(int milhasvoadas) {
        double naleatotio = geraNum();        
            if(naleatotio >= 0.1 && naleatotio <= 0.7){
                milhasvoadas =(int) (milhasvoadas * naleatotio);
                System.out.println("Parabens voce ganhou!!!!!!!");
                return milhasvoadas;
                
            }else{

                System.out.println("Mais sorte da proxima vez!");
                return milhasvoadas;
            }
        
    }
}
