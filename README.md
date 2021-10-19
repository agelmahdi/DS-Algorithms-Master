# Data Struture and Algorithms 


# Hashing

1. What is Hashing?
- Hashing is a method of sorting and indexing data. which allow a large amount of data to be indexed using keys.

2. Why Hashing?
- it is a time-efficient in the case of SEARCH operation
   -> Arrays -> O(log(n))
   -> LinkedList -> O(n)
   -> Tree -> O(log(n))
   -> Hashing -> O(1) / O(n) in case of collision

3. Hashing Terminology
 - Hash function: it is a function that can be used to map arbitrary size to data of fixed size.
 - Key: the input data is given by a user.
 - Hash value: A value that is returned by the hash function.
 - Hash Table: its a data structure that implements an associative array abstract data type, a structure that can map key to values.
 - Collision: A Collision occurs when two different keys to the hash function produced the same output.

4. Properties of a good hash function.
 - it distributes hash values uniformly across hash tables.
 - it has to use all the input data.

5. Collision Resolution technique

  1. Direct Chaining: hash table is an array of references using a LinkedList.

  2. Open Addressing: Colliding elements are stored in another vacant cell. During storage and lookup, these are found through so-called probing.

     Linear probing: it places a new key into the closest following empty cell.

     Quadratic probing: add arbitrary quadratic polynomial to the index until an empty cell is found.

     Double probing: the interval between probes is computed by another hash function.

6. Pros and cons of Collision Resolution technique

 1. Direct Chaining
  pros - Hash table never gets full.
  cons - Huge linked list causes performance leaks (Time complexity for search operation will become O(n)).
  -> Frequently used to perform deletion operation.

 2. Open addressing
   pros - Easy implementation.
   cons - when hash table is full, creation of new hash table affects the performance (Time complexity for search operation will become O(n)).
   -> Always used if the input size is known.

7. Pros and cons of Hashing
 pros - on average insertion/deletion/search operations take O(1) time complexity
 cons - when hash function is not good enough insertion/deletion/search operations take O(n) time complexity
   -- Hashing Vs Other in worst case of insertion/deletion/search operations
   -> Arrays -> O(n)
   -> LinkedList -> O(n)
   -> Tree -> O(log(n))
   -> Hashing -> O(1) / O(n) in case of not good enough hash function
   
   
# Searching Algorithms  

1. Binary Search:
   - Is faster than linear search.
   - Half of the remaining elements can be eliminated at a time, instead of eliminating one be one.
   - Works only for Sorted Array.

2. Binary search Pseudocode:

   - Create a function with two parameters which are a sorted array and a value.
   - Create two pointers: a left pointer at the start of the array, and the right pointer to the end of the array.
   - Based on left and right pointers calculate the middle pointer,
   - While the middle is not equal to the value and start <= end loop:
      -if the middle is greater than the value move the right pointer down
      -if the middle is less than the value move the left pointer up
   - if the value is never found return -1.
  
# Sorting Algorithms

