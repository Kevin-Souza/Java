package Exerc05;

public class Calcular {
    private Double total;

    Calcular(double s1,double s2){
        total = s1+s2;
    }
    Calcular(double s1,double s2,double s3){
        total = s1+s2+s3;
    }
    Calcular(double s1,double s2,double s3, double s4){
        total = s1+s2+s3+s4;
    }
    Calcular(double s1,double s2,double s3,double s4,double s5){
        total = s1+s2+s3+s4+s5;
    }

    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    /*public double Somar (double s1 , double s2){
        return s1+s2;
    }

    public double Somar (double s1 , double s2, double s3){
        return s1+s2+s3;
    }

    public double Somar (double s1 , double s2, double s3, double s4){
        return s1+s2+s3+s4;
    }

    public double Somar (double s1 , double s2, double s3, double s4, double s5){
        return s1+s2+s3+s4+s5;
    }*/

}
