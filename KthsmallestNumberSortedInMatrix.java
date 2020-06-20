/*
Given an N * NN∗N matrix where each row and column is sorted in ascending order,
find the Kth smallest element in the matrix.

Input: Matrix=[
    [2, 6, 8],
    [3, 7, 10],
    [5, 8, 11]
  ],
  K=5
Output: 7
Explanation: The 5th smallest number in the matrix is 7.
*/
class Node {
  int row;
  int col;

  Node(int row, int col) {
    this.row = row;
    this.col = col;
  }
}

class KthSmallestInSortedMatrix {
pbulic static int findKthSmallest(int[][] matrix, int k){
  PriorityQueue<Node> miHeap = new PriorityQueue<>((n1,n2) ->
  matrix[n1.row][n1.col] - matrix[n2.row][n2.col]
  );
  // put the 1st element of each row in the min heap
 // we don't need to push more than 'k' elements in the heap
for(int i = 0;i < matrix.length &&  i < k;i++){
  minHeap.add(Node(i,0));
}
  int numberCount = 0, result = 0;
  int n = minHeap.size();
while(!minHeap.isEmpty()){
  Node node = minHeap.poll();

  result = matrix[node.row][node.col];
  if(++numberCount == k){
    break;
  }
  node.col++;
  if(matrix[0].length > node.col){
    minHeap.add(node);
  }
}

return result;
}

/*
time: O(min(k,n) + Klogn)
First, we inserted at most ‘K’ or one element from each of the ‘N’ rows,
which will take O(min(K, N))O(min(K,N)). Then we went
through at most ‘K’ elements in the matrix and
remove/add one element in the heap in each step.
As we can’t have more than ‘N’ elements in the heap
in any condition, therefore, the overall time complexity
of the above algorithm

space:O(n)
*/
