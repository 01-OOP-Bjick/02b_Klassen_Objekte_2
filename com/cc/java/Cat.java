package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age; 
  private boolean isfemale;


public Cat(String name, String furColor, int age, boolean female) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isfemale = female;
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
  if (isfemale) {
    return "This is an inappropriate question!";
  } else {
    return String.valueOf(age);
  }
}
}