/*
Given a set of distinct numbers, find all of its permutations.

*/

public static List<List<Integer>> findPermutation(int[] nums){
  List<List<Integer>> result = new ArrayList<>();
  Queue<List<Integer>> permutation = new LinkedList<>();
  permutation.add(new ArrayList<>());

  for(int currentNumber : nums){
    int n = permutation.size();

    for(int i = 0; i< n; i++){
      List<Integer> oldPermutation = permutation.poll();
      for(int j = 0; j <= oldPermutation.size();j++){
        List<Integer> newPermutation = new ArrayList<>(oldPermutation);
        newPermutation.add(j, currentNumber);
        if(newPermutation.size() == nums.length){
          result.add(newPermutation);
        }else {
          permutation.add(newPermutation);
        }
      }
    }

  }

  return result;
}

/*



*/