1. What is sorting?
  - by definition sorting refers to arranging data in a particular format: either ascending or descending

 2. types of sorting

                           Sorting
                         /         \
                        /           \
                       /             \
                Space used           Stability
                  /    \              /    \
                 /      \            /      \
                /        \          /        \
            in space  out space   Stable    Unstable

   A. Space Used

    - In Space sorting: sorting algorithms which does not require any extra space for sorting.
     Ex-> Bubble sort, Selection sort

    - Out Space sorting: sorting algorithms that require extra space for sorting.
     Ex-> Merge sort

   B. Stability

    - Stable sorting: if a sorting algorithm after sorting does not change the sequence of the similar content in which they appear in the original one.
     Ex-> Insertion sort

    - Unstable sorting: if a sorting algorithm after sorting changes the sequence of the similar content in which they appear in the original one.
     Ex-> Quick sort

 3. Sorting terminology

     - Increasing order: if the successive element is greater than the previous one.
       Ex-> 1, 3, 5, 7, 9, 11

     - Decreasing order: if the successive element is less than the previous one.
       Ex-> 11, 9, 7, 5, 3, 1

     - Non-Increasing order: if the successive element is Less than or Equal to its previous element in the sequence.
       Ex-> 11, 9, 7, 5, 5, 3, 1

     - Non-Decreasing order: if the successive element is Greater than or Equal to its previous element in the sequence.
       Ex-> 1, 3, 5, 7, 7, 9, 11

 4. Sorting algorithms

   A. Bubble Sort: referred also as Sinking sort in which Repeatedly compare each pair of adjacent items and swap them if they are in the wrong order.
     -> When to use?
      - The input is almost sorted
      - Space is a concern
      - Easy implementation

     -> When to avoid?
      - Average time complexity is poor.

  B. Selection Sort: Repeatedly find the minimum element and move it to the sorted part of the array to make the unsorted part sorted.
     -> When to use?
      - We have insufficient memory
      - Easy implementation

     -> When to avoid?
       - Time is a concern.

   C. Insertion Sort:
     A. Divide the given array into two parts,
     B. then, take the first element from the unsorted array and find the correct position in the sorted array,
     C. then, repeat until the unsorted array is empty.

      -> When to use?
       - We have a continuous inflow of numbers and we want to keep them sorted.
       - We have insufficient memory.
       - Easy implementation.

      -> When to avoid?
       - Time is a concern.

   D. Bucket Sort:
     A. Create buckets and distribute elements of the array into buckets
     b. Sort the buckets individually
     c. Merge buckets after sorting

      -> When to use?
       - The Input uniformly distributed with small differences between numbers -> like 1,3,4,6,7,8,10,8,9

      -> When to avoid?
       - Space is a concern.

   E. Merge Sort:
     A. is a divide and conquer algorithm
     B. Divide the input array into two halves and we keep halving recursively until they become too small that cannot be broken further
     C. Merge halves by sorting them

      -> When to use?
       - Stable sort is required.
       - Average expected time O(n log(n)).

      -> When to avoid?
       - Space is a concern.

   F. Quick Sort: Preferred over other sorting algorithms
    A. Is a divide and conquer algorithm.
    B. Find the pivot number and make sure smaller numbers are located at the left of pivot and the bigger numbers are located at the right of the pivot.
    C. Unlike merge sort extra space not required.

     -> When to use?
      - Average expected time O(n log(n)).

     -> When to avoid?
      - Space is a concern.
      - Stable sort is required.

   H. Heap Sort :
    A. Step#1: Insert data to binary heap
    B. Step#2: Extract data from binary heap
    C. it is best suitable with array rather than linked list

 5. Algorithm priority selection:

   A. Stability.
   B. Space Efficient.
   C. Time Efficient.
   
# Greedy Algorithms

1. What is Greedy Algorithms?
  A. it is an algorithmic paradigm that build the solution piece by piece
  B. in each step it chooses the piece that offers most obvious and immediate benefit
  C. it fits perfectly for those solutions  in which local optimal solution lead to global solution

