package com.example.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class SerieFizzBuzz {

    List<String> serie;

    protected SerieFizzBuzz(){
        serie = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                serie.add("FizzBuzz");
            } else if (i % 3 == 0) {
                serie.add("Fizz");
            } else if (i % 5 == 0) {
                serie.add("Buzz");
            } else {
                serie.add(String.valueOf(i));
            }
        }
    }

    protected void imprimir() {
        System.out.println(this.serie.toString());
    }
    
}