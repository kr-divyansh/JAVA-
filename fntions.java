import java.util.*;
public class fntions{   


    /*
 public static boolean isprime(int n){
    int isprime=true;
    for(int i=2;i<=n-1;i++){
        if(n % i == 0){
            isprime = false;
            break;
    }

 }
 return isprime;
 }
 puublic static void primeinrange(int n){
    for(int i=2; i<=n; i++){
        if(isprime(i)){
            System.out.println(i);
        }
    }
    System.out.println();
 }



    public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    boolean result = isprime(7);
    System.out.println(result);*/

    /* ncr using functions
    public static int facts(int n){
    int f=1;
    for( int i=1; i<=n;i++){
f=f*i;
    }
    return f;
}


   
public static int bincoeff(int n ,int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_n_r=factorial(n-r);
    int result= fact_n/(fact_r*fact_n_r);
    return result;

}
public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int r =sc.nextInt();
    int result = bincoeff(n, r);
    System.out.println(result);
}*/

/* factorial of a number using functions
public static int facts(int n){
    int f=1;
    for( int i=1; i<=n;i++){
f=f*i;
    }
    return f;
}



public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int f= facts(n);
    System.out.println(f);*/
















  //  public static void printhelloworld(){
      //  System.out.println("hellow world");

   // }
  /* public static int calculatesum(int a ,int b){// parameterrs or formal parameters
  int sum = a + b ;
  return sum;*/


  /*
  public static void swap(int a, int b){
    int temp=a;
    a = b;
    b = temp;
    System.out.println("a=" + a);
    System.out.println("b=" + b);

  }*/


 /* product of two numbers using functions
 public static int multiply(int a,int b){
    int product= a*b;
    return product;
 }



   
public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
     int product=multiply(a,b);
        System.out.println(product);
*/

    // swap -values example
   /* int a=5;
    int b=10;
   /* int temp=a;
    a = b;
    b = temp;
    System.out.println("a=" + a);
    System.out.println("b=" + b);*/

   // swap(a,b);










   /* Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
  int b=sc.nextInt();
    int sum = calculatesum(a, b);// arguments or actual parameters
    System.out.println(sum); */



  //  printhelloworld();// this is how we call the functions
 /* int a=sc.nextInt();
  int b=sc.nextInt();
  int sum=a+b;
  System.out.println(sum);*/




public static void bintodec(int binnum){
    int mynum=binnum;
    int pow=0;
    int dec=0;
    while(binnum>0){
        int lastdigit = binnum %10;
        dec= dec +(lastdigit * (int)(Math.pow(2,pow)));
        pow++;
        binnum= binnum/10;
    }
    System.out.println("decimal of " +mynum + " is " + dec);
}

  public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    int binnum = sc.nextInt();
    bintodec(binnum);
}
}
