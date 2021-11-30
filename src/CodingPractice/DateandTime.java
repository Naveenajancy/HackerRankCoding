package CodingPractice;

import java.time.LocalDate;

public class DateandTime {
    public static void main(String[] args) {
        String today = LocalDate.of(1990,10,15).getDayOfWeek().name();

        System.out.println(today);
    }

}
