package modulo5;

public class Main {
    public static void main(String[] args) {
        String txt = "Mentorama - Java";
        String txt1 = "Mentorama - JAVA";
        System.out.println(txt.charAt(1)); //charAt pega apena um elemento da string

        System.out.println(txt.compareTo(txt1));
        System.out.println(txt.compareToIgnoreCase(txt1));

        System.out.println(txt.equals(txt1));
        System.out.println(txt.equalsIgnoreCase(txt1));

        System.out.println(txt.startsWith("Men"));
        System.out.println(txt1.endsWith("JAVA"));

        String[] txto = txt.split("-"); // quebra uma string
        for (String i: txto) {
            System.out.println(i.trim()); //trim() corta espaços
         }

        String vazia = "A";
        System.out.println(vazia.isEmpty());

        System.out.println(txt.substring(1,4));
        System.out.println("carro ".concat("veloz"));

        System.out.println(Cores.VERDE.getTexto());
    }
}
