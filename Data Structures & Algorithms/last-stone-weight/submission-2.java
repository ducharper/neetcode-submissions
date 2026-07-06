class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first == second) {
                continue;
            } else if (first > second) {
                pq.add(first - second);
            }
        }

        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.poll();
        }
    }
}
