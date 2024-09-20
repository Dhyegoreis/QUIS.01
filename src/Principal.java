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

        // Continue adicionando mais perguntas...

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
