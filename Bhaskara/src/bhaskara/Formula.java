package bhaskara;

import java.util.Scanner;

public class Formula {

    Scanner entrada = new Scanner(System.in);
    
    private double a, b, c,delta,x1,x2;
    

    //A
    public void SetA() {
        System.out.println("Digite o Valor De A: ");

        this.a = entrada.nextDouble();
    }

    public double GetA() {
        return a;
    }
    
    
    //B

    public void SetB() {

        System.out.println("Digite o Valor De B: ");

        this.b = entrada.nextDouble();
    }

    public Double GetB() {
        return b;
    }
    
    
    //C

    public void SetC() {
        System.out.println("Digite o Valor de C: ");
        this.c = entrada.nextDouble();
    }

    public Double GetC() {
        return c;
    }
    
    // calculo Delta
    
    public Double Delta(){
       delta = (b * b) + (-4 * (a * c));
        
        return delta;
    }
    
     // calculo X1
    public Double Valor1(){
        x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
        return x1;
    }
    
     // calculo X2
    public Double Valor2(){
        x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
        return x2;
    }
    
    public void ExibirMsg(){
        System.out.println("Impossivel Calcular");
    }
    
}
