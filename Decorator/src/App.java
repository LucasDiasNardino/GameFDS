package Decorator.src;

import java.util.Scanner;

import Decorator.src.logicaDeNegocio.ConcreteCalculoNormal;
import Decorator.src.logicaDeNegocio.ConcretePromoCliente;
import Decorator.src.logicaDeNegocio.ConcretePromoSorte;
import Decorator.src.logicaDeNegocio.ConcretePromoVerao;
import Decorator.src.logicaDeNegocio.DecoratorPromoção;


public class App {
/**
 *   @param args
 */
    public static void main(String[] args) {
        //Cria os objetos de interface 
        DecoratorPromoção promoçãonormal = new ConcreteCalculoNormal();
        DecoratorPromoção promoçãocliente = new ConcretePromoCliente();
        DecoratorPromoção promoçãodasorte = new ConcretePromoSorte();
        DecoratorPromoção promoçãoverao = new ConcretePromoVerao();
        
        //descobre quantas milhas o usuario possui
        System.out.println("Quantas milhas o senhor possui:");
        Scanner sc = new Scanner(System.in);
        int milhaVoada = sc.nextInt();
        sc.close();
        //faz os calculos das promoçoes para fins de implementação do trabalho da disciplina 
        System.out.println("Promoção Normal: "+promoçãonormal.Calcula(milhaVoada));
        System.out.println("Promoção de cliente: "+ promoçãocliente.Calcula(milhaVoada));
        System.out.println("Promoção da sorte: "+ promoçãodasorte.Calcula(milhaVoada));
        System.out.println("Promoção de verão: "+ promoçãoverao.Calcula(milhaVoada));
        System.out.println("===================================================");
        System.out.println("Promoção Normal + Bônus de Cliente: " + (promoçãonormal.Calcula(milhaVoada) + promoçãocliente.CalculaBonus(milhaVoada)));
        System.out.println("Promoção Normal + Bônus de Veráo: " + (promoçãonormal.Calcula(milhaVoada) + promoçãoverao.CalculaBonus(milhaVoada)));
        System.out.println("Promoção de Cliente + Bônus de Sorte: " + (promoçãocliente.Calcula(milhaVoada) + promoçãodasorte.CalculaBonus(milhaVoada)));
    }
}
