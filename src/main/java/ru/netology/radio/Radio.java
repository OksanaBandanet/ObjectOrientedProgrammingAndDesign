package ru.netology.radio;

public class Radio {


    private int maxNumber = 9;
    private int minNumber = 0;
    private int currentNumber = minNumber;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int Number;
    private int Volume;

    public Radio(int CountStation) {
        minNumber = 0;
        maxNumber = CountStation - 1;
        currentNumber = Number;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        currentVolume = Volume;
    }

    public int getCurrentNumber() {
        return Number;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minNumber) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void setNextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
    }

    public void setPrevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void setToMaxNumber() {
        currentNumber = maxNumber;
    }

    public void setToMinNumber() {
        currentNumber = minNumber;
    }

    public int getCurrentVolume() {
        return Volume;
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

