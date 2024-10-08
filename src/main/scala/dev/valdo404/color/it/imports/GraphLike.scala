package dev.valdo404.color.it.imports

import sedgewick.graphs.EdgeLike

/** Adjacency list representation of graphs */
trait GraphLike[A <: EdgeLike] {
  /** Number of vertices */
  def V: Int
  /** Number of edges */
  def E: Int

  /** Get list of adjacent vertices
   *
   * @param u Vertex number [0, V)
   * @return Sequence of edges coming out of this vertex
   */
  def adj(u: Int): Seq[A]
}

/** Graphs where we can add and remove edges.
 *
 * Don't mix with GraphMutableWeighted */
trait GraphMutable[A <: EdgeLike] extends Cloneable {
  /** Add an edge
   *
   * @param edge Edge to add
   * @return
   */
  def addEdge(edge: A): Unit

  /** Remove edge if present
   *
   * @param edge Edge to remove
   * @return
   */
  def removeEdge(edge: A): Unit
}

/** Undirected graph trait */
trait UndirectedGraph[A <: EdgeLike] extends GraphLike[A] {
  /** Degree of vertex
   *
   * @param u Vertex number [0, V)
   * @return Degree of that vertex
   */
  def degree(u: Int): Int
}

/** Directed graph trait */
trait DirectedGraph[A <: EdgeLike] extends GraphLike[A] {
  /** In degree of vertex
   *
   * @param u Vertex number [0, V)
   * @return In degree of that vertex
   */
  def indegree(u: Int): Int

  /** Out degree of vertex
   *
   * @param u Vertex number [0, V)
   * @return Out degree of that vertex
   */
  def outdegree(u: Int): Int

  /** Get reverse graph
   *
   * @return Reversed [[DirectedGraph]]
   */
  def reverse: DirectedGraph[A]
}