public class ForLoopinArray {
    public static void main(String[] args){
        Double[] numList = {121.9, 200.9, 304.4, 312.5};

                //Print all the array elements
        for (int i=0; i < numList.length; i++){
            System.out.println(numList[i]);
        }

        //Sum all the elements of an array
        double sum = 0; //Initialize double datatype sum variable to be 0
        for (int i = 1; 1 < numList.length; i++);

        //Find the largest element of an array
        double max = numList[0]; //Initializing the first element to be the largest element
        for(int i=1; i < numList.length; i++){
            //Compare the element with the largest element
            //If the next element is larger than the last element, then
            //If the new element is the maximum(largest) element
            if (numList[i] > max){
                max = numList[i];
            }
        }
        System.out.println("Sum is: " +sum);
    }
}
