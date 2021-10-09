import java.util.Scanner;

public class NUM_17
{

  public static void main (String[]args)
  {
    // TODO Auto-generated method stub

    Scanner entrada = new Scanner (System.in);

      System.out.print ("informe a primeira nota : ");
      float nI = entrada.nextFloat();

      System.out.print("informe a segunda nota : ");
      float nII= entrada.nextFloat ();
      
      float media = (float) ((nI+nII)/2);
      
        if ((media >=9)&&(media <=10)){
        System.out.println("Nota1 : " + nI);
        System.out.println("Nota2 : " + nII);
        System.out.println("Aprovado");
        System.out.println("Conceito : A");
        }
        
        else{
            
          if ((media >=9)&&(media <=10)){
          System.out.println("Nota1 : " + nI);
          System.out.println("Nota2 : " + nII);
          System.out.println("Aprovado");
          System.out.println("Conceito : B");
        }
           if ((media >=7.5)&&(media <=9)){
           System.out.println("Notas : " + nI + nII);
           System.out.println("Conceito : C");;
        }
           if ((media >=6)&&(media <=7.5)){
           System.out.println("Notas : " + nI + nII);
           System.out.println("Reprovado");
           System.out.println("Conceito :D");;
        }
           if ((media >=4)&&(media <=6)){
           System.out.println("Notas : " + nI + nII);
           System.out.println("Reprovado");
           System.out.println("Conceito : E");
         }
           if ((media >=0)&&(media <=4)){
           System.out.println("Notas : " + nI + nII);
           System.out.println("Reprovado");
           System.out.println("Conceito : E");
           }
   
        }
        
    entrada.close ();
  }
}
