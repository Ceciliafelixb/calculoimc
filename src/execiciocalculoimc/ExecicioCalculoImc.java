 

package execiciocalculoimc;
import java.util.Scanner;

public class ExecicioCalculoImc {

    
    public static void main(String[] args) {
        //variaveis
        Scanner Teclado = new Scanner(System.in);
        float peso;
        float altura;
        float imc;
        
        //Entrada de Dados
        System.out.println("Calcule o seu IMC");
        System.out.println("Insira o seu peso");
        peso = Teclado.nextFloat();
        System.out.println("Insira a sua altura");
        altura = Teclado.nextFloat();
        
        //Processamento
        
        imc = peso/(altura*altura);
        System.out.println("IMC = "+imc);
        
        //Saída de Dados
        if ( imc <= 16.0){
                System.out.println("Magreza Severa");
        }
        if ( imc >= 19.0 && imc <17.0){
                System.out.println("Magreza Moderada");
        }
        if ( imc >= 17.0 && imc <18.5){
                System.out.println("Magreza Leve");
        }
        if ( imc >=18.5 && imc <25.0){
                System.out.println("Peso Normal");
        }
        if ( imc >=25.0 && imc <30.0){
                System.out.println("Peso Sobrepeso");
        }
        if ( (imc >=30.5) && (imc <35.0)){
                System.out.println("Obesidade classe I");
        }
        if ( imc >=35.0 && imc <40.0){
                System.out.println("Obesidade classe II");
        }
        if ( imc >=40.0 )
                System.out.println("Obesidade classe III");
    }
    
}
