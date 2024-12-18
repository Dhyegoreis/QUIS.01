import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Principal[] perguntas = new Principal[15];
        int acertos = 0;

        // Criação das perguntas
        perguntas[0] = new Principal();
        perguntas[0].pergunta = "Si um circulo tem um diamenro de 60 cm. Qual e o valor de r ?";
        perguntas[0].opcaoA = "25";
        perguntas[0].opcaoB = "50";
        perguntas[0].opcaoC = "30";
        perguntas[0].opcaoD = "10";
        perguntas[0].opcaoE = "60";
        perguntas[0].correta = "C";

        perguntas[1] = new Principal();
        perguntas[1].pergunta = "Quem e o pai da matemática ?";
        perguntas[1].opcaoA = " Arquimedes ";
        perguntas[1].opcaoB = "Euclides";
        perguntas[1].opcaoC = "Pedro Álvares Cabral";
        perguntas[1].opcaoD = "Pitágoras";
        perguntas[1].opcaoE = "Vasco da Gama";
        perguntas[1].correta = "D";

        // Adicione aqui as outras 13 perguntas
        // Exemplo de outra pergunta:

        perguntas[2] = new Principal();
        perguntas[2].pergunta = "Qual e o resultado final dessa operação (3 x 4) + (4 x 3 ) - (5 x 2)?";
        perguntas[2].opcaoA = "10";
        perguntas[2].opcaoB = "13";
        perguntas[2].opcaoC = "20";
        perguntas[2].opcaoD = "30";
        perguntas[2].opcaoE = "14";
        perguntas[2].correta = "E";


        perguntas[3] = new Principal();
        perguntas[3].pergunta = "Quanto e dois x dois?";
        perguntas[3].opcaoA = "2";
        perguntas[3].opcaoB = "4";
        perguntas[3].opcaoC = "8";
        perguntas[3].opcaoD = "3";
        perguntas[3].opcaoE = "0";
        perguntas[3].correta = "B";

        perguntas[4] = new Principal();
        perguntas[4].pergunta = " Quanto e 8x5?";
        perguntas[4].opcaoA = "45";
        perguntas[4].opcaoB = "25";
        perguntas[4].opcaoC = "40";
        perguntas[4].opcaoD = "35";
        perguntas[4].opcaoE = "32";
        perguntas[4].correta = "C";

        perguntas[5] = new Principal();
        perguntas[5].pergunta = " qual e o valor de 50/25 ?";
        perguntas[5].opcaoA = "25";
        perguntas[5].opcaoB = "2";
        perguntas[5].opcaoC = "5";
        perguntas[5].opcaoD = "30";
        perguntas[5].opcaoE = "15";
        perguntas[5].correta = "B";

        perguntas[6] = new Principal();
        perguntas[6].pergunta = " Qual e valor de Pi ?";
        perguntas[6].opcaoA = "3";
        perguntas[6].opcaoB = "3,18";
        perguntas[6].opcaoC = "6";
        perguntas[6].opcaoD = "3,14";
        perguntas[6].opcaoE = "3,16";
        perguntas[6].correta = "D";

        perguntas[7] = new Principal();
        perguntas[7].pergunta = " Quanto e 1000 x 0,5 ?";
        perguntas[7].opcaoA = "500";
        perguntas[7].opcaoB = "1500";
        perguntas[7].opcaoC = "2000";
        perguntas[7].opcaoD = "550";
        perguntas[7].opcaoE = "1550";
        perguntas[7].correta = "A";

        perguntas[8] = new Principal();
        perguntas[8].pergunta = "quanto e 10 x (50 - 45) ? ";
        perguntas[8].opcaoA = "50";
        perguntas[8].opcaoB = "10";
        perguntas[8].opcaoC = "60";
        perguntas[8].opcaoD = "25";
        perguntas[8].opcaoE = "5";
        perguntas[8].correta = "A";

        perguntas[9] = new Principal();
        perguntas[9].pergunta = "Quanto e 20 x 30 ? ";
        perguntas[9].opcaoA = "500";
        perguntas[9].opcaoB = "300";
        perguntas[9].opcaoC = "100";
        perguntas[9].opcaoD = "600";
        perguntas[9].opcaoE = "650";
        perguntas[9].correta = "D";

        perguntas[10] = new Principal();
        perguntas[10].pergunta = "Quanto e (5 + 4) * (8 + 9) / ( 2 * 4) ? ";
        perguntas[10].opcaoA = "10";
        perguntas[10].opcaoB = "8";
        perguntas[10].opcaoC = "25";
        perguntas[10].opcaoD = "5";
        perguntas[10].opcaoE = "30";
        perguntas[10].correta = "B";

        perguntas[11] = new Principal();
        perguntas[11].pergunta = "Quanto e 5 * 4 / 2 ? ";
        perguntas[11].opcaoA = "2";
        perguntas[11].opcaoB = "10";
        perguntas[11].opcaoC = "15";
        perguntas[11].opcaoD = "6";
        perguntas[11].opcaoE = "3";
        perguntas[11].correta = "B";

        perguntas[12] = new Principal();
        perguntas[12].pergunta = "Quanto e (20 / 0,5 ) * 10 ?  ";
        perguntas[12].opcaoA = "40";
        perguntas[12].opcaoB = "20";
        perguntas[12].opcaoC = "100";
        perguntas[12].opcaoD = "200";
        perguntas[12].opcaoE = "400";
        perguntas[12].correta = "E";

        perguntas[13] = new Principal();
        perguntas[13].pergunta = "Onde a matemática pode ser usada ? ";
        perguntas[13].opcaoA = "Agricultura";
        perguntas[13].opcaoB = "Finanças Pessoais";
        perguntas[13].opcaoC = "Engenharia";
        perguntas[13].opcaoD = "Tecnologia da Informação";
        perguntas[13].opcaoE = "Todas as alternativas estão corretas ";
        perguntas[13].correta = "E";

        perguntas[14] = new Principal();
        perguntas[14].pergunta = "Qual é o oposto de divisão ";
        perguntas[14].opcaoA = "adição";
        perguntas[14].opcaoB = "subtração";
        perguntas[14].opcaoC = "somatória";
        perguntas[14].opcaoD = "multiplicação ";
        perguntas[14].opcaoE = "fração";
        perguntas[14].correta = "D";


        // Início do quiz
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Questão " + (i + 1) + ":");
            perguntas[i].escrevaQuestao();
            String resposta = perguntas[i].leiaResposta();
            if (perguntas[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        // Resultado final
        System.out.println("Você acertou " + acertos + " de 15 perguntas.");

        double porcentagem = ((double) acertos / perguntas.length) * 100;
        System.out.printf("Sua porcentagem de acertos foi: %.2f%%\n", porcentagem);

        scanner.close();

    }
}