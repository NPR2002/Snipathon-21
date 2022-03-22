Import java.util.Scanner;
class Add{
  public void add(int a,int b){
    int sum;
    sum=a+b;
    System.out.println("Addition is "+sum);
  }
}
class Substract{
  public void substract(int a,int b){
    if(a>b){
      System.out.println("Substraction is "+(a-b));
    }
    else{
      int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.println("Substraction is "+(a-b));
    }
  }
  ]
     
