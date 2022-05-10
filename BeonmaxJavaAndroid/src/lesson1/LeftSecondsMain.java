package lesson1;

public class LeftSecondsMain {

	public static void main(String[] args) {
	 
     int seconds = 900000;
     int secondsInMinutes = 60;
     int secondsInHours = secondsInMinutes*60;
     int secondsInDays = secondsInHours*24;
     
     int days = seconds/secondsInDays;
     int hours = (seconds%secondsInDays)/secondsInHours;
     int minutes = ((seconds%secondsInDays)%secondsInHours)/secondsInMinutes;
     
     int leftSeconds = seconds - days*secondsInDays - hours*secondsInHours - minutes*secondsInMinutes;
     
         System.out.println("Данно секунд: " + seconds);
         System.out.println(seconds+" секунд - дней: "+ days);
         System.out.println(seconds+" секунд - часов: "+ hours);
         System.out.println(seconds+" секунд - минут: "+ minutes);
         System.out.println("В данных секундах остаток: "+ leftSeconds);
	}

}
