public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] numbers = new boolean[n + 1];
        if(n >= 1)  numbers[1] = false;
        numbers[0] = false;
        for(int i = 2; i < n + 1; i++) {
            numbers[i] = true;
        }
        int i = 2;
        while(i < n + 1) {
            if(numbers[i]) {
                for(int j = i + 1; j< n + 1; j++){
                    if(j % i == 0)  numbers[j] = false;
                }
                count++;
                System.out.println(i);
            }
            i++;
        }
        double precentage = ((double) count / n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + 
                            n + " (" + (int) precentage + "% are primes)");
    }
}