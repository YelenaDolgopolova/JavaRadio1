package ru.netology.Statics;

public class Radio {

    int numberStation;
    int maxNumberStation = 9;
    int volume;
    int maxVolume = 99;


    public int nextNumberStation() {
        if (numberStation > maxNumberStation-1) {
            return 0;
        }
        return numberStation++;
    }

    public int prevNumberStation() {
        if (numberStation<1) {
            return maxNumberStation;
        }
        return numberStation--;
    }

    public void setNumberStation(int numberStation) {

        if (numberStation <0){
            return;
        }
        if (numberStation >9){
            return;
        }
        this.numberStation = numberStation;
    }
    public int getNumberStation() {
        return numberStation;
    }

    public int increaseVolume() {
        if (volume > 99) {
            return volume;
        }
        return ++volume;
    }

    public int decreaseVolume() {
        if (volume < 1) {
            return volume;
        }
        return --volume;
    }
}
