public class Method {
public static void main(String[]args){


    welcome();
    multiply ( 3,33 );
    add (67, 98);
    divided(100, 6 );
    divided( 200, 770 );
    divided( 400, 9 );


    int a = 5;
    int b = 10;
    System.out.println( a * b );

    int c = 2;
    int d = 3;
    System.out.println( c * d );

   int e =10;
   int f = 11;



   System.out.println( e*f );
  }

public static void multiply(int a, int b){
    System.out.println( a * b );

    //multiply( 4 , 6 );
return;
}

public static void add(double j, float k){
    System.out.println( j + k );
}

public static void welcome(){
   System.out.println( "Welcome to our calculator" );
}

public static void divided(double m, double h){
    System.out.println( m/h );
}

}
