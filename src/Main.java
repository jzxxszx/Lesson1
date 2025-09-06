import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        workingwithcurrency();
        weatherprint();
        fridge();
    }
    public static void workingwithcurrency(){
        final double rubles = 30002.7;

        final double rateUSD = 78.5;

        System.out.println("У вас на счету " + rubles + " рублей. В долларах это "+ rubles / rateUSD + " долларов. Так держать!");
    }
    public static void weatherprint(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите какая сейчас погода:");

        String weather = in.next();

        System.out.println(weather.equals("Дождь")? "Беру с собой зонт" : "Иду налегке");

        System.out.println("Люблю гулять!");
    }
    public static void fridge(){
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько у вас яиц в холодильнике?");

        int count_egg = in.nextInt();

        System.out.println(count_egg >= 3? "Рекомендую приготовить омлет." : "Рекомендую позавтракать бутербродами.");

        System.out.println("Приятного аппетита!");
    }
}