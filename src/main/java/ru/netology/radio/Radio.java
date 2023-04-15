package ru.netology.radio;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int number = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;
    private int currentNumber;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int stationsCount) {
        minStation = 0;
        this.maxStation = stationsCount - 1;
        number = currentNumber;

        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        volume = currentVolume;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minStation) {
            return;
        }
        if (currentNumber > maxStation) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setNextNumber() {
        if (currentNumber < maxStation) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minStation;
        }
    }

    public void setPrevNumber() {
        if (currentNumber > minStation) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxStation;
        }
    }

    public void setToMaxNumber() {
        currentNumber = maxStation;
    }

    public void setToMinNumber() {
        currentNumber = minStation;
    }


    public void setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setPrevVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }
}
