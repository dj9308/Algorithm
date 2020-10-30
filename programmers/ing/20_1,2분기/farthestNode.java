import java.util.*;

// 문제를 보고 BFS로 풀어야 겠다는 생각을 가지는건 별로 안걸림.
// BFS원리를 다시 보고 문제를 풀음.
// 실패 후 인터넷 참고 한 다음 문제해결.



class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<Integer>[] neighbors = new ArrayList[n];
        for (int i = 0; i < n; i++)
            neighbors[i] = new ArrayList<>();

        for (int[] pair : edge) {
            neighbors[pair[0] - 1].add(pair[1] - 1);
            neighbors[pair[1] - 1].add(pair[0] - 1);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        int size = 0;

        do {
            size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();

                for (int neighbor : neighbors[node]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        } while (!queue.isEmpty());

        return size;
    }
}
