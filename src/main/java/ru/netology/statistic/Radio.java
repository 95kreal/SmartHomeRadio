package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation < 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 1;
        }
    }

    public void prev() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void customStation() {
        int newCurrentRadioStation = 0;
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume < 10) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
}