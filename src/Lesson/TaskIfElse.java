package Lesson;

public class TaskIfElse {
    public static void main(String[] args) {
        TaskIfElse p1 = new TaskIfElse();
        System.out.println(p1.getResult(10,5));
    }


    public double getResult(double a, double b) {

        double added = a + b;
        double subtraction = a - b;
        double division = a / b;
        double multiplication = a * b;

        if(added < subtraction){
            return subtraction;
        } else if (multiplication < division) {
            return division;
        } else if (multiplication>=subtraction) {
            return multiplication;
        }
        else {
            System.out.println(subtraction);
        }
        return added + subtraction + division + multiplication;

    }
}
