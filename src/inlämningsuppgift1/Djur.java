/*
 * Java Utveckling 18
 */

package inlämningsuppgift1;


public class Djur {
    //instansvariabler
 private String namn;
 private double vikt;
   //default konstruktor
  Djur(){};
   //konstruktor
  Djur(String namn,double vikt){
      this.namn=namn;
      this.vikt=vikt;
  }
  //instansmetoder
  public String getName(){
      return namn;
  }
  public double getVikt(){
      return vikt;
  }
 
}
