import java.util.*;

class ques4{

  ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set, int index)
  {
    //Base Condition
    ArrayList<ArrayList<Integer>> allSets;
    if(set.size()==index){
      allSets = new ArrayList<ArrayList<Integer>>();
      allSets.add(new ArrayList<Integer>());
    }else{
      allSets = getAllSubsets(set,index+1);
      int item = set.get(index);
      ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
      for(ArrayList<Integer> subset : allSets)
      {
        ArrayList<Integer> newSubset = new ArrayList<Integer>();
        newSubset.addAll(subset);
        newSubset.add(item);
        moreSubsets.add(newSubset);
      }
      allSets.addAll(moreSubsets);
    }
    return allSets;
  }

  public static void main(String[] args) {

    ques4 q = new ques4();
    ArrayList<Integer> ar = new ArrayList<Integer>();
    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);

    ArrayList<ArrayList<Integer>> lol = q.getAllSubsets(ar,0);
    System.out.println(lol);
  }

}
