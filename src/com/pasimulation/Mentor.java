package com.pasimulation;

import java.time.LocalDate;
import java.util.List;

public class Mentor extends Person{
    private List<Language> teachingLanguages;
    private int salary;
    private Module module;

    public Mentor(String name, LocalDate birthDate, String phoneNumber, List<Language> teachingLanguages, int salary) {
        super(name, birthDate, phoneNumber);
        this.teachingLanguages = teachingLanguages;
        this.salary = salary;
    }

    public boolean knowsLanguage(Language language) {
//        return teachingLanguages.contains(language);
        for (Language teachingLanguage : teachingLanguages) {
            if(teachingLanguage.equals(language)){
                return true;
            }
        }
        return false;
    }

    public void assignToModule(Module module1) {
        if(!knowsLanguage(module1.language)) {
            throw new IllegalArgumentException("Mentor does not know the language.");
        }
        this.module = module1;
    }
}
