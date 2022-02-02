package nomeeidade;

//import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nomeeidade {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String stop;
            String nome;
            String respostauser;
            String nomeirmao;
            int idadeirmao;
            int idadeambos;
            int escolha;
            int media;
            int numero;
            int primeirarespostauser;
            int idade;
            List<String> listanomes = new ArrayList<>();
            String nomesdigitados;

            System.out.println("Iniciando programa");
            System.out.println("-----------------------");
            System.out.println("Digite seu nome:");
            nome = scan.nextLine();
            System.out.println("Seja bem vindo, " + nome + "!");
            System.out.println("O que deseja fazer hoje?");
            System.out.println("Digite  1 para a função tabuada:");
            System.out.println("Digite  2 para a função listagem de nomes:");
            System.out.println("Digite  3 para a função cálculo entre idades:");
            System.out.println("----------------------------------------------");
            primeirarespostauser = scan.nextInt();
            {
                switch (primeirarespostauser) {
                    case 1 -> {
                        System.out.println("OPCÃO TABUADA SELECIONADA");
                        System.out.println("----------------------------");
                        System.out.println("Vc deseja ver a tabuada de qual número?");
                        numero = scan.nextInt();
                        System.out.println("------Tabuada do " + numero + "--------");
                        for (int i = 1; i <= 10; i++)
                            System.out.println(numero + " x " + i + " = " + numero * i);
                        System.out.println("Obrigado por participar! " + nome);
                        System.out.println("--------------------------");
                    }

                    case 2 -> {
                        System.out.println("OPCÃO LISTA DE NOMES SELECIONADA");
                        System.out.println("--------------------------");
                        System.out.println("Digite os nomes que vc deseja guardar na lista");
                        do {
                            nomesdigitados = scan.next();
                            stop = scan.nextLine();
                            listanomes.add(nomesdigitados);
                            stop = scan.nextLine();
                            if (stop.equalsIgnoreCase("parar")) {
                                System.out.println(listanomes);
                                break;
                            }

                        } while (true);
                    }
                    case 3 -> {
                        System.out.println("OPCÃO CALCULO ENTRE IDADES");
                        System.out.println("----------------------------");
                        System.out.println("Digite sua idade");
                        idade = scan.nextInt();
                        System.out.println("Digite o nome do seu irmão");
                        nomeirmao = scan.next();
                        System.out.println("Digite a idade do seu irmão");
                        idadeirmao = scan.nextInt();
                        System.out.println("Deseja obter algum cálculo entre as idades?:");
                        System.out.print("Digite S para sim ou digite N para não:");
                        respostauser = scan.next();
                        if (respostauser.equalsIgnoreCase("S"))
                            System.out.println(
                                    "Digite 1 para saber a soma , digite 2 para saber a diferenca, ou digite 3 para saber a média:");
                        if (respostauser.equalsIgnoreCase("N"))
                            System.out.println("OK! Programa finalizado!");
                        System.out.println("--------------------------");
                        escolha = scan.nextInt();
                        switch (escolha) {
                            case 1 -> {
                                idadeambos = idade + idadeirmao;
                                System.out.println(
                                        "A soma da sua idade com a do " + nomeirmao + " é de " + idadeambos
                                                + " ano(s)");
                                if (idade > idadeirmao)
                                    System.out.println("Você é mais velho que seu irmão ");
                                else
                                    System.out.println("Seu irmão é mais velho que vc ");
                                System.out.println("Obrigado por participar! " + nome);
                                System.out.println("------------------------- ");

                            }
                            case 2 -> {
                                idadeambos = idade - idadeirmao;
                                System.out.println(
                                        "A diferença da sua idade com a do " + nomeirmao + " é de " + idadeambos
                                                + " ano(s)");
                                if (idade > idadeirmao)
                                    System.out.println("Você é mais velho que seu irmão ");
                                else
                                    System.out.println("Seu irmão é mais velho que vc ");
                                System.out.println("Obrigado por participar! " + nome);
                                System.out.println("------------------------ ");
                            }
                            case 3 -> {
                                idadeambos = idade + idadeirmao;
                                media = idadeambos / 2;
                                System.out.println(
                                        "A media da sua idade com a idade do " + nomeirmao + " é de " + media
                                                + " ano(s)");
                                if (idade > idadeirmao) {
                                    System.out.println("Você é mais velho que seu irmão. ");
                                } else
                                    System.out.println("Seu irmão é mais velho que vc. ");
                                System.out.println("Obrigado por participar! " + nome);
                                System.out.println("------------------------ ");
                            }
                        }
                    }
                }
            }
        }
    }
}