public class Questao5 {
    public static void main(String[] args) {
        String[] nomes = {"Abner", "Pablo", "Carlos Alberto"};

        for (String nome : nomes) {
            StringBuilder vogais = new StringBuilder();
            StringBuilder consoantes = new StringBuilder();

            for (char c : nome.toCharArray()) {
                if (isVogal(c)) {
                    vogais.append(c).append(' ');
                } else if (Character.isLetter(c)) {
                    consoantes.append(c).append(' ');
                }
            }

            System.out.println("Nome: " + nome);
            System.out.println("Vogais: " + vogais.toString());
            System.out.println("Consoantes: " + consoantes.toString());
            System.out.println();
        }
    }

    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
