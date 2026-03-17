package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@RestController
public class UniversityController {

    // Using a Java 25 Record for a lightweight data structure
    public record Course(String code, String name) {}

    @GetMapping("/cs-courses")
    public Map<String, List<Course>> getComputerScienceCourses() {
        return Map.of(
                "Foundation Courses", List.of(
                        new Course("CSC111F", "Introduction to Programming (Foundation)"),
                        new Course("CSC112F", "Digital Literacy & Problem Solving")
                ),
                "Undergraduate Courses", List.of(
                        new Course("CSC111", "Introduction to Computer Science"),
                        new Course("CSC211", "Data Structures and Algorithms"),
                        new Course("CSC221", "Database Systems"),
                        new Course("CSC311", "Software Engineering"),
                        new Course("CSC321", "Operating Systems")
                ),
                "Honours Courses", List.of(
                        new Course("CSC411", "Artificial Intelligence"),
                        new Course("CSC421", "Advanced Cyber Security"),
                        new Course("CSC431", "Distributed Systems"),
                        new Course("CSC441", "High Performance Computing")
                )
        );
    }
}