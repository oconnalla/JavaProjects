//*******************************************************************

//The class or method name
//
//A program for returning a string that concatenates with itself based on a set number of times entered as an argument. 
//By: Ariel OConnall
//Date 1/28/20
//*******************************************************************
package ch4;

class Repl {
public static void main(String[] args) {
  repl("hello", 3);
  repl("Ariel", 0);
  repl("Ariel", 6 );
}
public static void repl(String s, int times){
  String newS = "";
  for(int i = 0; i< times; i++){
    newS += s;
  }
System.out.println(newS);
}
}