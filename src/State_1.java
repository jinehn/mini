public class State_1 {

    public static void main(String[] args) {
        int sts;
        int num=1;
        for (sts=100;num<=100;num++){
            if (num%5==0 || num%3==0){
               if (num%5==0 && num%3==0){
                   System.out.println("FizzBuzz");
               }else if (num%3==0){
                   System.out.println("Fizz");
               }else {
                   System.out.println("Buzz");
               }
            }else {
                System.out.println(num);
            }
        }
    }
}
