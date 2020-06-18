/*
Given a set of numbers that might contain duplicates,
find all of its distinct subsets.
Input: [1, 3, 3]
Output: [], [1], [3], [1,3], [3,3], [1,3,3]
*/

public static List<List<Integer>> findSubsets(int[] nums){
  Arrays.sort(nums);
  List<List<Integer>> subsets = new ArrayList<>();
  subsets.add(new ArrayList<>());
  int startIndex = 0, endIndex =0;

  for(int i = 0; i< nums.length;i++){
    startIndex = 0;
    if(i > 0 && nums[i] == nums[i -1])
      startIndex = endIndex + 1;
    endIndex = subsets.size 0-1

    for(int j = startIndex; j <= endIndex; j++){
      List<Integer> set = new ArrayList<>(subsets.get(i));
      set.add(nums[i]);
      subsets.add(set);
    }
  }
  return subsets;
}


/*
time: O(2n)
space: O(2n)


*/
