package lab3;

public class Ex3_4 {
    public static void main(String[] args) {

        int[] x = {1,2,3,4,5};
        int[] y = {61,2,3,4,5};
        boolean equal = true;

        if(x == y){
            System.out.println("equals");
        }
        else if(x.length == y.length) {
            for(int i=0; i < x.length; i++){
                if(x[i] != y[i]){
                    equal = true;
                    break;
                }
                else
                    equal = false;
            }
        }
        if(equal)
            System.out.println("not equal");
        else
            System.out.println("equal");

    }
}
