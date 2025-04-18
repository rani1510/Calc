public class StandardCalulator {
    private int result;

    public int getresult(){
        return result;
    }

    public int setresult(int value){
        return this.result=value;
    }

    public int add(int num1,int num2){
        return result=num1+num2;
    }

    public int sub(int num1,int num2){
        return result=num1-num2;
    }
    public int mul(int num1,int num2){
        return result=num1*num2;
    }
    public int div(int num1,int num2){
        return result=num1/num2;
    }
}