2. Problems solved by Greedy Algorithm?
  - Insertion sort:
    A. Divide an array into two parts which are sorted and unsorted.
    B. from the unsorted array we take the first element and put it in its perfect location in the sorted array.

  - Selection sort:
    A. Divide an array into two parts which are sorted and unsorted.
    B. at each iteration we are finding the minimum element from unsorted array and put it in its location in the sorted array.

  - Topological Sort: sorts a given action in such a way that if there is a dependency of one action on another,
     then the dependant action always comes later than its parent action.

  - Prims Algorithm: it finds a minimum spanning tree for weighted undirected graphs.
    A. Take any vertex a s a source set its weight to 0 and all  other vertices weight to infinity.
    B. for every adjacent vertices if the current weight is more than current edge then we set it to current edge.
    C. then make mark current as visited.
    D. repeat these steps for all vertices in increasing order of weight.

  - Kruskal Algorithm: it finds a minimum spanning tree for weighted undirected graphs.
    A. Add increasing cost edges at each step
    B. Avoid any cycle at each step

  - Activity selection problem: Given N number of activities with their start and end times.
     We need to select the maximum number of activities that can performed by a single person,
     assuming that a person can only work on a single activity at a time.

  - Coin change problem: Given coins of different denominations and the total amount of money.
     Find the minimum number of coins that you need to make up the given amount.

  - Fractional knapsack problem: Given a set of items, each with a weight and a value,
   determine the number of each item to include in a collection so that the total weight
   is less than or equal to a given limit and the total value is as large as possible.
   
# Divide and conquer Algorithms

1. What is divide and conquer algorithms: are a design paradigm that works by recursively breaking down a problem into sub-problems of similar type,
    until these become simple enough to be solved directly.
    The solution to the sub-problems are then combined to give a solution to the original problem.

                                                        Main problem
                                                        /           \
                                                       /             \       -> Divide
                                                      /               \
                                             Sub problem 1        Sub problem 2
                                               /  \                     /  \
                                              /    \                   /    \
                                             /      \                 /      \
                                          sub1      sub2            sub1    sub2
                                             \       /               \        /
                                              \     /                 \      /
                                           Subs1 solution          Subs2 solution
                                                  \                     /
                                                   \                   /     -> Merge
                                                    \                 /
                                                   Main problem solution

2. Properties of divide and conquer Algorithms:
   -> Optimal substructure: if any problems overall optimal solution can be constructed from
       the optimal solutions of its subproblems then this problem has optimal structure.

3. why do we need it?
   -> it is very efficient when the problem has optimal substructure property.

4. Common divide and conquer algorithms:
   A. Merge sort
   B. Quick sort
   C. Fibonacci number
   
# Dynamic Programming

1. What is Dynamic Programming "DP"?
  - DP is an algorithmic technique for solving an optimization problem by
       breaking it down into simpler sub-problems and utilizing the fact that the optimal solution to the overall problem depends upon the optimal solution to its sub-problems.

2. Properties of Dynamic programming:
   A. Optimal Substructure: if any problem's overall optimal solution can be constructed from the optimal solutions of its sub-problem,
      then this problem has an optimal substructure.
   B. Overlapping Sub-problems: sub-problems are the smaller versions of the original problem.
      any problem has overlapping sub-problems if finding its solution involves solving the same sub-problems multiple times.

3. Dynamic Programming techniques
   A. Top down with Memoization: solve the bigger problem by recursively finding the solution to smaller problems. Whenever we solve a sub-problem,
      we cache its results so that we don't end up solving it repeatedly if it is called multiple times. this technique of sorting the results of already solved sub-problems.

   B. Bottom up with Tabulation: is the opposite of the top down approach and avoids recursion. In this approach, we solve the problem bottom up, by solving all related sub-problems first,
      this is done by filling up a table. Based on the result in the table, the solution to top/original problem then computed.

4.                                    Top down                                     Bottom up
        Easyness  |     Easy to come up with solution as it is     |    Difficult to come up with solution.
                  |     extension of divide and conquer.           |
        Runtime   |     Slow.                                      |    Fast.
        Space     |     Unnecessary use of stack memory space.     |    Stack memory is not used.
        Usage     |     Quick solution.                            |    Efficient solution.


# Graphs

1. What is a graph?
  - Graph consists of a finite set of vertices or (Nodes) and a set of edges that connect a pair of nodes.

