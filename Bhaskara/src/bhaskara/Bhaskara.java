package bhaskara;

public class Bhaskara {

    public static void main(String[] args) {

        Formula f = new Formula();

        
            f.SetA();
            f.SetB();
            f.SetC();
            f.Delta();
            
            if (f.GetA() <=0.0) {
                f.ExibirMsg();
            } else {
                System.out.println("R1 = "+ f.Valor1());
                System.out.println("R2 = "+ f.Valor2());
            }

     

    }

}
