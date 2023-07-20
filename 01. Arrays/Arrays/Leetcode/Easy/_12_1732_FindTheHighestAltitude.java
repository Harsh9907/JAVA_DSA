package Easy;
public class _12_1732_FindTheHighestAltitude{
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int result = findHighestAltitude(gain);
        System.out.println("The Output is " + result);
    }
    public static int findHighestAltitude(int[] gain) {
            int currentAltitude = 0;
            // Highest altitude currently is 0.
            int highestPoint = currentAltitude;

            for (int altitudeGain : gain) {
                // Adding the gain in altitude to the current altitude.
                currentAltitude += altitudeGain;
                // Update the highest altitude.
                highestPoint = Math.max(highestPoint, currentAltitude);
            }
            return highestPoint;
    }
}
