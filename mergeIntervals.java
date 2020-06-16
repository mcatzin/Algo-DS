
//Problem statement
/*
Given a list of intervals, merge all the overlapping intervals to produce a list
that has only mutually exculsive intervals

Intervals: [[1,4],[2,5],[7,9]]
output: [[1,5],[7,9]]
*/
import java.util.*;

class Intervals {
  int start;
  int end;

  public Intervals(int start, int end){
    this.start = start;
    this.end = end;
  }
}

class MergeIntervals {

  public static List<Intervals> merge(List<Intervals> intervals){
    //edge case 1
    if(intervals.size() < 2){
      return intervals;
    }

    Colloection.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

    List<Interval> mergeIntervals = new LinkedList<Intervals>();
    Iterator<Intervals> intervalItr = intervals.iterator();
    Intervals interval = intervalItr.next();
    int start = interval.start;
    int end = interval.end;

    while(intervalItr.hasNext()){
      interval  = intervalItr.next();
      if(interval.start <= end){//overlapping intervals,
        end = Math.max(interval.end, end);
      }else{
        mergeIntervals.add(new Interval(start, end));
        start= interval.start;
        end = intertval.end;
      }
    }

    // add the last interval
    mergeIntervals.add(new Interval(start, end));

    return mergedIntervals;
  }
}

/*
time complexity: O(N*logN)
N is the total number of intervals. We are iterating the intervals only once which will take
O(N), in the beginning though, since we need to sort the intervals. Sorting
takes worst case O(N*logN)

space: O(N)



*/
