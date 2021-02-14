package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

   @Test
   public void increaseChannel() {
      Radio radio = new Radio();
      radio.setCurrentChannel(7);
      radio.increaseChannel();
      assertEquals(8, radio.getCurrentChannel());
   }

   @Test
   void decreaseChannel() {
      Radio radio = new Radio();
      radio.setCurrentChannel(8);
      radio.decreaseChannel();
      assertEquals(7, radio.getCurrentChannel());
   }

   @Test
   void decreaseVolume() {
      Radio radio = new Radio();
      radio.setCurrentVolume(6);
      radio.decreaseVolume();
      assertEquals(5, radio.getCurrentVolume());
   }

   @Test
   void increaseVolume() {
      Radio radio = new Radio();
      radio.setCurrentVolume(5);
      radio.increaseVolume();
      assertEquals(6, radio.getCurrentVolume());
   }

   @Test
   public void increaseVolumeFromMaxVolume() {
      Radio radio = new Radio();
      radio.setCurrentVolume(10);
      radio.increaseVolume();
      assertEquals(10, radio.getCurrentVolume());
   }

   @Test
   public void decreaseVolumeFromMinVolume() {
      Radio radio = new Radio();
      radio.setCurrentVolume(0);
      radio.decreaseVolume();
      assertEquals(0, radio.getCurrentVolume());
   }

   @Test
   public void previousChannelFromMin() {
      Radio radio = new Radio();
      radio.setCurrentChannel(0);
      radio.decreaseChannel();
      assertEquals(9, radio.getCurrentChannel());
   }

   @Test
   public void increaseChannelFromMax() {
      Radio radio = new Radio();
      radio.setCurrentChannel(9);
      radio.increaseChannel();
      assertEquals(0, radio.getCurrentChannel());
   }

   @Test
   public void increaseVolumeFromValue() {
      Radio radio = new Radio();
      radio.setCurrentVolume(25);
      radio.increaseVolume();
      assertEquals(10, radio.getCurrentVolume());
   }

   @Test
   public void decreaseVolumeFromValue() {
      Radio radio = new Radio();
      radio.setCurrentVolume(25);
      radio.decreaseVolume();
      assertEquals(9, radio.getCurrentVolume());
   }

   @Test
   public void increaseChannelFromValue() {
      Radio radio = new Radio();
      radio.setCurrentChannel(20);
      radio.increaseChannel();
      assertEquals(0, radio.getCurrentChannel());
   }

   @Test
   public void previousChannelFromValue() {
      Radio radio = new Radio();
      radio.setCurrentChannel(30);
      radio.decreaseChannel();
      assertEquals(8, radio.getCurrentChannel());
   }

   @Test
   public void decreaseVolumeMinus() {
      Radio radio = new Radio();
      radio.setCurrentVolume(-35);
      radio.decreaseVolume();
      assertEquals(0, radio.getCurrentVolume() );
   }

   }