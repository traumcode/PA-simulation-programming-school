package com.pasimulation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class School {
    private Set<Student> students;
    private Set<Mentor> mentors;

    public School() {
        this.students = new HashSet<>();
        this.mentors = new HashSet<>();
    }

    public void hireMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudentsFromModule(Module module) {
        return students.stream().filter(student -> student.getModule().equals(module)).collect(Collectors.toList());
    }

    public boolean assignMentorToModule(Mentor mentor, Module module) {
        if (mentor.knowsLanguage(module.language)) {
            mentor.assignToModule(module);
            System.out.println("good");
            return true;
        }
        System.out.println("No");
        return false;
    }

    public void studentsProgress() {
        for (Student student : students) {
            student.update();
        }
    }
}