2. Graph Terminology
  A. Vertices are the node of the graph.
  B. Edge: is the line that connects pairs of vertices.
  C. Unweighted Graph:  A graph that does not have a weight associated with an edge.
  D. Weighted Graph:  A graph that has a weight associated with an edge.
  E. Undirected Graph:  In case the edges of the graph do not have a direction between them.
  F. Directed Graph:  In case the edges of the graph have a direction between them.
  G. Cyclic Graph:  a graph that has a least one loop.
  H. Acyclic Graph:  a graph that has no loop.
  I. Tree: This is a special case of a directed acyclic graph.

3. Graph Types:

                           Graph
                         /         \
                        /           \
                       /             \
                  Directed          Undirected
                  /    \              /    \
                 /      \            /      \
                /        \          /        \
            Weighted  Unweighted  Weighted Unweighted
             /    \                /    \
            /      \              /      \
           /        \            /        \
      Positive    Negative    Positive  Negative



   A.Unweighted - Undirected: No weight associated with any edges, No direction between edges

               V1 - - -V3
               |\       \
               | \       \
               |  \       \
               |   \      V5
               |    \     /
               |     \   /
               |      \ /
               V2- - - V4
   B.Unweighted - Directed: No weight associated with any edges, there is a direction between edges

                V1 - - ->V3
                ^ ^        ^
                |  \        \
                |   \        \
                |    \       V5
                |     \      ^
                |      \    /
                |       \  /
                V2- - -> V4
   C.Positive - weighted - Undirected: there is a positive weight associated with edges, No direction between edges

                    5
               V1 - - -V3
               |\       \
               | \       \ 1
               |  \       \
             2 |   \ 4     V5
               |    \     /
               |     \   / 7
               |      \ /
               V2- - - V4
                   3
   D.Positive - weighted - Directed: there is a positive weight associated with edges, there is a direction between edges

                      5
                 V1 - - -> V3
                 ^ ^        ^
                 |  \        \ 1
                 |   \        \
                 |    \ 4     V5
                2|     \      ^
                 |      \    /
                 |       \  / 7
                 V2- - -> V4
                      3
   E.Negative - weighted - Undirected: there is at least a negative weight associated with edges, No direction between edges

                    -5
                V1 - - -V3
                |\       \
                | \       \ 1
                |  \       \
              2 |   \ -4    V5
                |    \     /
                |     \   / 7
                |      \ /
                V2- - - V4
                    3
   F.Negative - weighted - Directed: there is at least a negative weight associated with edges, there is a direction between edges

                       -5
                  V1 - - -> V3
                  ^ ^        ^
                  |  \        \ 1
                  |   \        \
                  |    \ -4    V5
                 2|     \      ^
                  |      \    /
                  |       \  / 7
                  V2- - -> V4
                       3

 4. Graph representation
   A. Adjacency matrix: an adjacency matrix is a square matrix or 2D array. and the elements of the matrix indicate whether pairs of vertices are adjacent or not in the graph.

                                             _A_ _B_ _C_ _D_ _E_
                   A - - - B               A|_0_|_1_|_1_|_1_|_0_|
                   |\       \              B|_1_|_0_|_0_|_0_|_1_|
                   | \       \             C|_1_|_0_|_0_|_1_|_0_|
                   |  \       \            D|_1_|_0_|_1_|_0_|_1_|
                   |   \       E           E|_0_|_1_|_0_|_1_|_0_|
                   |    \     /
                   |     \   /
                   |      \ /
                   C- - -  D

   B. Adjacency List is a collection of unordered lists used to represent a graph. Each list describes the set of neighbors of a vertex in the graph.

                      A - - - B               |_A_|->|_B_|_|->|_D_|_|->|_C_|_|
                      |\       \              |_B_|->|_A_|_|->|_E_|_|
                      | \       \             |_C_|->|_A_|_|->|_D_|_|   _ _ _
                      |  \       \            |_D_|->|_A_|_|->|_C_|_|->|_E_|_|
                      |   \       E           |_E_|->|_B_|_|->|_D_|_|
                      |    \     /
                      |     \   /
                      |      \ /
                      C- - -  D

   -> When to use?
     A. Adjacency matrix: if the graph is complete or almost complete which means all cells have 1's.
     A. Adjacency List: if the number of edges is few then we should use Adjacency List.

 5. Graph traversal: it is a process of visiting all vertices in a given graph,

   A. Breadth-first search: it starts at some arbitrary node of a given graph and explores the neighbor's nodes that are "at the current level", before moving to the next node.
       -> When to use?
        - if we know that the target vertex is close to the starting point.
       -> Pesudocode

          while all vertices are not explored -------->O(v) -----------------------------------------------------------
           enqueue any starting vertices ------>O(1)                                                                   |
           while queue is not empty -------->O(ver) ----------------------                                             |-> Time and space complexity = O(V+E)
            p = dequeue() ------>O(1)                                     |                                            |
            if p is unvisited ------>O(1)                                 |-> vertices + adjacent = edges = O(edges)---
              mark as visited ------>O(1)                                 |
              enqueue unvisited adjacent vertices of p ------>O(adj)------


   B. Depth-first search: it starts at some arbitrary node of a given graph, and explore as far as possible along each edge before backtracking.
       -> When to use?
        - if we know that the target vertex is buried very deep.
       -> Pesudocode

          while all vertices are not explored -------->O(v) -----------------------------------------------------------
           push any starting vertices ------>O(1)                                                                      |
           while stack is not empty -------->O(ver) ----------------------                                             |-> Time and space complexity = O(V+E)
            p = pop() ------>O(1)                                         |                                            |
            if p is unvisited ------>O(1)                                 |-> vertices + adjacent = edges = O(edges)---
              mark as visited ------>O(1)                                 |
                push unvisited adjacent vertices of p ------>O(adj)---------


 6. Topological sort: sorts a given action in such a way that if there is a dependency of one action on another, then the dependant action always comes later than its parent action.
       -> Pesudocode

          topoSort(Node,Stack)____________
           for all vertices               |
             if vertex unvisited          |-> O(V) ---------
                topoVisited(vertex)_______|                 |
                                                            |
          topoVisited(node, stack)---------                 | -> Time and space complexity = O(V+E)
           for each nodes                  |                |
             if unvisited                  |-> O(E)---------
               topoVisited(neighbor)       |
           stack.push(neighbor)------------

 7. Single source shortest path problem "SSSPP": it is about finding the path between a given vertex "source" to all other vertices in a graph such that
                                           the total distance between them "source and destination" is minimum.

       -> solve this problem using three types of algorithms

         A. Breadth first search algorithm:

             -> Why DFS not a working solution?
              -DFS has the tendency to go "as far as possible" from source, hence it can never find the shortest path

         B. Dijkstra's algorithm:

             -> When not working?
               - with negative Cycle: a cycle is a path of edges or vertices wherein a vertex is reachable from itself, and the total weight of the cycle is a negative number.

         C. Bellman Ford algorithm: if there is a negative cycle it catches it and report its existence

                                     BFS                        |               Dijkstra                   |                    Bellman ford

     A. Time complexity  |           O(V~2)                     |                 O(V~2)                    |                       O(VE)
     B. Space complexity |           O(E)                       |                 O(V)                      |                       O(V)
     C. Implementation   |           Easy                       |               Moderate                    |                     Moderate
     D. Limitation       |    Not working for weighted graphs   |       Not working negative cycle          |                       N/A
     E. Unweighted graph | Good as time and easy implementation |   Not used as implementation not easy     |            Not used as bad time complexity
     F. weighted graph   |          Not supported               |   Use as time is better than bellman      |            Not used as bad time complexity
     G. Negative cycle:  |          Not supported               |               Not supported               |                     supported


 8. All pairs shortest path problem: it is about finding a path between every vertex to all other vertices in a graph such that the total distance between them (source and destination) is minimum.

         A. Floyd warshall algorithm:

             -> formula
                 if D[source][destination] > D[source][viaX] + D[viaX][destination]
                    D[source][destination] = D[source][viaX] + D[viaX][destination]

             -> why to use?
                - The solution takes into account all those steps:
              A. The vertex is not reachable
              B. Two vertices are directly connected
                 - This is the best solution
                 - It can be improved via other vertex
              C. Two vertices are connected via other vertex

             -> not working negative Cycle
              A. to go through cycle we need to go via negative cycle participating vertex at least twice
              B. FW never runs loops twice via same vertex
              C. Hence FW can never detect a negative cycle


                                        BFS                        |               Dijkstra                   |                    Bellman ford               |        Floyd warshall

        A. Time complexity  |           O(V~3)                     |                 O(V~3)                    |                       O(VE~2)                |          O(V~3)
        B. Space complexity |           O(EV)                      |                 O(EV)                     |                       O(V~2)                 |          O(V~2)
        C. Implementation   |           Easy                       |               Moderate                    |                     Moderate                 |         Moderate
        D. Limitation       |    Not working for weighted graphs   |     Not working for negative cycle        |                       N/A                    | Not working for negative cycle
        E. Unweighted graph | Good as time and easy implementation |   Not use as priority queue slow it       |            Not used as bad time complexity   |         Can be used
        F. weighted graph   |          Not supported               |                Can be used                |            Not used as bad time complexity   | Can be preferred as easy implementation
        G. Negative cycle:  |          Not supported               |               Not supported               |                     supported                |          Not supported


 9. Minimum spanning tree "MST": is a subset of edges of connected, weighted, and undirected graph which

    A. Connects all vertices together
    B. No cycle
    C. Minimum total edge

    -> Disjoint set: is a data structure that keeps track of the set of elements that are partitioned into a number of disjoint sets and non-overlapping sets have representative which helps in identifying that set.

      - makeSet(N): used to create initial set
      - union(x,y): merge two given sets
      - findSet(x): returns the set name in which this element is there

             -> solve this problem using two types of algorithms:

                A.  Kruskal Algorithm:

                   - it is a Greedy algorithm
                   - it finds a minimum spanning tree for weighted undirected graphs in two steps:

                       1. Add increasing cost edges at each step
                       2. Avoid any cycle at each step

                  ->Properties
                    - Concentrates on Edges
                    - Finalize edge in each iteration

                  -> Applications
                    - landing cables
                    - Tv network
                    - Tour operation
                    - LAN network
                    - A network of pipes for drinking water or natural gas
                    - An electric grid
                    - Single link cluster

                  -> Pesudocode

                   Kruskal(G)
                   for each vertex
                     mackSet(v) -----------------------------------------> O(v)
                   sort each edge in non decreasing order by weight  ----> O(E Log(e)) | Time complexity = O(E log(E))
                   for each edge (u,v) ----------------------------------> O(e)        | Space Complexity = O(E+V)
                     if findSet(u) != findSet(v)
                       union(u,v)----------------------------------------> O(v)
                       cost = cost + edge(u,v)

                B. Prims Algorithm:

                   - it is a Greedy algorithm
                   - it finds a minimum spanning tree for weighted undirected graphs in following steps:

                       1. Take any vertex a s a source set its weight to 0 and all  other vertices weight to infinity
                       2. for every adjacent vertices if the current weight is more than current edge then we set it to current edge
                       3. then make mark current as visited
                       4. repeat these steps for all vertices in increasing order of weight

                  ->Properties
                    - Concentrates on Vertices
                    - Finalize vertex in each iteration

                  -> Applications
                    - Network for roads and rail tracks connecting all cities
                    - Irrigation channels and placing microwaves towers
                    - Designing a fiber-optic grid or ICs
                    - Traveling salesman problem
                    - Cluster analysis
                    - Pathfinding algorithm us in AI
            
            
