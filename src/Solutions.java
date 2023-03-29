//Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
public class Solutions {
        public int countOdds(int low, int high) {
            if (high % 2 == 0) high--;
            if (low % 2 == 0) low++;
            return ((high - low) / 2) + 1;
        }
}

