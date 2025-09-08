package lab1;

public class Multiples {
    public static void main(String[] args) {
        multiples();
    }

    private static void multiples() {
        int currentmultiples = 0;
        for(int i=1;i<1000;i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if(divisibleBy3||divisibleBy5){
                currentmultiples++;
            }
        }
        System.out.println(currentmultiples);
    }
}
