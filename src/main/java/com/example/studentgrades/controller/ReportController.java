package com.example.studentgrades.controller;

import com.example.studentgrades.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/course/{courseId}")
    public double getAverageGradeByCourse(@PathVariable Long courseId) {
        return reportService.getAverageGradeByCourse(courseId);
    }

    @GetMapping("/student/{studentId}")
    public double getAverageGradeByStudent(@PathVariable Long studentId) {
        return reportService.getAverageGradeByStudent(studentId);
    }
}
