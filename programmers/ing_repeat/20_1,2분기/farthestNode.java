import java.util.*;

// ������ ���� BFS�� Ǯ��� �ڴٴ� ������ �����°� ���� �Ȱɸ�.
// BFS������ �ٽ� ���� ������ Ǯ��.
// ���� �� ���ͳ� ���� �� ���� �����ذ�.



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
