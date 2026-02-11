package DSA_Practice;

public class CalculateAngleHourAndMin {
    public static void main(String[] args) {
        int hour = 3;
        int min = 30;
        double hourAngle = (hour*30)+(min*0.5);
        double minAngle = min*6;

        double angle  = Math.abs(hourAngle-minAngle);
        angle = Math.min(angle, 360-angle);

        System.out.println(angle);
    }
}
