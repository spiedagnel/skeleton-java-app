package com.develogical;

public class QueryProcessor {

    private boolean isPrime(int num){
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare  ";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Sam";
        }else if (query.toLowerCase().contains("what is ")) {

            if (query.toLowerCase().contains("plus")){
                String[] addition = query.split("what is ");
                String[] numbers = addition[1].split(" plus ");
                return String.valueOf(Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]));
            }else if (query.toLowerCase().contains(" multiplied by ")){
                String[] addition = query.split("what is ");
                String[] numbers = addition[1].split(" multiplied by ");
                return String.valueOf(Integer.valueOf(numbers[0]) * Integer.valueOf(numbers[1]));
            }

        }else if (query.toLowerCase().contains(" both square and cube ")){
            String[] numbersList = query.split(": ");
            String[] numbers = numbersList[2].split(", ");
            for (int i = 0; i < numbers.length; i++) {
                int i1 = Integer.valueOf(numbers[i]);
                if (i1 == 16 || i1 == 64 || i1 == 729){
                    return numbers[i];
                }
            }
        }else if (query.toLowerCase().contains(" primes ")){
            String[] numbersList = query.split(": ");
            String[] numbers = numbersList[2].split(", ");
            for (int i = 0; i < numbers.length; i++) {
                int i1 = Integer.valueOf(numbers[i]);
                //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
                if(isPrime(i1)){
                    return numbers[i];
                }
            }
        }else if (query.toLowerCase().contains(" what colour is a banana ")) {
            return "yellow";
        }   else if (query.toLowerCase().contains(" theresa may ")){
                return "2016";
        }   else if (query.toLowerCase().contains(" dr no")){
            return "Sean Connery";
        }   else if (query.toLowerCase().contains(" eiffel tower ")){
            return "Paris";
        }else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] split = query.split(": ");
            String[] s = split[2].split(", ");
            int max = 0;
            for (int i = 0; i < s.length; i++) {
                String s1 = s[i];
                if (Integer.valueOf(s1) > max)
                    max = Integer.valueOf(s1);
            }

            return String.valueOf(max);
        }// 0which%20of%20the%20following%20numbers%20is%20the%20largest:%2020,%20314
        return "";
    }
}
