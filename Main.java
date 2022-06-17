import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
   
    System.out.println("Wybierz program:");
    System.out.println("1-Tablica mnożenia");
    System.out.println("2-Średnia ocen");
    System.out.println("3-Potęgi liczby 2");
     System.out.println("4-Wpisywanie losowych wartości do tablicy i szukanie max min");
    System.out.println("5-Umieszczanie statków na tablicy");
    System.out.println("6-Przepisywanie tablicy na tablicę");
     System.out.println("7-Sumowanie elementów tablicy");
     System.out.println("8- Sortowanie tablic");
    
    int x=scan.nextInt();
    Random generator = new Random();
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
        double k;
        double[] potegi = new double[11];
        for(int i=0;i<11;i++){
          k=i;
          potegi[i]=Math.pow(2,k);
        }
        for(int i=10;i!=-1;i--){
          System.out.print(potegi[i]+" ");
        }
        break;

      case 4:
        int wskaznik;
        double[] losowe=new double[10];
        
        for(int z=0;z<10;z++){
        wskaznik=generator.nextInt(2);
         
        if(wskaznik==1){
          losowe[z]=generator.nextDouble(50)*-1;
          System.out.println(losowe[z]);
        } else {
          losowe[z]=generator.nextDouble(50);
         System.out.println(losowe[z]);
        }}
        System.out.println();
        double najmniejsza=50;
        double najwieksza=0;
        for(int l=0;l<10;l++){
          if(losowe[l]<najmniejsza) najmniejsza=losowe[l];
          if(losowe[l]>najwieksza) najwieksza=losowe[l];
        }
        System.out.println("Najmniejsza: "+najmniejsza+"  Najwieksza: "+najwieksza);
        break;
        
      case 5:
        char[][] plansza=new char [6][6];
        do{
        System.out.print("\t");
        //Pętla drukująca nagłówki kolumn
        for(int i=0;i<6;i++){
          System.out.print(i+"\t");        }
        System.out.println();
        //Drukowanie wierszy
        for(int wiersz=0;wiersz<6;wiersz++){
       System.out.print(wiersz+":\t");
        for(int kolumna=0;kolumna<6;kolumna++){
          System.out.print(plansza[wiersz][kolumna]+"\t");
        }
        System.out.println();
        }

          System.out.println("Twój ruch; Podaj indeks wiersza: ");
          int nowywiersz=scan.nextInt();
          System.out.println("Podaj indeks kolumny: ");
            int nowakolumna=scan.nextInt();
          
plansza[nowywiersz][nowakolumna]='X';
        }while(x==5);
        
      case 6:
        char[] tablica={'a','b','c','d'};
       char kopia[]=tablica.clone();  System.out.println(kopia[3]);

      case 7:
      
      case 8:
      int tab[]=new int[]{7,4,8,2};
      
      char tab2[]=new char[]{'d','c','z','k','f'};
      Arrays.sort(tab);
      Arrays.sort(tab2); System.out.println("Pierwsza: "+tab[0]+"\t Ostatnia: "+tab[3]);
        System.out.println("Pierwsza: "+tab2[0]+"\t Ostatnia: "+tab2[4]);
    }
  }
}
