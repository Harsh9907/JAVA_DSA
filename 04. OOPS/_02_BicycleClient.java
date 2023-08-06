public class _02_BicycleClient {
    public static void main(String[] args) {
        _01_Bicycle sportBike = new _01_Bicycle();
        System.out.println(sportBike.gear);

        String result = sportBike.braking();
        System.out.println(result + "   Harsh");
    }
}