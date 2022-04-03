import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
   
    System.out.println("Wybierz program:");
    System.out.println("1-Tabliczba mnożenia");
    System.out.println("2-Średnia ocen");
    System.out.println("3-Potęgi liczby 2");
    
    int x=scan.nextInt();
    switch(x){
      case 1:
    int[][] mnozenie = new int[11][11];

    for(int i=0;i<11;i++){
      for(int j=0;j<11;j++){
        mnozenie[i][j]=i*j;
      }
    }
  
    for(int i=0;i<mnozenie.length;i++){
     // int[] mnozenie=mnozenie[i];
      for(int j=0;j<mnozenie.length;j++){
        System.out.print(mnozenie[i][j]+"  ");
      }
      System.out.println();
    }
          break;

      case 2:
        int suma=0;
        int srednia;
        System.out.println("Podaj ilość ocen: "); 
        int ilosc=scan.nextInt();
        int[] oceny = new int[ilosc];
        for(int i=0;i<ilosc;i++){
          System.out.println("Podaj ocene nr."+i);
          oceny[i]=scan.nextInt();
        }
        for(int i=0;i<ilosc;i++){
          suma=suma+oceny[i];
        }
        srednia=suma/ilosc;
        System.out.println("Średnia ocen wynosi: "+srednia); 
        break;

      case 3:
        
        double[] potegi = new double[10];
        for(double i=0;i<11;i++){
          potegi[i]=Math.pow(2,i);
        }
        for(int i=10;i!=-1;i--){
          System.out.print(potegi[i]+" ");
        }
        break;
    }
  }
}