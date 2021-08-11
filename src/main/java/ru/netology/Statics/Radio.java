package ru.netology.Statics;

public class Radio {

    private int numberStation;
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getNextNumberStation() {
        if (numberStation > maxNumberStation - 1) {
            return 0;
        }
        return numberStation++;
    }

    public int getPrevNumberStation() {
        if (numberStation < minNumberStation + 1) {
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

    public int getNumberStation() {
        return numberStation;
    }

    public int getIncreaseVolume() {
        if (volume > maxVolume) {
            return volume;
        }
        return ++volume;
    }

    public int getDecreaseVolume() {
        if (volume < minVolume) {
            return volume;
        }
        return --volume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}
