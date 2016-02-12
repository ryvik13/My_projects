package array;

import java.util.ArrayList;

public class output {
    public static void out(ArrayList<ArrayList<Integer>> arrList){
        for(int i= 0 ; i < arrList.size(); i++){
            for(int j=0; j<arrList.get(i).size(); j++){
                System.out.print(String.format("%3d" , arrList.get(i).get(j)));
            }
            System.out.println();
        }
    }
}
