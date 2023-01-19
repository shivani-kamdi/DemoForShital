package NonStaticMethods;

public class Prog_1 { //Non static method call from same class

public void method1(){                                                                   
                     System.out.println("This is non static method1");
                     }
public static void main(String[] args) {
	
Prog_1 a = new Prog_1();
a.method1();
a.method1();
a.method1();
}}
