package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length1 = s.nextInt();
        int [] myArray = new int[length1];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length1; i++ ) {
            myArray[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(myArray));

        List<Integer> list =  Arrays.stream(myArray).boxed().collect(Collectors.toList());
        int length= list.size();
        int count = 0;
        for(int i =0; i< length; i++){
            ArrayList<Integer> rem = new ArrayList<>();
            for(int j=0; j<list.size()-1; j++){
               if(list.get(j) < list.get(j + 1)) {
                   rem.add(list.get(j + 1));
               }
            }
            for(int k:rem){
                list.remove((Integer) k);
            }
            if(rem.size()>0){
                count+=1;
            }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
