# RESOLUCION DEL PROBLEMA FIZZBUZZ

**Primer paso : Creacion del proyecto**

He creado un proyecto en blanco de java con mavel y VSCode ,creo una carpeta y luego le doy new project java maven ,y luego seleccionó una version en blanco inicial.

**Segundo paso : Creacion clase RespuestaUno.java**

He creado una clase y un metodo para resolver el ejercicio y he procedido a resolverlo :

Necesite un for que cicle hasta 100 y unos 3 ifs para que verifiquen que un numero es multiplo de 3 ,de 5 y de 3 y 5 para esto utilice el operador % que hace una division y saca el residuo en entero entonces cuando hago esto verifico si es 0 entonces es multiplo de 3 o 5


```java
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

```

**Tercer paso : utilizar clase RespuestaUno.java**

Por ultimo he creado una instancia en Main.java de la calse RespuetaUno.java y utilice el metodo ,al ejecutar el programa en main se muestran los resultado
