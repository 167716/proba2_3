class Main {
  public static void main(String[] args) {
    int[][] mnozenie = new int[10][10];

    mnozenie[1][1]=0;
    mnozenie[1][2]=1;
    mnozenie[1][3]=2;
    mnozenie[1][4]=3;
    mnozenie[1][5]=4;
    mnozenie[1][6]=5;
    mnozenie[1][7]=6;
    mnozenie[1][8]=7;
    mnozenie[1][9]=8;
    mnozenie[1][10]=9;
    mnozenie[1][11]=10;
    
    for(int i=0;i<mnozenie.length;i++){
      int[] mnozenie=mnozenie[i];
      for(int j=0;j<mnozenie.length;j++){
        System.out.print(mnozenie[i][j]+" ");
      }
      System.out.println();
    }
  }
}