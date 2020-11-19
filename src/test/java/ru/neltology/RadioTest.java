package ru.neltology;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class RadioTest {

    @Test
    public void shouldTurnOnNextStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(8);
        radio.turnOnNextStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldTurnOnZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setMaxStation(9);
        radio.turnOnNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnOnPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.turnOnPreviousStation();
        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    public void shouldNotTurnOnPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.turnOnPreviousStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldChooseStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.chooseStation(6);
        assertEquals(6, radio.getCurrentStation() );
    }
    @Test
    public void shouldNotChooseStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.chooseStation(10);
        assertEquals(9, radio.getCurrentStation() );
    }

    @Test
    public void shouldNotChooseMaxStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        radio.chooseStation(11);
        assertEquals(7, radio.getCurrentStation() );
    }
    @Test
    public void shouldNotChooseMinStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        radio.chooseStation(-1);
        assertEquals(7, radio.getCurrentStation() );
    }


    @Test
    public void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(6);
        radio.turnUpVolume();
        assertEquals(7, radio.getVolume());
    }
    @Test
    public void shouldNotTurnUpVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(10);
        radio.turnUpVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldTurnMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        radio.turnUpVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(6);
        radio.turnDownVolume();
        assertEquals(5, radio.getVolume());
    }
    @Test
    public void shouldNotTurnDownVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void shouldTurnMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(10);
        radio.turnDownVolume();
        assertEquals(10, radio.getVolume());
    }
}