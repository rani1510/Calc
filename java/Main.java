public class Main{
    public static void main(String[] args){
        StandardCalulator calc= new StandardCalulator();
        int add=calc.add(2, 2);
        System.out.println(add);
        ScientificCalculator calc2=new ScientificCalculator();
        System.out.println(calc2.cubeof(add));
    }
}