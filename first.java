
   import java.util.Random;
import java.util.Scanner;
    public class first {
        public static void adivinharPoligono() {
            Random random = new Random();
            int numero = random.nextInt(3);
            Scanner entrada = new Scanner(System.in);

            if(numero == 0){
                Triangulo triangulo = new Triangulo();
                System.out.println("Quantos lados têm um " + triangulo.getName());
                Integer lados = entrada.nextInt();
                if(lados == triangulo.getNumeroLados()){
                    System.out.println("Correto ");
                }else{
                    System.out.println("Errado");
                }
            }else if(numero == 1){
                Quadrilatero quadrilatero = new Quadrilatero();
                System.out.println("Quantos lados têm um " + quadrilatero.getName());
                Integer lados = entrada.nextInt();
                if(lados == quadrilatero.getNumeroLados()){
                    System.out.println("Correto ");
                }else{
                    System.out.println("Errado");
                }
            }else if(numero == 2){
                Pentagono pentagono = new Pentagono();
                System.out.println("Quantos lados têm um " + pentagono.getName());
                Integer lados = entrada.nextInt();
                if(lados == pentagono.getNumeroLados()){
                    System.out.println("Correto");
                }else{
                    System.out.println("Errado");
                }
            }
            else if(numero == 3){
                Hexagono hexagono = new Hexagono();
                System.out.println("Quantos lados têm um " + hexagono.getName());
                Integer lados = entrada.nextInt();
                if(lados == hexagono.getNumeroLados()){
                    System.out.println("Correto");
                }else{
                    System.out.println("Errado");
                }
            }

        }
        public static void adivinharPoligono2() {
            Random random = new Random();
            int numero = random.nextInt(3);
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual poligono possui as seguintes caracteristicas");
            if(numero == 0){
                Triangulo triangulo = new Triangulo();
                System.out.println("Têm " + triangulo.getNumeroLados()+
                        " lados " +"e "+ triangulo.getNumeroDiagonais()+ " diagonais");
                System.out.println(" Digite 1 para triangulo");
                System.out.println(" Digite 2 para quadrilatero");
                System.out.println(" Digite 3 para pentagono");
                System.out.println(" Digite 4 para Hexagono");
                Integer number = entrada.nextInt();
                if(number == 1){
                    System.out.println("Parabens, você acertou !!");
                }else{
                    System.out.println("Você errou");
                }
            }else if(numero == 1){
                Quadrilatero quadrilatero = new Quadrilatero();
                System.out.println("Têm " + quadrilatero.getNumeroLados()+" lados " +"e "+
                        quadrilatero.getNumeroDiagonais()+ " diagonais");
                System.out.println(" Digite 1 para triangulo");
                System.out.println(" Digite 2 para quadrilatero");
                System.out.println(" Digite 3 para pentagono");
                System.out.println(" Digite 4 para Hexagono");
                Integer number = entrada.nextInt();
                if(number == 2){
                    System.out.println("Parabens, você acertou !!");
                }else{
                    System.out.println("Você errou");
                }
            }else if(numero == 2){
                Pentagono pentagono = new Pentagono();
                System.out.println("Têm " + pentagono.getNumeroLados()+" lados " +"e "+
                        pentagono.getNumeroDiagonais()+ " diagonais");
                System.out.println(" Digite 1 para triangulo");
                System.out.println(" Digite 2 para quadrilatero");
                System.out.println(" Digite 3 para pentagono");
                System.out.println(" Digite 4 para Hexagono");
                Integer number = entrada.nextInt();
                if(number == 3){
                    System.out.println("Parabens, você acertou !!");
                }else{
                    System.out.println("Você errou");
                }
            }
            else if(numero == 3){
                Hexagono hexagono = new Hexagono();
                System.out.println("Têm " + hexagono.getNumeroLados()+" lados " +"e "+
                        hexagono.getNumeroDiagonais()+ " diagonais");
                System.out.println(" Digite 1 para triangulo");
                System.out.println(" Digite 2 para quadrilatero");
                System.out.println(" Digite 3 para pentagono");
                System.out.println(" Digite 4 para Hexagono");
                Integer number = entrada.nextInt();
                if(number == 3){
                    System.out.println("Parabens, você acertou !!");
                }else{
                    System.out.println("Você errou");
                }
            }

        }
        public static void main(String[] args) {
            adivinharPoligono();
            System.out.println("");
            adivinharPoligono2();
            System.out.println("");
            Hexagono hexagono = new Hexagono();
            Pentagono pentagono = new Pentagono();
            Triangulo triangulo = new Triangulo();
            Quadrilatero quadrilatero = new Quadrilatero();
            hexagono.pintar();
            pentagono.pintar();
            triangulo.pintar();
            quadrilatero.pintar();
        }
    }
