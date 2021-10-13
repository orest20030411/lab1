package Task10;

public class Weather {
    private int windySpeed;
    private boolean sunny;
    private boolean rainy;
    private int temperaturaMin;
    private int temperaturaMax;

    public Weather(final int windySpeed, final boolean sunny, final boolean rainy, final int temperaturaMin, final int temperaturaMax) {
        this.windySpeed = windySpeed;
        this.sunny = sunny;
        this.rainy = rainy;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    public Weather() {
    }

    public int getWindySpeed() {
        return windySpeed;
    }

    public void setWindySpeed(final int windySpeed) {
        this.windySpeed = windySpeed;
    }

    public boolean isSunny() {
        return sunny;
    }

    public void setSunny(final boolean sunny) {
        this.sunny = sunny;
    }

    public boolean isRainy() {
        return rainy;
    }

    public void setRainy(final boolean rainy) {
        this.rainy = rainy;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(final int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(final int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    @Override
    public String toString() {
        return "{windySpeed=" + windySpeed +
                ", sunny=" + sunny +
                ", rainy=" + rainy +
                ", temperaturaMin=" + temperaturaMin +
                ", temperaturaMax=" + temperaturaMax +
                '}';
    }
}
