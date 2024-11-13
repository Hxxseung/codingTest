package programmers.lv1;

import java.util.Arrays;

public class DescendingOrder {
    class Solution {
        public long solution(long n) {
            char[] sort = Long.toString(n).toCharArray();
            Arrays.sort(sort);
            StringBuilder sb = new StringBuilder();
            sb.append(new String(sort));
            sb.reverse();
            return Long.parseLong(sb.toString());
        }
    }
}
