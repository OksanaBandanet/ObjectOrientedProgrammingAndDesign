package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouleSetNumber8() {
        Radio radio = new Radio();

        radio.setCurrentNumber(8);

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouleSetNumber10() {
        Radio radio = new Radio();

        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouleSetNumberMinus1() {
        Radio radio = new Radio();

        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberPlusOne0() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);

        radio.setNextNumber();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberPlusOne1() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);

        radio.setNextNumber();

        int expected = 2;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberPlusOne5() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);

        radio.setNextNumber();

        int expected = 6;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberPlusOne8() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);

        radio.setNextNumber();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberPlusOne9() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        radio.setNextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberMinusOne9() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        radio.setPrevNumber();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberMinusOne8() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);

        radio.setPrevNumber();

        int expected = 7;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberMinusOne5() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);

        radio.setPrevNumber();

        int expected = 4;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberMinusOne1() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);

        radio.setPrevNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberMinusOne0() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);

        radio.setPrevNumber();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetMaxNumber() {
        Radio radio = new Radio();

        radio.setToMaxNumber();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetMinNumber() {
        Radio radio = new Radio();

        radio.setToMinNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolume28() {
        Radio radio = new Radio();

        radio.setCurrentVolume(28);

        int expected = 28;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouleSetVolume101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouleSetVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumePlusOne99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumePlusOne100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumePlusOne55() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        radio.setNextVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumePlusOne1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setNextVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumePlusOne0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setNextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumeMinusOne0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumeMinusOne1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumeMinusOne55() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        radio.setPrevVolume();

        int expected = 54;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumeMinusOne99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.setPrevVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolumeMinusOne100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.setPrevVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouleSetMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
