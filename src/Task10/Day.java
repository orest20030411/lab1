package Task10;

public class Day {
    private Weather weather;
    private String nameOfDay;

    public Day(final Weather weather, final String nameOfDay) {
        this.weather = weather;
        this.nameOfDay = nameOfDay;
    }

    public Day() {
    }

    public Day(final String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(final Weather weather) {
        this.weather = weather;
    }

    public Weather RandomWeather() {
        final Weather a1 = new Weather();
        a1.setWindySpeed((int)(Math.random()*20));
        a1.setRainy(Math.random() < 0.5D);
        a1.setSunny(Math.random() < 0.5D);
        final int a= (int) (-30+Math.random() * 60);
        final int b= (int) (-30+Math.random() * 60);
        if(a>=b) {
            a1.setTemperaturaMax(a);
            a1.setTemperaturaMin(b);
        }
        else{
            a1.setTemperaturaMax(b);
            a1.setTemperaturaMin(a);
        }
        return a1;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(final String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    @Override
    public String toString() {
        return "Day{" +
                "Weather=" + weather.toString() +
                ", NameOfDay='" + nameOfDay + '\'' +
                '}';
    }
}
