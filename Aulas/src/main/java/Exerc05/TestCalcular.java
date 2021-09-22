package Exerc05;

public class TestCalcular {
    public static void main (String[] args){
        Double s1 = 1.0,s2 = 2.0,s3 = 5.5,s4 = 8.1,s5 = 3.0;
        Calcular c1 = new Calcular(s1,s2);
        Calcular c2 = new Calcular(s1,s2,s3);
        Calcular c3 = new Calcular(s1,s2,s3,s4);
        Calcular c4 = new Calcular(s1,s2,s3,s4,s5);

        System.out.println(c1.getTotal());
        System.out.println(c2.getTotal());
        System.out.println(c3.getTotal());
        System.out.println(c4.getTotal());

       /* c1.Somar(s1,s2);
        c1.Somar(s1,s2,s3);
        c1.Somar(s1,s2,s3,s4);
        c1.Somar(s1,s2,s3,s4,s5);

        System.out.println(c1.Somar(s1,s2)+"\n"+ c1.Somar(s1,s2,s3)+"\n"+c1.Somar(s1,s2,s3,s4)+"\n"+c1.Somar(s1,s2,s3,s4,s5));*/
    }
}
