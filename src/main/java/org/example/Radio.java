package org.example;

public class Radio {
  private boolean powerOn;
  private int volume;
  private double frequency;

  public Radio() {
    this.powerOn = false;
    this.volume = 0;
    this.frequency = 87.6;
  }

  // An/Ausschalten
  public void togglePower() {
    powerOn = !powerOn;
    System.out.println("Radio is now " + (powerOn ? "on" : "off"));
  }

  // Lauter stellen
  public void increaseVolume() {
    if (powerOn && volume < 10) {
      volume++;
      System.out.println("Volume increased to " + volume);
    } else {
      System.out.println("Cannot increase volume. Radio is " + (powerOn ? "at maximum volume" : "off"));
    }
  }

  // Leiser stellen
  public void decreaseVolume() {
    if (powerOn && volume > 0) {
      volume--;
      System.out.println("Volume decreased to " + volume);
    } else {
      System.out.println("Cannot decrease volume. Radio is " + (powerOn ? "at minimum volume" : "off"));
    }
  }

  // Frequenz ändern
  public void changeFrequency(double newFrequency) {
    if (powerOn && newFrequency >= 87.5 && newFrequency <= 108.0) {
      frequency = newFrequency;
      System.out.println("Frequency changed to " + frequency + " MHz");
    } else {
      System.out.println("Cannot change frequency. Radio is " + (powerOn ? "out of frequency range" : "off"));
    }
  }

  // toString-Methode
  @Override
  public String toString() {
    return "Radio{" +
        "powerOn=" + powerOn +
        ", volume=" + volume +
        ", frequency=" + frequency +
        '}';
  }

  public static void main(String[] args) {
    Radio radio = new Radio();
    System.out.println("Initial state: " + radio);

    radio.togglePower();
    radio.increaseVolume();
    radio.changeFrequency(100.6);

    System.out.println("After some actions: " + radio);

    radio.decreaseVolume();
    radio.togglePower();

    System.out.println("After turning off: " + radio);
  }
}