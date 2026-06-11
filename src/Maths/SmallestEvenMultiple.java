package Maths;
//2413
public class SmallestEvenMultiple {
        public int smallestEvenMultiple(int n) {
            if(n%2==0){
                return n;
            }
            return n*2;
        }
        public static void main(String[] args) {
            SmallestEvenMultiple sem = new SmallestEvenMultiple();
            System.out.println(sem.smallestEvenMultiple(10));
        }
}
