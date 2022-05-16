package modulo6;

public class Arrays {

    public static void main(String[] args) {
        int[] array = new int[4];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("------------");

        int[] array1 = new int[array.length];
        int posicaoMaxima = array.length - 1;

        for (int i = posicaoMaxima; i >= 0; i--) {
            array1[posicaoMaxima - 1] = array[i];
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
