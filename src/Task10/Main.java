package Task10;

public class Main {
    public static void main(final String[] args) {
        final Day[] week = new Day[7];
        final String[] namesOfDay = {"Monday","Thuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<7;i++)
        {
            week[i] = new Day();
            week[i].setWeather(week[i].RandomWeather());
            week[i].setNameOfDay(namesOfDay[i]);
        }
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }
    }

}
