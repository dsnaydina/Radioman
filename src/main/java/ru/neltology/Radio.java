package ru.neltology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Radio {
    private int currentStation;
    private int nextStation;
    private int minStation;
    private int maxStation;
    private int volume;
    private int minVolume;
    private int maxVolume;
    private int station;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

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
}

