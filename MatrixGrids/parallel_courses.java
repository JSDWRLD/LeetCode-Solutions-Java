class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : relations) {
            indegree[edge[1]]++; // Increment indegree of dependent
            graph.get(edge[0]).add(edge[1]); // Add dependent to dependencies list
        }

        // If there are courses that have no requirements
        // add to the current semester
        Queue<Integer> currSemester = new LinkedList<>();
        for (int vertex = 1; vertex < n+1; vertex++) {
            if (indegree[vertex] == 0) {
                currSemester.offer(vertex);
            }
        }

        // Start processing
        int semestersNeeded = 0, coursesTaken = 0;
        while (!currSemester.isEmpty()) {
            semestersNeeded++; 

            // Required for building class list for next semester
            Queue<Integer> nextSemester = new LinkedList<>(); 

            // For each course in the current semester
            // see which courses rely on it, then deduct indegree
            for (int course : currSemester) {
                coursesTaken++; 

                for (int depCourse : graph.get(course)) {
                    indegree[depCourse]--;

                    if (indegree[depCourse] == 0) {
                        nextSemester.offer(depCourse);
                    }
                }
            }

            // Copy it over since we dont poll the curr classes we are 
            // processing
            currSemester = nextSemester;
        }

        // If we have exactly n courses taken then 
        // that implies there is no cycle
        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return coursesTaken == n ? semestersNeeded : -1;
    }
}

// n courses 1 to n
// relations -> prev -> nextcourse
// one sem u can take any num of courses
// what is min num of semesters

// DAG -> Topological Sort
// bfs?
// always process the courses that are eligible,
// deduct indegree of dependents
// if indegree = 0 add to next semester
