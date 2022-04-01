import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
   
    System.out.println("Wybierz program:");
    System.out.println("1-Tabliczba mnożenia");
    
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
        
        break;
    }
  }
}