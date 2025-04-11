package com.example.studentgrades.service;

import com.example.studentgrades.model.Grade;
import com.example.studentgrades.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private GradeRepository gradeRepository;

    public double getAverageGradeByCourse(Long courseId) {
        List<Grade> grades = gradeRepository.findAll()
                .stream()
                .filter(g -> g.getCourse().getId().equals(courseId))
                .toList();

        return grades.stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }

    public double getAverageGradeByStudent(Long studentId) {
        List<Grade> grades = gradeRepository.findAll()
                .stream()
                .filter(g -> g.getStudent().getId().equals(studentId))
                .toList();

        return grades.stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }
}
