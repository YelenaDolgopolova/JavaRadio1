package ru.netology.Statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void nextNumberStation() {
        Radio radio = new Radio();
        radio.maxNumberStation = 9;
        assertEquals(0, Radio.nextNumberStation());
    }

    @Test
    public void prevNumberStation() {
        Radio radio = new Radio();
        radio.numberStation = -1;
        assertEquals(9, Radio.prevNumberStation());
        assertEquals(-1, Radio.getNumberStation());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.volume = 6;
        assertEquals(7, Radio.increaseVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 85;
        assertEquals(84, Radio.decreaseVolume());
    }

    @Test
    public void setNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.setNumberStation(15);

        assertEquals(5, Radio.getNumberStation());
    }

}
