package org.example;

public class Main {

    public static void main(String[] args) {

        Student model = new Student("SrujanaKG", "24");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }
}