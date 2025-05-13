# RESOLUCION DEL PROBLEMA FIZZBUZZ

**Analiza, este ejercicio lo colocaron para una entrevista de programación para nivel junior y también la colocaron para nivel intermedio.**

**cual crees que pueda hacer la diferencia?**

Respuesta: Creo que la diferencia puede ser en la interpretacion del problema y que tan escalable y limpio codifica el programador, en relacion al nivel que se espera.

**Primer paso : Creacion del proyecto**

He creado un proyecto en blanco de java con mavel y VSCode ,creo una carpeta y luego le doy new project java maven ,y luego seleccionó una version en blanco inicial.

creo una flujo de consola infinito que va preguntar al estudiante si desea comenzar el juego o salir ,si juega tiene que introducir un numero y darle enter ,y el programa va mostrar el valor correcto.

```java
Ju        while (true) {
            System.out.println("Bienvenido al juego FizzBuzz");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir del juego");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Juego FizzBuzz");
                System.out.print("Ingrese un numero de 1 al 100: ");
                int numero = scanner.nextInt();
                serieFizzBuzz.setNumero(numero);
                String resultado = serieFizzBuzz.verificarMultiplo();
                System.out.print("La salida es : ");
                System.out.println(resultado);
  
            } else if (opcion == 2) {
                System.out.println("Juego terminado");
                break;
            } else {
                System.out.println("Opcion invalida");
            }
  
        }

```

**Segundo paso : Creacion clase SerieFizzBuzz.java**

He creado una clase y un metodo para resolver el ejercicio y he procedido a resolverlo :

Necesite un for que cicle hasta 100 y unos 3 ifs para que verifiquen que un numero es multiplo de 3 ,de 5 y de 3 y 5 para esto utilice el operador % que hace una division y saca el residuo en entero entonces cuando hago esto verifico si es 0 entonces es multiplo de 3 o 5

```java
        if (this.numero % 3 == 0 && this.numero % 5 == 0) {
            return "FizzBuzz";
        } else if (this.numero % 3 == 0) {
            return "Fizz";
        } else if (this.numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(this.numero);
        }

```

**Tercer paso : utilizar clase SerieFizzBuzz.java**

Por ultimo he creado una instancia en Main.java de la clase SerieFizzBuzz.java y utilice el metodo ,al ejecutar el programa en main se muestran los resultado
