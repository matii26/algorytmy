import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> fibonacci() {
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int index =2;
        while(fibo.size()<40){
            fibo.add(fibo.get(index-1)+ fibo.get(index-2));
            index++;
        }
        System.out.println(fibo);
        return fibo;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        fibonacci();
    }
}