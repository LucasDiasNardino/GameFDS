![image](https://user-images.githubusercontent.com/88353815/172222895-96b6c653-fa00-4fed-8c17-993e02f5ceff.png)

Diagrama de classes do exercício 6 + 7, que se referiam aos padrões de projeto builder e state, respectivamente.

O padrão de projeto State é comportamental, ou seja, um contexto, neste caso, os diferentes tipos de conta que expõem um comportamento baseado em estados. Objeto estado possui diferentes alternativas de implementação do comportamento condicionado a um estado. 

A conta de uma pessoa pode ter três estados neste exemplo: Normal, Premium e Advanced. 
De acordo com o estado que se encontra a conta algumas operações poderão mudar, estas são: Deposito no saldo de investimento, que se a conta for Advanced receberá 10% de bônus e a Retirada à Descoberto é isenta de juros na conta Premium, caso a retirada não ultrapasse 25% do limite total (foi utilizado 1,5% de juros).

Para implementar o padrão state, foi criada uma interface EstadoCategoria com os métodos de depósito e retirada, logo, mais 3 classes que implementam EstadoCategoria em suas três modalidades de conta (EstadoCategoriaNormal, EstadoCategoriaPremium, EstadoCategoriaAdvanced) com suas peculiaridades descritas acima.

![image](https://user-images.githubusercontent.com/88353815/172625600-5da2fac0-07eb-4859-b09f-8e276fc116ed.png)


Para executar os métodos do padrão state é preciso criar uma instância de Estado Categoria na classe Conta e depois definir qual subclasse será usada para implementar a interface de acordo com a categoria da conta.

![image](https://user-images.githubusercontent.com/88353815/172626414-b535cf6a-e5ea-4b06-bc7b-28677314cb1c.png)

![image](https://user-images.githubusercontent.com/88353815/172626705-61de1640-b719-4472-9cea-36e7d906a8db.png)


Como conta estava implementada com o padrão builder o padrão state e esta intância da Interface tiveram que ser incorporados ao Builder.

![image](https://user-images.githubusercontent.com/88353815/172626504-141995e2-0220-44ae-91de-350e5e42f4c9.png)

![image](https://user-images.githubusercontent.com/88353815/172626561-4564526f-cda7-4951-92f8-382a5ef9f273.png)
