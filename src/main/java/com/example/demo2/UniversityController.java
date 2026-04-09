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
                        new Course("CSC111F", "Computer Literacy for Science"),
                        new Course("CSC121F", "Introduction to Programming Concepts")
                ),
                "Undergraduate Courses", List.of(
                        new Course("CSC113", "Introduction to Computer Science"),
                        new Course("CSC211", "Data Structures and Algorithms"),
                        new Course("CSC221", "Database Systems"),
                        new Course("CSC313", "Object-Oriented Programming"),
                        new Course("CSC324", "Introduction to Computer Networks")
                ),
                "Honours Courses", List.of(
                        new Course("CS513", "Distributed and Parallel Computing"),
                        new Course("CS515", "Advanced JAVA Programming"),
                        new Course("CS522", "Human Computer Interaction"),
                        new Course("CS523", "Distributed Web Computing")
                )
        );
    }
}
