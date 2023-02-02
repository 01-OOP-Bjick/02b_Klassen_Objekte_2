package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age; 

  private boolean isFemale;
  private int counter;


public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

public String getAge() {
  if (isFemale) {
    return checkEscalationLevel();
  } else {
    return String.valueOf(age);
  }
}
  
private String checkEscalationLevel() {
 
  counter++;  // +1

  switch (counter) {
    case 1:
      return "This is an inappropriate question!";
    case 2:
      return "I've told you once!"; 
    case 3:
      return "Talk to the hand!";         
    default:
      return "1#!?&&%"; 
  }
  
}


    
}