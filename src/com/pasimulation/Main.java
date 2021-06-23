package com.pasimulation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        School Codecool = new School();

        Student s = new Student("andre", LocalDate.now(), "038885883");

        List<Language> limbaje = new ArrayList<>();
        limbaje.add(Language.PYTHON);
        limbaje.add(Language.WEB);

        Mentor neaTiti = new Mentor("neaTIti", LocalDate.now(), "33423423", limbaje, 1000);

        Codecool.hireMentor(neaTiti);
        Codecool.enrollStudent(s);

        Codecool.assignMentorToModule(neaTiti, Module.OOP);
        Codecool.assignMentorToModule(neaTiti, Module.WEB);

        for (int i = 0; i < 40; i++) {
            Codecool.studentsProgress();
        }

    }
}
