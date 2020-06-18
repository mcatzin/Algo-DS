/*
Given a set with distinct elements,
find all of its distinct subsets.

Input: [1, 5, 3]
Output: [], [1], [5], [3], [1,5], [1,3], [5,3], [1,5,3]
*/

public static List<List<Integer>> findSubsets(int[] nums){
  List<List<Integer>> subset = new ArrayList<>();
  subset.add(new ArrayList<>());

  for(int currentNumber : nums){
    int n = subset.size();

    for(int i = 0; i < n; i++){
      List<Integer> set = new ArrayList<>(subset.get(i));
      set.add(currentNumber);
      subet.add(set);
    }
  }

  return subset;
}

/*
time: O(2n)

space: O(2n);


*/
