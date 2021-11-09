package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 4 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */
public class Main {

    public static void main(String[] args) {

        //Downcast com perca de informação
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        //Upcast
        long l1;
        int i1 = 10;
        l1 = i1;

        //Downcast com perca de informação
        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        //Downcast SEM perca de informação
        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        //Upcast
        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        //Downcast SEM perca de informação
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        //Downcast com perca de informação
        f3 = (float) d3;

        //Downcast com perca de informação - truncar, descartar casas decimais
        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);

        //Downcast com perca de informação
        b1 = (byte) d3;

        System.out.println("b1:" + b1);

    }
}