import java.util.Scanner;

import logicaDeNegocio.ConcreteCalculoNormal;
import logicaDeNegocio.ConcretePromoCliente;
import logicaDeNegocio.ConcretePromoSorte;
import logicaDeNegocio.ConcrtePromoVerao;
import logicaDeNegocio.IPromoção;


public class Context {
/**
 *   @param args
 */
    public static void main(String[] args) {
        //Cria os objetos de interface 
        IPromoção promoçãonormal = new ConcreteCalculoNormal();
        IPromoção promoçãocliente = new ConcretePromoCliente();
        IPromoção promoçãodasorte = new ConcretePromoSorte();
        IPromoção promoçãoverao = new ConcrtePromoVerao();
        
        //descobre quantas milhas o usuario possui
        System.out.println("Quantas milhas o senhor possui:");
        Scanner sc = new Scanner(System.in);
        int milhaVoada = sc.nextInt();
        sc.close();
        //faz os calculos das promoçoes para fins de implementação do trabalho da disciplina 
        System.out.println("Promoção Normal:"+promoçãonormal.Calcula(milhaVoada));
        System.out.println("Promoção de cliente:"+ promoçãocliente.Calcula(milhaVoada));
        System.out.println("Promoção da sorte:"+ promoçãodasorte.Calcula(milhaVoada));
        System.out.println("Promoção de verão:"+ promoçãoverao.Calcula(milhaVoada));
    }
}
