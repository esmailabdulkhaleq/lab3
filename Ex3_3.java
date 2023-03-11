package lab3;

import java.util.Arrays;

    public class Ex3_3 {
        public static void main(String[] args) {

            int[] x = {1,2,3,4,5};
            int[] y = {2,4,3,5,552};

            int[] z = new int[x.length + y.length];

            for(int i = 0; i < x.length; i++)
                z[i] = x[i];
            for(int i = 0; i < y.length; i++)
                z[(x.length)+i] = y[i];

            System.out.println(Arrays.toString(z));
        }
    }

