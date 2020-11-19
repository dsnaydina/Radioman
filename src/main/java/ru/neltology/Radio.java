package ru.neltology;

public class Radio {
    private int currentStation;
    private int nextStation;
    private int minStation;
    private int maxStation;
    private int volume;
    private int minVolume;
    private int maxVolume;


    public void turnOnNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void turnOnPreviousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void chooseStation(int station) {
        if (station >= minStation && station <= maxStation) {
            setCurrentStation(station);
        }
    }

    public void turnUpVolume() {
        if (volume <= minVolume || volume >= maxVolume) {
            return;
        }
        volume = volume + 1;
    }

    public void turnDownVolume() {
        if (volume <= minVolume || volume >= maxVolume) {
            return;
        }
        volume = volume - 1;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

