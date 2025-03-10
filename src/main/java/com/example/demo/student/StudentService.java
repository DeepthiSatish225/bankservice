package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> getStudents() {
        return List.of(
                new Student(
                        LocalDate.of(2001, 07, 06),
                        1L,
                        "deesat",
                        "ssss@gmail.com",
                        12

                ));
    }
}
