package Arrays;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxaltitude = 0;
        int currentaltitude = 0;
        for(int i = 0;i<gain.length;i++){
            currentaltitude += gain[i];

            if(currentaltitude>maxaltitude){
                maxaltitude = currentaltitude;
            }
        }
        return maxaltitude;
    }
}
