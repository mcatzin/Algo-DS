
/*

Given a list of non-overlapping intervals sorted by their start time,
insert a given interval at the correct position and merge all necessary
intervals to produce a list that has only mutually exclusive intervals.


*/
import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

public static List<Interval> insert(List<Interval> intervals, Interval newInterval){
  if(intervals == null || intervals.size() == 0){
    return Arrays.asList(newInterval);
  }

  List<Interval> mergedIntervals = new ArrayList<>();
  int i =0;
  // skip and add to output all intervals that come before the newInterval
  while(i < intervals.size() && intervals.get(i).end < newInterval.start){
    mergedIntervals.add(intervals.get(i++));
  }

// merge all intervals that overlap with newInterval
  while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
    newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
    newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
    i++;
  }

  mergedIntervals.add(newInterval);

  // add all the remaining intervals to the output
  while(i < intervals.size()){
    mergedIntervals.add(intervals.get(i++));
  }

  return mergedIntervals;
}



/*
Time: O(n)
space: O(n)

*/
