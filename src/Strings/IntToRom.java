package Strings;

//import java.util.HashMap;

class IntToRom {
    public static String intToRoman(int num) {
        int[] arr = { 1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<arr.length ; i++){
            while (num >= arr[i]){
                ans.append(rom[i]);
                num = num - arr[i];
            }
        }
        return ans.toString();
    }
    public static int digit(int n){
        int count = 0;
        if(n==0) return 1;
        else {
            while (n!=0){
                count++;
                n = n/10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 58 ; //" LVIII '
        System.out.println(intToRoman(num));
    }
}