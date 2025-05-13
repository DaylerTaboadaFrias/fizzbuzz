package com.example.fizzbuzz.Logic;

import com.example.fizzbuzz.Utils.Validar;

public class SerieFizzBuzz {

    public Integer numero;

    public SerieFizzBuzz(){
        numero = 0;
    }

    public SerieFizzBuzz(Integer numero){
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }
    
    public String  verificarMultiplo(){
        if(Validar.validarNumero(this.numero) == false){
            return "El número debe estar entre 1 y 100.";
        }
        
        if (this.numero % 3 == 0 && this.numero % 5 == 0) {
            return "FizzBuzz";
        } else if (this.numero % 3 == 0) {
            return "Fizz";
        } else if (this.numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(this.numero);
        }
    }
    
}