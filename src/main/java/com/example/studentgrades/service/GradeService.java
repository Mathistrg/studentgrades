package com.example.studentgrades.service;

import com.example.studentgrades.model.Grade;
import com.example.studentgrades.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public Optional<Grade> getGradeById(Long id) {
        return gradeRepository.findById(id);
    }

    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    public Grade updateGrade(Long id, Grade gradeDetails) {
        Grade grade = gradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grade not found"));

        grade.setStudent(gradeDetails.getStudent());
        grade.setCourse(gradeDetails.getCourse());
        grade.setValue(gradeDetails.getValue());

        return gradeRepository.save(grade);
    }

    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }

    public List<Grade> getGradesByStudentId(Long studentId) {
        return gradeRepository.findAll()
                .stream()
                .filter(g -> g.getStudent().getId().equals(studentId))
                .toList();
    }

    public List<Grade> getGradesByCourseId(Long courseId) {
        return gradeRepository.findAll()
                .stream()
                .filter(g -> g.getCourse().getId().equals(courseId))
                .toList();
    }
}
