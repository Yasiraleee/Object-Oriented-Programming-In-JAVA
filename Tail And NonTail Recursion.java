package com.company;
class nontail{
    int[] rez(int[] array,int i){
        int temp=0;
        if (i < array.length) {
            rez(array,i+1);
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
class tail{
    int[] nrez(int[] array, int index){
        int temp=0;
        if(index == (array.length-1)) {
            return array;
        }
        for (int j=0; j< (array.length-1);j++){
            if(array[j]>array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        return nrez(array,index+=1);
    }
}
public class Main {
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6,7};
        int temp=0;
        nontail r1=new nontail();
        r1.rez(arr,0);
        int arr2[]=r1.rez(arr,0);
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("NON TAIL!");
        tail t1=new tail();
        t1.nrez(arr,0);
        int arr3[]= t1.nrez(arr,0);
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
