public class _03_Lamp {
    public boolean isOn;
    private String name;

    public boolean isTurnOn() {
        isOn = true;
        return isOn;
    }

    _03_Lamp() { // no arg constructor
        System.out.println("Both lamp is turned on");
    }

    _03_Lamp(String lang) { // parameterzed constructor
        name = lang;
        System.out.println(name + " is a programming language");
    }
    // Default constructor , if we dont create any constructor, then java
    // automatically create the default compiler
}