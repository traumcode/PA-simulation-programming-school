package com.pasimulation;

import java.time.LocalDate;

public class Student extends Person {
    private Module module;
    private int progress;

    public Student(String name, LocalDate birthDate, String phoneNumber) {
        super(name, birthDate, phoneNumber);
        this.module = Module.BASIC;
        this.progress = 0;
    }

    public void update() {
        if(module == null) {
            System.out.println("Congratiulations, you finished already..");
            return;
        }
        this.progress += 10;
        System.out.println("One week has passed");
        if (progress == 100) {
            System.out.println("COngratz, you finished " + this.module.toString() );
            this.module = module.getNextModule();
            progress = 0;
        }
    }

    public Module getModule() {
        return module;
    }
}
