package ru.netology.Statics;

public class Radio {

    public static int numberStation;
    public static int maxNumberStation = 9;
    public static int minNumberStation = 0;
    public static int volume;
    public static int maxVolume = 99;
    public static int minVolume = 0;


    public static int nextNumberStation() {
        if (numberStation > maxNumberStation - 1) {
            return 0;
        }
        return numberStation++;
    }

    public static int prevNumberStation() {
        if (numberStation < minNumberStation) {
            return maxNumberStation;
        }
        return numberStation--;
    }

    public void setNumberStation(int numberStation) {

        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public static int getNumberStation() {
        return numberStation;
    }

    public static int increaseVolume() {
        if (volume > maxVolume) {
            return volume;
        }
        return ++volume;
    }

    public static int decreaseVolume() {
        if (volume < minVolume) {
            return volume;
        }
        return --volume;
    }
}
