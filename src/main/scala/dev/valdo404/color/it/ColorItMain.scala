package dev.valdo404.color.it



class ColorItMain extends App {
  /**
   * Ideas:
   * - take file as argument
   * - take stdin ar argument
   * - reply result as stdout
   * - reply result as file
   *
   * Algorithmic idea:
   * - Topographic walk ?
   * - Track what is already processed and what needs to be processed
   * - What needs to be processed is determined using an heuristic that tracks the biggest available ensemble
   *
   * Combination of flood algorithm and
   * floyd warshall (nope because it does so for all vertexes and seems greedy) ?
   * Widest Path Problem (nope because you it is not the kind of problem) ?
   * Minimum spanning tree (may be the one and especially prim's algorithm)
   */
}
