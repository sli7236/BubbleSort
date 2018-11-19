package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] runnerArray = {8, 6, 7, 5, 3, 0};
        bubbleSort(runnerArray);
        for (int i = 0; i < runnerArray.length; i++)
        {
            System.out.print(runnerArray[i]);
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length -1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
