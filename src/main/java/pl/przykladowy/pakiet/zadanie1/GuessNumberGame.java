package pl.przykladowy.pakiet.zadanie1;

public class GuessNumberGame {
    public int i = 25;
    public int guessNumber;


    public String getIntro() {
        //wprowadzenie

        return "Witamy w grze." + " " +
                "Jeśli nie trafisz liczby nie przejmuj się i próbuj dalej." + " " + "Masz kilka szans";

    }

    public boolean isRunning() {

        if (guessNumber == i) {
            System.out.println("WYGRANA");
            return false;

        } else {
            return true;
        }
    }

    public String getInstruction() {

        return "Wpisz numer od 1 do 50";
    }

    public String guessNumber(int number) {
        guessNumber = number;
        if (i == number) {
            System.out.print("Wygrałeś ");
        } else if (i > number) {
            System.out.println("Podaj większą liczbę");
        } else {
            System.out.println("Podaj mniejszą liczbę");
        }
        return "";
    }
}