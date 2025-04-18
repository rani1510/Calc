public class ScientificCalculator {
    public double squareof(double num){
        return num*num;
    }
    public double cubeof(double num){
        return num*num*num;
    }
    public double powerof(double base,double exponent){
        return Math.pow(base,exponent);
    }
    public double sqaurerootof(double num){
        return Math.sqrt(num);
    }
    public int modulo(int divident,int divisor){
        return divident%divisor;
    } 
    public double modulo_double(double divident,double divisor){
        return divident%divisor;
    }
}