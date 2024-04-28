public class NumberSequence {
    /**
     *  다음 수열의 n번째 항을 구하는 재귀 알고리즘
     *  aₙ = 5aₙ₋₁ + 3, a₁ = 0
     *
     * @param n int
     *
     * @return int
     */
    public static int getNthTerm(int n) {
        if (n == 1) {
            return 0;
        }
        return getNthTerm(n-1) * 5 + 3;
    }

    public static void main(String[] args) {
        int result = getNthTerm(3);
        System.out.println(result);
    }
}
