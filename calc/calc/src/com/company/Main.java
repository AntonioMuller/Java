package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    

    System.out.println("Ola, escolha uma das opções para a calculadora, 1 = soma, 2 = multiplicação, 3 = divisão, 4 = subtração, 5 = potenciação, 6 =porcentagem, e 7 = raíz quadrada");
    int escolha = sc.nextInt();
    System.out.println("Quantos números serão inseridos? mínimo 1 e máximo 5");
    int quantidade = sc.nextInt();
    
    
 int soma, multi, div, sub, valor, valor2, valor3, valor4, valor5;
 
    if(quantidade == 1) {
      System.out.println("o seu resultado é ele mesmo");
    }
    
 
    
    if(quantidade == 2 ) {
      System.out.println("Digite um número");
      int num = sc.nextInt();
      System.out.println("Digite um número");
      int num2 = sc.nextInt();
      if(escolha == 1 ) {
        soma = num + num2;
        System.out.println("a soma é"+soma);
      }
        if(escolha == 2) {
          multi = num * num2;
          System.out.println("a multiplicação é" +multi);
        }
          if(escolha == 3) {
            div = num / num2;
            System.out.println("a divisão é " +div);
          }
           if(escolha == 4) {
             sub = num - num2;
             System.out.println("a sub é " +sub);
           }
            if(escolha == 5) {
              System.out.println("a sua potencia é"+Math.pow(num, num2));
            }
            
            if(escolha == 6) {
              System.out.println("Quantos porcento você quer dos números?");
              int porcent = sc.nextInt();
              valor = (num * 100)/porcent;
              valor2 = (num2 * 100)/porcent;
              System.out.println("a suas porcentagens é" +valor + valor2);
            }
            
            if(escolha == 7) {
              System.out.println("A suas raízes é" +Math.sqrt(num));
              System.out.println("A suas raízes é" +Math.sqrt(num2));
            }
    
    }
        if(quantidade == 3 ) {
      System.out.println("Digite um número");
      int num = sc.nextInt();
      System.out.println("Digite um número");
      int num2 = sc.nextInt();
      System.out.println("Digite um número");
      int num3 = sc.nextInt();
      if(escolha == 1 ) {
        soma = num + num2 + num3;
        System.out.println("a soma é"+soma);
      }
        if(escolha == 2) {
          multi = num * num2 * num3;
          System.out.println("a multiplicação é" +multi);
        }
          if(escolha == 3) {
            div = num / num2 / num3;
            System.out.println("a divisão é " +div);
          }
           if(escolha == 4) {
             sub = num - num2 - num3;
             System.out.println("a sub é " +sub);
           }
            if(escolha == 5) {
              System.out.println("a sua potencia é"+Math.pow(num, num2));
              System.out.println("a sua potencia é"+Math.pow(num3, 2));
            }
            
            if(escolha == 6) {
              System.out.println("Quantos porcento você quer dos números?");
              int porcent = sc.nextInt();
              valor = (num * 100)/porcent;
              valor2 = (num2 * 100)/porcent;
              valor3 = (num3 * 100)/porcent;
              System.out.println("a suas porcentagens é" +valor
                      + valor2 + valor3);
            }
            
            if(escolha == 7) {
              System.out.println("A suas raízes é" +Math.sqrt(num));
              System.out.println("A suas raízes é" +Math.sqrt(num2));
              System.out.println("A suas raízes é" +Math.sqrt(num3));
            }
            
    }
    
    if(quantidade == 4 ) {
      System.out.println("Digite um número");
      int num = sc.nextInt();
      System.out.println("Digite um número");
      int num2 = sc.nextInt();
      System.out.println("Digite um número");
      int num3 = sc.nextInt();
      System.out.println("Digite um número");
      int num4 = sc.nextInt();
      if(escolha == 1 ) {
        soma = num + num2 + num3 + num4;
        System.out.println("a soma é"+soma);
      }
        if(escolha == 2) {
          multi = num * num2 * num3 * num4;
          System.out.println("a multiplicação é" +multi);
        }
          if(escolha == 3) {
            div = num / num2 / num3 / num4;
            System.out.println("a divisão é " +div);
          }
           if(escolha == 4) {
             sub = num - num2 - num3 - num4;
             System.out.println("a sub é " +sub);
           }
            if(escolha == 5) {
              System.out.println("a sua potencia é"+Math.pow(num, num2));
              System.out.println("a sua potencia é"+Math.pow(num3, num4));
            }
            
            if(escolha == 6) {
              System.out.println("Quantos porcento você quer dos números?");
              int porcent = sc.nextInt();
              valor = (num * 100)/porcent;
              valor2 = (num2 * 100)/porcent;
              valor3 = (num3 * 100)/porcent;
              valor4 = (num4 * 100)/porcent;
              System.out.println("a suas porcentagens é" +valor + valor2 + valor3 + valor4);
            }
            if(escolha == 7) {
              System.out.println("A suas raízes é" +Math.sqrt(num));
              System.out.println("A suas raízes é" +Math.sqrt(num2));
              System.out.println("A suas raízes é" +Math.sqrt(num3));
              System.out.println("A suas raízes é" +Math.sqrt(num4));
            }
            
    }
    
    
    
    if(quantidade == 5 ) {
      System.out.println("Digite um número");
      int num = sc.nextInt();
      System.out.println("Digite um número");
      int num2 = sc.nextInt();
      System.out.println("Digite um número");
      int num3 = sc.nextInt();
      System.out.println("Digite um número");
      int num4 = sc.nextInt();
      System.out.println("Digite um número");
      int num5 = sc.nextInt();
      if(escolha == 1 ) {
        soma = num + num2 + num3 + num4 + num5;
        System.out.println("a soma é"+soma);
      }
        if(escolha == 2) {
          multi = num * num2 * num3 * num4 * num5;
          System.out.println("a multiplicação é" +multi);
        }
          if(escolha == 3) {
            div = num / num2 / num3 / num4 /num5;
            System.out.println("a divisão é " +div);
          }
           if(escolha == 4) {
             sub = num - num2 - num3 - num4 -num5;
             System.out.println("a sub é " +sub);
           }
            if(escolha == 5) {
              System.out.println("a sua potencia é"+Math.pow(num, num2));
              System.out.println("a sua potencia é"+Math.pow(num3, num4));
              System.out.println("a sua potencia é"+Math.pow(num5, num5));
            }
            
            if(escolha == 6) {
              System.out.println("Quantos porcento você quer dos números?");
              int porcent = sc.nextInt();
              valor = (num * 100)/porcent;
              valor2 = (num2 * 100)/porcent;
              valor3 = (num3 * 100)/porcent;
              valor4 = (num4 * 100)/porcent;
              valor5 = (num5 * 100)/porcent;
              System.out.println("a suas porcentagens é" +valor + valor2 + valor3 + valor4 + valor5);
            }
            
            if(escolha == 7) {
              System.out.println("A suas raízes é" +Math.sqrt(num));
              System.out.println("A suas raízes é" +Math.sqrt(num2));
              System.out.println("A suas raízes é" +Math.sqrt(num3));
              System.out.println("A suas raízes é" +Math.sqrt(num4));
              System.out.println("A suas raízes é" +Math.sqrt(num5));
            }
            
    }
    
         
  
    
    
    
    sc.close();

  }

}