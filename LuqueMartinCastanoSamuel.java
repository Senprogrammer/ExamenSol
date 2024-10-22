import java.util.Scanner;

public class LuqueMartinCastanoSamuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Opcion;

        do {
            // Menú de opciones
            System.out.println("Calculadora");
            System.out.println("1. Área de un cuadrado:");
            System.out.println("2. Área de un triángulo:");
            System.out.println("3. Área de un círculo: ");
            System.out.println("4. Volumen de un cubo");
            System.out.println("5. Volumen de una pirámide de base cuadrada");
            System.out.println("6. Volumen de una esfera");
            System.out.println("7. Volumen de un cilindro");
            System.out.println("8. Volumen de un cono");
            System.out.println("0. Salir ");
            System.out.print("Elige una opción: ");
            Opcion = sc.nextInt();

            // Solo solicitamos los números si la opción es válida
            if (Opcion >= 1 && Opcion <= 8) {
                System.out.println("Unidad utilizadas en cm");
                System.out.println("En caso de no utilizar la medida introduzca un 0");
                System.out.print("Dime el lado: ");
                float lado = sc.nextFloat();
                System.out.print("Dime la base: ");
                float base = sc.nextFloat();
                System.out.print("Dime la altura: ");
                float altura = sc.nextFloat();
                float Pi = 3.1416F;
                float cuatrotercios = 1.33333333333F;
                float untercio = 0.33333333333F;
                System.out.print("Dime el radio: ");
                float radio = sc.nextFloat();
                float areaCuadrado = areaCuadrado(lado);
                float areaCirculo = areaCirculo(Pi, radio);

                float resultado = 0;

                switch (Opcion) {

                    case 1:
                        resultado = areaCuadrado(lado);
                        System.out.println("El area del cuadrado seleccionado de ( " + lado + " cm  x " + lado + " cm)  es  de " + resultado + " cm cuadrados");
                        break;

                    case 2:
                        resultado = areaTriangulo(base, altura);
                        System.out.println("El area del triangulo seleccionado  de (" + base + " cm de base y " + altura + " cm de altura) es de " + resultado + " cm cuadrados");
                        break;

                    case 3:
                        resultado = areaCirculo(Pi, radio);
                        System.out.println("El área del circulo seleccionado es  de π  y radio (" + radio + " cm)  es  de " + resultado + " cm cuadrados");
                        break;

                    case 4:
                        resultado = volumenCubo(areaCuadrado, lado);
                        System.out.println("El volumen del cubo  de cuya area del cuadrado es (" + areaCuadrado + " cm cuadrados y cuyo lado  es  de " + lado + " cm)   su resultado equivale a " + resultado + " cm cúbicos");
                        break;

                    case 5:
                        resultado = volumenTetraedro(areaCuadrado, altura);
                        System.out.println("El volumen del tetraedro cuyo area de cuadrado es (" + areaCuadrado + " cm cuadrados  y de altura  es " + altura + "cm) es  de " + resultado + " cm cúbicos");
                        break;

                    case 6:
                        resultado = volumenEsfera(Pi, radio, cuatrotercios);
                        System.out.println("El volumen de la esfrea es de π" + " de radio " + radio + " es  de " + resultado + " cm cúbicos");
                        break;

                    case 7:
                        resultado = volumenCilindro(areaCirculo, altura);
                        System.out.println("El volumen del cilindro es cuya area de circulo es " + areaCirculo + " cm cuadrados y de altura " + altura + " es  de " + resultado + " cm cúbicos");
                        break;

                    case 8:
                        resultado = volumenCono(Pi, radio, altura, untercio);
                        System.out.println("El volumen del cono es π , un radio de " + radio + " y una altura de  " + altura + " es  de " + resultado + " cm cúbicos");

                        break;


                }
            } else if (Opcion != 0) {
                System.out.println("Error: Elija una de las opciones válidas (0-9)");
            }

        } while (Opcion != 0); // Salir si el usuario elige 0

        System.out.println("Gracias por usar la calculadora.");
        sc.close(); // Cerrar el escáner
    }

    public static float areaCuadrado(float lado) {
        return lado * lado;
    }

    public static float areaTriangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    public static float areaCirculo(float Pi, float radio) {
        return Pi * radio * radio;
    }

    public static float volumenCubo(float areaCuadrado, float lado) {
        return (areaCuadrado * lado);
    }

    public static float volumenTetraedro(float areaCuadrado, float altura) {
        return (areaCuadrado * altura) / 3;
    }

    public static float volumenEsfera(float Pi, float radio, float cuatrotercios) {

        return cuatrotercios * Pi * (radio * radio * radio);
    }

    public static float volumenCilindro(float areaCirculo, float altura) {

        return areaCirculo * altura;

    }

    public static float volumenCono(float Pi, float radio, float altura, float untercio) {

        return untercio * Pi * (radio * radio) * altura;
    }
}

