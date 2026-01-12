package petpal;

import java.util.*;
//Abstract base class for all pets
public abstract class Pet implements IInteractable {

 // Basic pet information
 protected String name;
 protected String type;
 protected int age;

 // Internal state (fully encapsulated)
 private int hunger;
 private int energy;
 private int mood;

 protected Random random = new Random();

 // Constructor with random default state
 public Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;

     this.hunger = random.nextInt(41) + 30;   // 30–70
     this.energy = random.nextInt(41) + 40;   // 40–80
     this.mood   = random.nextInt(41) + 50;   // 50–90
 }

 // Encapsulated helpers to safely modify state
 protected void increaseEnergy(int value) {
     energy = Math.min(energy + value, 100);
 }

 protected void decreaseEnergy(int value) {
     energy = Math.max(energy - value, 0);
 }

 protected void increaseHunger(int value) {
     hunger = Math.min(hunger + value, 100);
 }

 protected void decreaseHunger(int value) {
     hunger = Math.max(hunger - value, 0);
 }

 protected void updateMood(int value) {
     mood = Math.min(Math.max(mood + value, 0), 100);
 }

 // Public method to view pet status (read-only)
 public void displayStatus() {
     System.out.println("\nPet Status");
     System.out.println("Name   : " + name);
     System.out.println("Type   : " + type);
     System.out.println("Age    : " + age);
     System.out.println("Hunger : " + hunger);
     System.out.println("Energy : " + energy);
     System.out.println("Mood   : " + mood);
 }

 // Polymorphic behavior
 public abstract void makeSound();
}