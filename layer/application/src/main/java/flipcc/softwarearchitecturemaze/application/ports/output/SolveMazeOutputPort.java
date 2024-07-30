package flipcc.softwarearchitecturemaze.application.ports.output;

import flipcc.softwarearchitecturemaze.domain.entities.Maze;

public interface SolveMazeOutputPort {
    Maze fetchMaze();
}
