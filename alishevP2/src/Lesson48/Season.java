package Lesson48;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    Season(int temperature) {
        this.temperature = temperature;
    }
}