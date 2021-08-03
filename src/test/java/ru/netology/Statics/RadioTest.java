package ru.netology.Statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void nextNumberStation() {
        Radio Radio = new Radio();
        Radio.maxNumberStation = 9;
        assertEquals(0, Radio.nextNumberStation());
    }

    @Test
    public void prevNumberStation() {
        Radio Radio = new Radio();
        Radio.numberStation = 0;
        assertEquals(9, Radio.prevNumberStation());
    }

    @Test
    public void increaseVolume() {
        Radio Radio = new Radio();
        Radio.volume = 6;
        assertEquals(7, Radio.increaseVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio Radio = new Radio();
        Radio.volume = 85;
        assertEquals(84, Radio.decreaseVolume());
    }



}
