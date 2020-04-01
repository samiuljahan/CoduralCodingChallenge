import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] a = {1, 4, 2, 6, 10, 8};
    System.out.println(Arrays.toString(findPair(a, 10)));
  }
  static int[] findPair(int[] a, int key){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < a.length; i++)
    {
      if(map.containsKey(key - a[i])){
        return new int[]{a[i], (key - a[i])};
      }else map.put(a[i], a[i]);
    }
    return null;
  }
}
