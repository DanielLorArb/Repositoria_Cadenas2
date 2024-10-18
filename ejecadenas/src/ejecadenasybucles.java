import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ejecadenasybucles {

    public void EjercicioCadena() {
        String frase = "No me porto mal en clase y no lo reconozco ";

        int tamanyo = frase.length();
        System.out.println(" El tamaño de la frase es" + tamanyo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posicion 33 es" + letra);

        String palabra = frase.substring(9, 12);
        System.out.println("La palabra con substring es" + palabra);

        String palabra2 = "Parte";
        String concatenacion = frase.concat(palabra2);
        System.out.println("La concatenacion de la frase con la palabra" + palabra2 + "es  " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + " esta en la posicion" + posicion);

        int posicion2 = concatenacion.indexOf("no", 8);
        System.out.println("La posicion de la palabra 'no' si no tenemos en cuenta las primeras 8 primeras posiciones es " + posicion2);

        int posicion3 = concatenacion.lastIndexOf("no");System.out.println("La posicionde la ultima aparicion de la palabra no es " + posicion3);

        String mayusculas = frase.toUpperCase();
    String minuscula = frase.toLowerCase();
        System.out.println("La frase mayuscula es" + mayusculas + "la frase minuscula es" + minuscula);


        String nombre = "Patricia";
        nombre = nombre.trim();
        System.out.println(" Tu nombre si espacios es" + nombre);

        String remplazar = frase.replace("mal", "bien");
        System.out.println("La frase con la palabra 'mal' remplazada por 'bien' que asi" + remplazar);

        String palabra3 = "hola";
        String palabra4 = "HOLA";

        if (palabra3.equals(palabra4) == true) {
            System.out.println("Son iguales ");
        } else {
            System.out.println(" las palabras" + palabra3 + "y" + palabra4 + "son distintas");
        }

        if (palabra3.equalsIgnoreCase(palabra4) == true) {
            System.out.println("Son iguales ");
        } else {
            System.out.println(" las palabras" + palabra3 + "y" + palabra4 + "son distintas");
        }

    }

    public static void Ejercicio1cadena() {

        String frase = "Prueba ejercicio caracteres";

        int longitud = frase.length();
        System.out.println("La longitud de texto es  " + longitud);

        String palabra1 = frase.substring(0, 13);
        String palabra2 = frase.substring(13, 25);
        System.out.println("La primera mitad es  " + palabra1 + ("- ") + "La segunda mitad es  -" + palabra2);


        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);
    }

    public static void Ejercicio2cadena() {

        String palabra1 = "Rosa";
        String palabra2 = "Cornelia";

        int flor1 = palabra1.length();
        System.out.println(" El tamaño de la palabra es " + flor1);
        int flor2 = palabra2.length();
        System.out.println(" El tamaño de la palabra es " + flor2);


        if (palabra1.equals(palabra2) == true) {
            System.out.println(" Son iguales de largas ");
        } else {
            System.out.println(" La palabra " + palabra1 + " y " + palabra2 + " no son igual de largas");
        }
//
        if (flor1 < flor2) {
            System.out.println(" La palabra mas larga es " + palabra2);
        } else {
            System.out.println(" La palabra mas larga es " + palabra1);
        }

    }

    public static void Ejercicio3cadena() {
        String Numero = "123456";
//            String N = "2";
        String Numeros1 = Numero.substring(0, 4);

        System.out.println(" Recortando el numero 123456 a 4 dijitos queda el numero " + Numeros1);
//            System.out.println(" Recortando el numero a 4 dijitos " + Numero.indexOf(N));

    }

    public static void Ejercicio4cadena() {

        String Frasecita = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";

int posicion1 = Frasecita.indexOf("Mundo", 0);
    System.out.println("La posicion de la palabra 'mundo' es " + posicion1);
        int posicion2 = Frasecita.indexOf("Mundo", 20);
        System.out.println("La posicion de la palabra 'mundo' es " + posicion2);
        int posicion3 = Frasecita.indexOf("Mundo", 30);
        System.out.println("La posicion de la palabra 'mundo' es " + posicion3);


    }

    public static void Ejercicio5cadena() {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int frase1 = 0;
        int palabra1 = 0;

        try {
            System.out.println("Jugador 1 introduzca una frase");
            frase1 = entrada1.nextInt();
            System.out.println("Jugador 2 introduzca una palabra");
            palabra1 = entrada2.nextInt();
        } catch (InputMismatchException er) {

        }
    }

    public static void ejerciciopro() {
        Scanner entrada4 = new Scanner(System.in);

        boolean err = true;
        int n = 0;
        int m = 0;


        while (err) {

            try {
                System.out.println("introduce numero");
                n = entrada4.nextInt();

                System.out.println("introduce otro numero para quitar las cifras");
                m = entrada4.nextInt();

                if (n > m) ;
                {
                    err = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("el  formato no es correcto (numerico)");
                entrada4.nextLine();
            }
        }

        String n_string = Integer.toString(n);
        int tamanyo = n_string.length();
        n_string = n_string.substring(0, tamanyo - m);
        System.out.println("El numero sin las" + m + "cifras es" + n_string);

    }

    public static void ejercicio4bien() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzcion una frase ");
        String frase = entrada.nextLine();

        frase = " " + frase + " ";
        frase = frase.replace(".", " ");
        frase = frase.toLowerCase();
        System.out.println("Introduce una subclase");
        String subcadena = entrada.nextLine();
        subcadena = " " + subcadena + " ";

        int fraselength = frase.length();
    }

    public static void Numerosuerte() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu fecha de naciento");
        String fechaNacimiento = scanner.nextLine();
        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[1]);
        int mes = Integer.parseInt(partes[2]);
        int anyo = Integer.parseInt(partes[3]);

        if (dia <= 0) {
            System.out.println("El dia contiene valor negativo");
            return;
        }
        if (dia >= 31) {
            System.out.println("El dia contiene valor superior a 31 dias");
            return;
        }
        if (mes <= 0) {
            System.out.println("El mes contiene valor negativo");
            return;
        }
        if (mes >= 12) {
            System.out.println("El mes contiene valor mayor que 12 meses");
            return;
        }
        if (anyo <= 0) {
            System.out.println("El anyo contiene valor negativo");
            return;
        }
        if (anyo >= 2024) {
            System.out.println("El anyo contiene valor superior a 2024");
            return;
        }
        int suma = dia + mes + anyo;
        int numerodelasuerte = 0;
        while (suma > 0) {
            numerodelasuerte += suma % 10;
            suma /= 10;
        }
        System.out.println("Tu numero de la suerte es  " + numerodelasuerte);


    }

    public static void suerte() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu fecha de naciento");
        String fechaNacimiento = scanner.nextLine();
        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anyo = Integer.parseInt(partes[2]);
        if (dia <= 0) {
            System.out.println("El dia contiene valor negativo");
            return;
        }
        if (dia >= 31) {
            System.out.println("El dia contiene valor superior a 31 dias");
            return;
        }
        if (mes <= 0) {
            System.out.println("El mes contiene valor negativo");
            return;
        }
        if (mes >= 12) {
            System.out.println("El mes contiene valor mayor que 12 meses");
            return;
        }
        if (anyo <= 0) {
            System.out.println("El anyo contiene valor negativo");
            return;
        }
        if (anyo >= 2024) {
            System.out.println("El anyo contiene valor superior a 2024");
            return;
        }
        int suma = dia + mes + anyo;
        int numerodelasuerte = 0;
        while (suma > 0) {
            numerodelasuerte += suma % 10;
            suma /= 10;
        }
        System.out.println("Tu numero de la suerte es  " + numerodelasuerte);


    }

    public static void actividad2_2() {

        LocalDateTime hoy = LocalDateTime.now();

        System.out.println("El dia es " + hoy.getDayOfMonth());
        System.out.println("El mes es " + hoy.getMonthValue());
        System.out.println("El año es " + hoy.getMinute());
    }

    public static void actividadexcepciones() {

        Scanner teclado = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();

        System.out.println("Bienvenido al sistema de generaciones");
        System.out.print("Elige el modo de ejecución (1: Año de Nacimiento, 2: Edad): ");
        int modo = teclado.nextInt();
        teclado.nextLine();

        int anyoNacimiento = 0;

        if (modo == 1) {
            System.out.print("Introduce tu año de nacimiento (yyyy): ");
            String anyoNacimientoStr = teclado.nextLine();
            try {
                anyoNacimiento = Integer.parseInt(anyoNacimientoStr);
                if (anyoNacimiento < 1900 || anyoNacimiento > anyoActual) {
                    System.out.println("Año de nacimiento no válido. Debe estar entre 1900 y " + anyoActual);
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un año válido.");
                return;
            }
        } else if (modo == 2) {
            System.out.print("Introduce tu edad: ");
            int edad = teclado.nextInt();
            if (edad < 0 || edad > 150) {
                System.out.println("Edad no válida. Debe ser un valor positivo y razonable.");
                return;
            }
            anyoNacimiento = anyoActual - edad;
        } else {
            System.out.println("Modo no válido. Por favor, elige 1 o 2.");
            return;
        }
        System.out.println("Tu año de nacimiento es: " + anyoNacimiento);

        String generacion;
        if (anyoNacimiento >= 1900 && anyoNacimiento <= 1927) {
            generacion = "Sin Generación bautizada";
        } else if (anyoNacimiento >= 1928 && anyoNacimiento <= 1944) {
            generacion = "Generación Silent";
        } else if (anyoNacimiento >= 1945 && anyoNacimiento <= 1964) {
            generacion = "Baby Boomers";
        } else if (anyoNacimiento >= 1965 && anyoNacimiento <= 1981) {
            generacion = "Generación X";
        } else if (anyoNacimiento >= 1982 && anyoNacimiento <= 1994) {
            generacion = "Generación Y o Millennials";
        } else if (anyoNacimiento >= 1995 && anyoNacimiento <= 2009) {
            generacion = "Generación Z o Centennials";
        } else {
            generacion = "Generación desconocida";
        }

        System.out.println("Tu año de generación es: " + generacion);
    }


    public static void NumeroDeLaSuerte() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anyo = Integer.parseInt(partes[2]);

            if (dia <= 0 || dia > 31) {
                System.out.println("El día debe estar entre 1 y 31.");
                return;
            }
            if (mes <= 0 || mes > 12) {
                System.out.println("El mes debe estar entre 1 y 12.");
                return;
            }
            if (anyo <= 0 || anyo > 2024) {
                System.out.println("El año debe estar entre 1 y 2024.");
                return;
            }
            int suma = dia + mes + anyo;

            int numerodelasuerte = 0;
            while (suma > 0) {
                numerodelasuerte += suma % 10;
                suma /= 10;
            }
            System.out.println("Tu número de la suerte es: " + numerodelasuerte);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, introduce una fecha en el formato dd/mm/yyyy.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Formato de fecha incorrecto. Asegúrate de usar el formato dd/mm/yyyy.");
        }
    }

    public static void EjercicioAlturaPersona() {
        Scanner scanner = new Scanner(System.in);


        int aux = 0;

        System.out.println("Por favor introduzca sus medida en centimetros");

        while (aux == 0) {
            try {

                float altura = scanner.nextInt();

                if (altura <= 150) {
                    System.out.println("Persona de altura baja");
                } else if (altura >= 151 && altura <= 175) {
                    System.out.println("Persona de altura media");
                } else if (altura >= 176) {
                    System.out.println("Persona alta");
                } else {
                    System.out.println("Altura no válida");
                }

            } catch (InputMismatchException e1) {
                System.out.println("La entrada no es valida introduzcalo en centimetros");
                scanner.nextLine();
            }
        }
    }


    public static void DiaDeLaSemana() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un número entre 1 y 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Introduce un número entre 1 y 7.");
                break;

        }
    }

    public static void Calculadora() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("¡Bienvenido a la calculadora simple!");


        System.out.print("Introduce el primer operando (entero): ");
        int operando1 = 0;
        try {
            operando1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entraada no válida. Por favor, introduce un número entero.");
            return;
        }

        System.out.print("Introduce el signo de la operación (+, -, /, x, r): ");
        String operación = scanner.nextLine().toUpperCase();
        int operando2 = 0;
        if (!operación.equals("r")) {
            System.out.print("Introduce el segundo operando (entero): ");
            try {
                operando2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                return;
            }
        }
        switch (operación) {
            case "+":
                System.out.println("Resultado: " + (operando1 + operando2));
                break;
            case "-":
                System.out.println("Resultado: " + (operando1 - operando2));
                break;
            case "/":
                if (operando2 == 0) {
                    System.out.println("Error: División por cero.");
                } else {
                    System.out.println("Resultado: " + (operando1 / operando2));
                    break;
                }
            case "x":
                System.out.println("Resultado: " + (operando1 * operando2));
                break;
            case "r":
                if (operando1 < 0) {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                } else {
                    System.out.println("Resultado: " + Math.sqrt(operando1));
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, introduce uno de los siguientes signos: +, -, /, x, r.");


        }
    }







}
