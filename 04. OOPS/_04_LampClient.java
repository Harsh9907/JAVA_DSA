public class _04_LampClient {
    public static void main(String[] args) {
        _03_Lamp led = new _03_Lamp();
        boolean result = led.isTurnOn();
        if (result) {
            System.out.println("Led Lamp is On");
        }

        boolean result1 = led.isTurnOff();
        if (result1 == false) {
            System.out.println("Led lamp is Off");
        }
    }
}