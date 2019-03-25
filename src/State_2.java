public class State_2 {

    public static void main(String[] args) {
        int sts;
        int num=1;
        String str;
        for (sts=100;num<=100;num++){
            str=num+"";
            if((num%3==0 || num%5==0 || str.contains("3") || str.contains("5"))){
                if (num%5==0 && num%3==0 || (str.contains("3") && str.contains("5"))){
                    System.out.println("FizzBuzz");
                }else if (num%3==0 || str.contains("3")){
                    System.out.println("Fizz");
                }else{
                    System.out.println("Buzz");
                }
            }else{
                System.out.println(num);
            }
        }
    }

}
