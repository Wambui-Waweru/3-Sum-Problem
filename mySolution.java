class mySolution {
  public List<List<Integer>> threeSum(int[] A) {
    
      Set<List<Integer>> zeroSum = new HashSet<>();
     
      int n = A.length; 
  
      for (int i = 0; i < n-1; i++) { 
        int min = i; 
        for (int j = i+1; j < n; j++) 
          if (A[j] < A[min]) {
            min = j; 
          }
          int temp = A[min]; 
          A[min] = A[i]; 
          A[i] = temp; 
      } 
      
      
      for (int i = 0; i < n; i++) {
        int left = i + 1;
        int right = n - 1;
        while (left < right ) {
          int curSum = A[i] + A[right] + A[left];
          
          if (curSum == 0 ){
            zeroSum.add(Arrays.asList(A[i], A[left], A[right]));
            right--;
            left++;
          } else if (curSum < 0) {
            left++;
          } else {
            right--;
          }
        }
      }
      
      return new ArrayList<List<Integer>>(zeroSum);
  }
}
