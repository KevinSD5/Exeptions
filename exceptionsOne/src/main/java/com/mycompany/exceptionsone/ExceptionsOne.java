
package com.mycompany.exceptionsone;

public class ExceptionsOne {

    public static void main(String[] args) {
      
        
           Calculator calculator = new Calculator();
    
        try{
                int res = calculator.division(4, 0);
                 System.out.println(res);

            } catch (Exception exception)   {
                System.out.println("ERROR MLP BRUTO");
                System.out.println(exception);
                } finally{
                    System.out.println("SZS");
                }
              /* try{
                   int[] numbers = new int[6];
                   numbers[5] = 2/0;
               } catch(ArithmeticException e){
                   System.out.println("BRUTO");
               } catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("Posicion invalida como tu primo");
               } catch (Exception e){
                   System.out.println("ERROR");
               }*/
    
    }

}
