package random;

import java.util.Random;

public class MeinRandom {
	public static void main(String[] args) {
        Random rand = new Random();
//        int zahl = rand.nextInt(3); // Zufallszahl zwischen inklusive 0 und inklusive 2 (exklusiv 3) [0,3)
//        int zahl = rand.nextInt(2,4); // Zufallszahl zwischen inklusive 2 und inklusive 3 (ecklusiv 4)
//          double zahl=Math.random(); // Zufallszahl zwischen 0 und exclusive 1
//          int zahl= (int)3.8;
          
//        int zahl=(int)(Math.random()*4);   // Zufallszahl zwischen 0 und exclusive 4
//        int zahl=(int)((Math.random()*4)+3);	// Zufallszahl zwischen 3 und exclusive 7
//        int zahl=((int)(Math.random()*4))+3;	// Zufallszahl zwischen 3 und exclusive 7
//        int zahl=(int)((Math.random()+3)*4);	// Zufallszahl zwischen 3 und exclusive 7 funktioniert nicht!!!!!
        
//        int exklusivmax=2;
//        int min=4;
//        int zahl = (int) ((Math.random() * (exklusivmax - min) ) + min);
        
        
        
//        int min = 50;
//        int max = 99;
//        int zahl = (int) (Math.random() * ((max+ 1) - min )) +min ;
  
//        int zahl = 4+ (int)((Math.random()*3))*3;
//        int zahl=12+(int)(Math.random()*4)*5;
          int zahl=-3+(int)(Math.random()*3)*4;
//        int zahl =rand.randrange();
   
//        int zufallszahl = min + Math.random((max - min) / schrittweite + 1) * schrittweite;
          System.out.println(zahl);
    }
}
