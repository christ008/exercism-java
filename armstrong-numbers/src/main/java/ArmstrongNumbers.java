class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numberOfDigits = (int) Math.log10(numberToCheck) + 1;
        int extracted = numberToCheck;
        int sum = 0;
        while (extracted > 0) {
            sum += (int) Math.pow(extracted % 10, numberOfDigits);
            extracted /= 10;
        }
        return numberToCheck == sum;
    }
}
