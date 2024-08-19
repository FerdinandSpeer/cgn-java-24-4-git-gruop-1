package org.example;

public class Main {
    public static void main(String[] args) {
      int [] coinbox={1,3232,445454,65652,2,3};
      int [] coinbox1=new int[5];
      for (int i=0;i<coinbox1.length;i++){
//          System.out.println(coinbox[i]);
          System.out.println(coinbox1[i]);
      }

      for (int coin : coinbox){       //for each loop
          System.out.println(coin);
      };
    }
}