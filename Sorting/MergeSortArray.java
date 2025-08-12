//In this code I have use the concept of Divide & conqure(Merge Sort) to sort an array in ascending order.

import java.util.*;
public class MergeSortArray
{
    public static void print(int array[])  //printing array
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
    public static void Mergesort(int array[],int si,int ei)      //sorting arrays 
    {
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei - si)/2; //mid calculation
        Mergesort(array, si, mid); //solve left part
        Mergesort(array, mid+1 , ei); //solve right part
        merge(array,si,ei,mid);
    }

    public static void merge(int array[],int si ,int ei,int mid)     //merging 
    {
        int temp[]=new int[ei-si+1];
        int i = si; //left iterator
        int j = mid + 1; //right iterator
        int k = 0;  //iterator for temp
        while (i<=mid && j<= ei)
        {
            if(array[i]<array[j])
            {
                temp[k]=array[i];
                i++;
            } 
            else 
            {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while(i<=mid)   //remaining elements of left
        {
            temp[k++]=array[i++];
        }
        while(j<=ei)    //remaining elements of right
        {
            temp[k++] = array[j++];
        }

        for(k = 0,i = si;k<temp.length;k++,i++)  //coping temp to original array
        {
           array[i]= temp[k] ;
        }
    }
    public static void main(String[] args) 
    {
        //int array[]={15,5,24,8,1,3,16,10,20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the Array: ");
        int n = sc.nextInt();

        int [] array;
        array = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0 ; i<n ; i++)
        {
            array[i] = sc.nextInt();
        }
        Mergesort(array, 0, array.length-1);
        print(array);
    }
}