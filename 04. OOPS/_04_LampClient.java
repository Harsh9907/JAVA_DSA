public class _04_LampClient {
    public static void main(String[] args) {
        _03_Lamp led = new _03_Lamp();
        _03_Lamp halogen = new _03_Lamp("java");
        boolean result = led.isTurnOn();
        if (result) {
            System.out.println("Led Lamp is On");
        }

        boolean result1 = halogen.isTurnOn();
        if (result1 == true) {
            System.out.println("Halogen lamp is On.");
        }
    }
}