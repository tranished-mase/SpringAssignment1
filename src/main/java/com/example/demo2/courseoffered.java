package com.example.demo2;

public class courseoffered {

  private String name;
  private String level;

  // Constructor
  public CourseOffered(String name, String level) {
      this.name = name;
      this.level = level;
  }

  // Getter for course name
  public String getName() {
    return name;
  }
  
  // Getter for course level
  public String getlevel() {
    return level;
  }
  }
