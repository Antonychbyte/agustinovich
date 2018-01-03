package ru.job4j.calculator;

/**
*class Calculator.java - решение задачи "2.3. Элементарный калькулятор. [#185]"
*@author Густинович Антон (anton14024@yandex.ru)
*/

public class Calculator{

      double result;

      public void add (double first, double second){
             this.result=first+second;
      }
      public void subtract(double first, double second){
             this.result=first-second;
      }
      public void multiple(double first, double second){
             this.result=first*second;
      }
      public void div(double first, double second){
             this.result=first/second;
      }
      public double getResult(){
             return this.result;
      }
}