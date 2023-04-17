import java.util.ArrayList;
public class PrimeDirective{
public ArrayList<Integer> onlyPrime(){
    int[] numbers = {1, 2, 4, 5, 6, 7, 9, 10,13};
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int i = 0; i<numbers.length; i++){
        if (numbers[i] == 2){
            primes.add(numbers[i]);
        }
        if(numbers[i] % 2 != 0 && numbers[i]%3 != 0 && numbers [i]>1){
            primes.add(numbers[i]);
        }
    }
    return primes;
}
public boolean isPrime(){
    int number = 7;
    if (number == 2){
        return true;
    }
    if (number < 2 ){
        return false;
    }
    for (int i = 2; i < number ; i++){
        if (number  % i != 0){
            return true;
        } else if ( number % i == 0){
            return false;
    }
    }
    return isPrime();
}
   public static void main(String args[]){
    int[] numbers = {1, 5, 7, 6, 10};
    PrimeDirective prime = new PrimeDirective();
    System.out.println (prime.onlyPrime()); 
    }
}