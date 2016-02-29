package com.andyaylward.maze.core;

public class SolveStatistics {
  private final int shortestPathLength;
  private final long runDuration;
  private final Point endPoint;

  public SolveStatistics(int shortestPathLength, long runDuration, Point endPoint) {
    this.shortestPathLength = shortestPathLength;
    this.runDuration = runDuration;
    this.endPoint = endPoint;
  }

  public int getShortestPathLength() {
    return shortestPathLength;
  }

  public long getRunDuration() {
    return runDuration;
  }

  public Point getEndPoint() {
    return endPoint;
  }
}
