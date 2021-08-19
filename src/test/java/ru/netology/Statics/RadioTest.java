package ru.netology.Statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);
        assertEquals(7, radio.increaseVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(85);
        assertEquals(84, radio.decreaseVolume());
    }
    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setVolume(122);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setVolume(-3);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(11);
        assertEquals(0, radio.nextNumberStation());
        assertEquals(1, radio.getNumberStation());
    }

    @Test
    public void PrevNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        assertEquals(10, radio.prevNumberStation());
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void setNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.setNumberStation(15);
        assertEquals(5, radio.getNumberStation());
    }
    @Test
    public void setMinNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        radio.setNumberStation(15);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void setMaxNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(20);
        radio.setNumberStation(15);
        assertEquals(10, radio.getMaxNumberStation());
    }
}
