package com.mycompany.exceptionsone;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }
    public int division (int a, int b){
       /* validacion que evita la exepccion
        if(b<=0){
            System.out.println("operacion no valida");
            return 404;
        }*/
       boolean repeat;
       int res=0;
       Scanner scanner = new Scanner (System.in);
        do {
            repeat = false;
            try {
                res = a/b;
            } catch(ArithmeticException e){
                System.out.println("Operacion no valida");
                System.out.println("ingrese nuevo valor");
            try{
                b = scanner.nextInt();
            } catch(InputMismatchExeption ex){
                System.out.println("tipo no valido");
                repeat = true;
            }
                
            } catch(InputMismatchException e){
                 System.out.println("tipo no valido");
                System.out.println("ingrese nuevo valor");
                b = scanner.nextInt();
                repeat = true;
            }
        } while (repeat);
            return res;
    }
 }
