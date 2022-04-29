class RotateLeft {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        //n determine the number of times an array should be rotated  
        int n = 3;  
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
		System.out.println(" ");
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1]; 

				System.out.print(" "+ arr[j]);	
            }  
			System.out.println("=================================== ");	
            //First element of array will be added to the end  
            arr[j] = first;  
			System.out.println("++++++++++++++++++ ");
			System.out.println(" "+ arr[j]);
			System.out.println("++++++++++++++++++ ");
			for(int k =0 ;k<arr.length;k++){
				System.out.print(" "+ arr[k]);
			}
			System.out.println("---------------------------------------");
        }  
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  