package ru.netology.Statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);
        assertEquals(7, radio.IncreaseVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(85);
        assertEquals(84, radio.DecreaseVolume());
    }
    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(122);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-3);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(11);
        assertEquals(10, radio.getNextNumberStation());
    }

    @Test
    public void prevNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(11);
        assertEquals(10, radio.getPrevNumberStation());
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    public void setNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.setNumberStation(15);
        assertEquals(5, radio.getNumberStation());
    }
    @Test
    public void setMinNumberStationM() {
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

    @Test
    public void NumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(2);
        radio.setNumberStation(12);
        assertEquals(2, radio.getNumberStation());
    }
    @Test
    public void RadioShouldDisplayNumberStation() {
        Radio radio = new Radio(5);
        radio.setNumberStation(-5);
        assertEquals(5, radio.getNumberStation());
    }
    @Test
    public void ShouldDisplayDefaultRadio() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
        assertEquals(0, radio.getMinNumberStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

}
