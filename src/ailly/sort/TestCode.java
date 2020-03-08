package ailly.sort;

import java.util.ArrayList;
import java.util.List;

public class TestCode {

  public static int jump(List<Integer> nums, int N, int K, int H) {
    int res = 0;

    for (int k = 0; k < K; k++) {
      int jump = res + H;
      int index = 0;
      int tmpMax = -1;
      for (int i : nums) {
        if (jump >= i && i != 0) {
          if (i > tmpMax) {
            tmpMax = i;
          }
          nums.set(index, 0);
        }
        index++;
      }
      res += (tmpMax - res) * 2;
    }
    return res;
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(6);
    int res = jump(list, 3, 3, 2);
    System.out.println(res);
  }

}
