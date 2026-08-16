import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class exersicearray {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       // Q1;


        int numb[]=new int[4];
        System.out.println("enter the elements to know : ");
        for(int i=0;i<numb.length;i++){
            System.out.println("element"+(i+1)+":");
            numb[i]=s.nextInt();
        }
        if (numb[0]==numb[numb.length - 1]) {
            System.out.println("the same");
        }else {
            System.out.println("not the same");
        }

       // Q2
        double avrg=0;
        int sum=0;
        int []num=new int[7];
        System.out.println("enter the numbers : ");
        for(int i=0;i<num.length;i++){
            System.out.println("the number "+(i+1)+":");
            num[i]=s.nextInt();
            sum+=num[i];
            avrg=sum/num.length;
        }
        System.out.println("the avrage of the array :"+avrg);
        for(int largest:num)
            if(avrg<largest){
                System.out.println("the number greater than average: "+largest);
            }


        //Q3

        System.out.println("enter the size :");
        int size=s.nextInt();
        int value[]=new int[size];

        System.out.println("to get the larger value between first and last index enter the elements : ");
        for(int i=0;i<value.length;i++) {
            System.out.println("element one " + (i + 1) + ":");
            value[i] = s.nextInt();
        }
        int firstelemnts=value[0];
        int lastelements=value[value.length-1];
        int larger=0;

        if(firstelemnts>lastelements){
            larger=firstelemnts;
        }else {;
            larger=lastelements;
        }
        System.out.println("the larger value between first and last elements:"+larger);


        //Q4

        int array []=new int[3];
        System.out.println("enter the elements :");
        for(int i=0;i< array.length;i++){
            System.out.println("elements"+(i+1)+":");
            array[i]=s.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        int x=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=x;
        System.out.println("new array is :"+ Arrays.toString(array));


        //Q5


                ArrayList<Integer> oldarray = new ArrayList<>();
                ArrayList<Integer> newarray = new ArrayList<>();
                System.out.println("how many elements do you want to enter?");
                int n = s.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.println("enter the elements:");
                    int elemententer = s.nextInt();
                    oldarray.add(elemententer);
                }
                for (int i = 0; i < oldarray.size(); i++) {
                    if (oldarray.get(i) % 2 != 0) {
                        newarray.add(oldarray.get(i));
                    }
                }
                for (int i = 0; i < oldarray.size(); i++) {
                    if (oldarray.get(i) % 2 == 0) {
                        newarray.add(oldarray.get(i));
                    }
                }

                System.out.println(" the new Array: " + newarray);



                //Q6





                System.out.println("Enter the size of the first array:");
                int size1 = s.nextInt();
                int[] array1 = new int[size1];
                System.out.println("Enter the elements of the first array:");
                for (int i = 0; i < size1; i++) {
                    array1[i] = s.nextInt();
                }
                System.out.println("Enter the size of the second array:");
                int size2 = s.nextInt();
                int[] array2 = new int[size2];
                System.out.println("Enter the elements of the second array:");
                for (int i = 0; i < size2; i++) {
                    array2[i] = s.nextInt();
                }

                System.out.println("A1= " + Arrays.toString(array1));
                System.out.println("A2= " + Arrays.toString(array2));

                boolean isEqual = true;
                if (array1.length!= array2.length) {
                    isEqual = false;
                } else {
                    for (int i = 0; i < array1.length; i++) {
                        if (array1[i] != array2[i]) {
                            isEqual = false;
                        }
                    }
                }
                if (isEqual) {
                    System.out.println("The arrays are equal.");
                } else {
                    System.out.println("The arrays are not equal.");
                }











            }
        }














