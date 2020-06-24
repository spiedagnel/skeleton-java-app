package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare  ";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Sam";
        }else if (query.toLowerCase().contains("what is ")) {
            if (query.toLowerCase().contains("plus")){
                return "Sam";
            }

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
