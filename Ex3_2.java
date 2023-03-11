package lab3;

import java.util.Arrays;

public class Ex3_2 {
    int id;
    String name;
    int age;


    public Ex3_2( int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;

    }

    @Override
    public String toString(){
        return "{ id : " + id+ ", name " + name + ",  : " + age + " }";
    }
    public static void main(String[] args) {

        Ex3_2[] x = new Ex3_2[2];
        x[0] = new Ex3_2( 7,"esmail", 22);
        x[1] = new Ex3_2( 6,"saleh", 33);

        Ex3_2[] y = new Ex3_2[x.length];
        y = x;

        for(int i=0; i<x.length; i++){
            System.out.println(x[i].toString());
        }
    }
}