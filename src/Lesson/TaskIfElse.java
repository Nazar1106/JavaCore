package Lesson;

public class TaskIfElse {
    public static void main(String[] args) {
        TaskIfElse p1 = new TaskIfElse();
        System.out.println(p1.getResult(1,2));
    }
        public double getResult(double a, double b) {

            double added = a + b;
            double subtraction = a - b;
            double division = a / b;
            double multiplication = a * b;

            if (added < subtraction) {
                return subtraction;
            } else if (multiplication < division) {
                return division;
            } else if (multiplication > added) {
                return multiplication;
            } else if (multiplication <= added) {
                return added;
            }
            return getResult(a,b);
        }
        }
