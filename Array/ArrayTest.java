class ArrayTest{  
	static void getArrayList(int a[]){
		System.out.println("=========foreach==========");
		for(int x:a){
			System.out.println("a = "+x);
		}
	}
	
	 int[] returnArray(){
		return new int[]{15,25,48,67};
	}
	
  public static void main(String args[]){  
  ArrayTest at = new ArrayTest();
   int a[] = new int[5];
    a[0]=10;//initialization  
    a[1]=20;  
	a[2]=70;  
	a[3]=40;  
	a[4]=50;  
	
	System.out.println("length = "+a.length);
	
	for(int i=0;i<a.length;i++){
		System.out.println("a["+i+"] = "+a[i]);
	}
	
	System.out.println("=========foreach==========");
	for(int x:a){
		System.out.println("a = "+x);
	}
	int array[] = {25,36,54,78,3}; 
	getArrayList(array);
	System.out.println("===Anonymous Array===");
	getArrayList(new int[]{10,22,44,66});
	
	int[] arr = at.returnArray();
	System.out.println("=========foreach==========");
	for(int x:arr){
		System.out.println("a = "+x);
	}
	
	int[][] arr1 = {{1,2,9,10},{3,4,8,11},{5,6,7,12},{13,14,15,16}};
	for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				System.out.println("arr1["+i+"]["+j+"] = "+arr1[i][j]);	
			}
	}
  }  
} 