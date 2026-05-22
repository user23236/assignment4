public class Experiment {

    public void runTraversals(Graph g) {

        long start;
        long end;

        System.out.println("\nBFS Traversal:");
        start = System.nanoTime();
        g.bfs(0);
        end = System.nanoTime();
        System.out.println("BFS Time: " + (end - start) + " ns");

        System.out.println("\nDFS Traversal:");
        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();
        System.out.println("DFS Time: " + (end - start) + " ns");
    }

    private Graph buildBranchingGraph(int size) {
        Graph g = new Graph();

        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size / 2; i++) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size) {
                g.addEdge(i, left);
            }

            if (right < size) {
                g.addEdge(i, right);
            }
        }

        return g;
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            Graph g = buildBranchingGraph(size);

            System.out.println("\n=======================");
            System.out.println("Graph Size: " + size);
            System.out.println("=======================");

            if (size == 10) {
                g.printGraph();
            }

            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("\nExperiments completed.");
    }
}