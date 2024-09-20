import java.util.Scanner;

public class Principal {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }

    public String leiaResposta() {
        Scanner scanner = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = scanner.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println();
        return false;
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Principal[] perguntas = new Principal[15];
        int acertos = 0;

        // Criação das perguntas
        perguntas[0] = new Principal();
        perguntas[0].pergunta = "Qual a capital da França?";
        perguntas[0].opcaoA = "Londres";
        perguntas[0].opcaoB = "Paris";
        perguntas[0].opcaoC = "Berlim";
        perguntas[0].opcaoD = "Madrid";
        perguntas[0].opcaoE = "Roma";
        perguntas[0].correta = "B";

        perguntas[1] = new Principal();
        perguntas[1].pergunta = "Quem descobriu o Brasil?";
        perguntas[1].opcaoA = "Cristóvão Colombo";
        perguntas[1].opcaoB = "Dom Pedro I";
        perguntas[1].opcaoC = "Pedro Álvares Cabral";
        perguntas[1].opcaoD = "Américo Vespúcio";
        perguntas[1].opcaoE = "Vasco da Gama";
        perguntas[1].correta = "C";

        // Adicione aqui as outras 13 perguntas
        // Exemplo de outra pergunta:

        perguntas[2] = new Principal();
        perguntas[2].pergunta = "Qual é a fórmula da água?";
        perguntas[2].opcaoA = "H2O";
        perguntas[2].opcaoB = "CO2";
        perguntas[2].opcaoC = "O2";
        perguntas[2].opcaoD = "H2SO4";
        perguntas[2].opcaoE = "NaCl";
        perguntas[2].correta = "A";


        perguntas[3] = new Principal();
        perguntas[3].pergunta = "quanto e dois x dois?";
        perguntas[3].opcaoA = "2";
        perguntas[3].opcaoB = "4";
        perguntas[3].opcaoC = "8";
        perguntas[3].opcaoD = "3";
        perguntas[3].opcaoE = "0";
        perguntas[3].correta = "B";

        perguntas[4] = new Principal();
        perguntas[4].pergunta = " Qunato e 8x5?";
        perguntas[4].opcaoA = "45";
        perguntas[4].opcaoB = "25";
        perguntas[4].opcaoC = "40";
        perguntas[4].opcaoD = "35";
        perguntas[4].opcaoE = "32";
        perguntas[4].correta = "C";

        perguntas[5] = new Principal();
        perguntas[5].pergunta = "50/25 ?";
        perguntas[5].opcaoA = "25";
        perguntas[5].opcaoB = "2";
        perguntas[5].opcaoC = "5";
        perguntas[5].opcaoD = "30";
        perguntas[5].opcaoE = "15";
        perguntas[5].correta = "B";

        perguntas[6] = new Principal();
        perguntas[6].pergunta = " qual e valor de Pi?";
        perguntas[6].opcaoA = "3";
        perguntas[6].opcaoB = "3,18";
        perguntas[6].opcaoC = "6";
        perguntas[6].opcaoD = "3,14";
        perguntas[6].opcaoE = "3,16";
        perguntas[6].correta = "D";

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

    }
}
