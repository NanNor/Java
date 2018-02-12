package Sonntag;

public class MyNumber {
    private int number;
    void add(int number){
        this.number+=number;
    }
    int value(){
        return number;
    }
    MyNumber(int number){
        this.number = number;
    }
    MyNumber addAll(MyNumber[] values) {
        int sum = 0;
        for(int i = 0; i < values.length;i++){
            sum+=values[i].value();
        }
        return new MyNumber(sum);
    }
}
