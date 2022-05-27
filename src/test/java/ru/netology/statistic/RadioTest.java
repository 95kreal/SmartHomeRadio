package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void findNormalRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessLeftBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreRightBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void findMoreLeftBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightLeftBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findLessLeftBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(10);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(9);

        int actual = rad.getCurrentSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreRightBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(11);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(10);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaxIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(9);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findMinDecreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinDecreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(1);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
