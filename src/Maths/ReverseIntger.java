package Maths;

class ReverseIntger {
    public static int reverse(int x) {
        int sum = 0;
        int num = x;
        int count = 1;
        while (num!=0){
            int rem = num%10;
            count = count*10;
            num = num/10;
        }
        num = x;
        while (num!=0){
            int rem = num%10 ;
            sum = sum + rem * count ;
            num = num/10;
            count = count/10;
        }
        return sum/10;
    }
    public static void main(String[] args){
        int x = -120; // -21
        int y = 1263;
        System.out.println(reverse(x));

    }
}