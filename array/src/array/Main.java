package array;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int len = 0;
        Scanner in = new Scanner(System.in);
        len = readNumber.readNumber(in, "Enter number of length matrix");
        if (len == 0){
            System.exit(0);
        }
        int arr[][] = new int [len][len];
        ArrayList<ArrayList<Integer>>  arrList = new ArrayList<>();
        for(int i= 0 ; i< len ; i++){
            Random r = new Random();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j< len; j++){
                row.add( r.nextInt()%100 );
            }
            arrList.add(row);
        }
        output.out(arrList);

        int i = 0; // snake
        int counter = 1;
        boolean toRight = true;
        while( i<arrList.size() ){
            if( toRight ){
                for( int j = 0; j<arrList.get(i).size() ; j++){
                    System.out.print(arrList.get(i).get(j)+" ");
                }
            }else{ //to left
                for( int j = arrList.get(i).size() -1 ; j>=0; j-- ){
                    System.out.print(arrList.get(i).get(j)+" ");
                }
            }
            toRight = !toRight;
            i++;
        }
        System.out.println("========");
        i=0; //volute
        int j=0;
        int length = len;
        for( j = 0 ;j < length; j++){
            System.out.print(arrList.get(i).get(j)+" ");
        }
        j--;
        while( length > 0 ){
            length--;
            for(int steps = 0; steps<length;  steps++ ){
                System.out.print(arrList.get(++i).get(j)+" ");
            }
            for(int steps = 0; steps<length;   steps++ ){
                System.out.print(arrList.get(i).get(--j)+" ");
            }
            length--;
            for(int steps = 0; steps<length;  steps++ ){
                System.out.print(arrList.get(--i).get(j)+" ");
            }
            for(int steps = 0; steps<length;  steps++ ){
                System.out.print(arrList.get(i).get(++j)+" ");
            }
        }
    }
}