package entities;

public class Students {

    private String name;
    private int registration;
    private double grade1;
    private double grade2;
    private double workNote;

    public Students(String name, int registration, double grade1, double grade2, double workNote) {
        this.name = name;
        this.registration = registration;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.workNote = workNote;
    }

    public String getName() {
        return name;
    }

    public int getRegistration() {
        return registration;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getWorkNote() {
        return workNote;
    }

    public double average() {
        double averageFinal = ((grade1 * 2.5) + (grade2 * 2.5) + (workNote * 2.0)) / (2.5 + 2.5 + 2.0);
        return averageFinal;
    }

    public double missingPoints() {
        double missingPoints = 0.0;
        if (average() < 7.0) {
            missingPoints = 7.0 - average();
            return missingPoints;
        } else {
            return missingPoints;
        }
    }

    public String toString(){
    return "Student name: " +
            name +
            "\nRegistration number: " +
            registration +
            "\nGrade 1: " +
            String.format("%.2f",grade1) +
            "\nGrade 2: " +
            String.format("%.2f",grade2) +
            "\nWork Note: " +
            String.format("%.2f",workNote) +
            "\nAverage Final: " +
            String.format("%.2f",average());
    }

}
