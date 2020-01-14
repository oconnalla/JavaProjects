package hello;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
        //use a for loop to call drawBox
        for (int i =0; i<5; i++){
            drawBox();
        }
    }

    public static void drawBox(){
        String hor = "+---+";
        String vert = "|   |";
		System.out.println(hor);
		System.out.println(vert);
		System.out.println(vert);
		System.out.println(hor);
    }

}