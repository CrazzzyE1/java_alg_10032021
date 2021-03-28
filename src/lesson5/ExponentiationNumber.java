package lesson5;

public class ExponentiationNumber {
    public double run(int number, int degree) {

        if (degree == 0 && number >= 0) return 1;
        if (degree == 0 && number < 0) return -1;
        if (number == 0) return 0;

        if (number > 0 && degree > 0) {
            if (degree == 1) return number;
            return run(number, degree - 1) * number;
        }

        if (number > 0 && degree < 0) {
            degree = Math.abs(degree);
            double result = run(number, degree);
            return 1.0 / result;
        }

        if (number < 0 && degree > 0) {
            return run(Math.abs(number), degree) * -1;
        }

        if (number < 0 && degree < 0) {
            return run(Math.abs(number), degree) * -1;
        }
        return -1;
    }
}
