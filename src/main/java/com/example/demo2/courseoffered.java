package com.example.demo2;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class courseoffered {

    @NotBlank(message = "Course code cannot be empty")
    @Size(min = 6, max = 7, message = "Code must be 6-7 characters (e.g., CSC311)")
    private String code;

    @NotBlank(message = "Course name is required")
    private String name;

    private String level;

    // Constructor
    public courseoffered(String code, String name, String level) {
        this.code = code;
        this.name = name;
        this.level = level;
    }

  //Getter for course code
    public String getCode() {
        return code;
    }
  //Getter for course name
    public String getName() {
        return name;
    }
  //Getter for course level
    public String getLevel() {
        return level;
    }
}
