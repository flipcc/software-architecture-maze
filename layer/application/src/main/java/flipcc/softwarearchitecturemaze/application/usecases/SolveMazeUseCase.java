package flipcc.softwarearchitecturemaze.application.usecases;

import flipcc.softwarearchitecturemaze.domain.entities.Maze;

public interface SolveMazeUseCase {
    Maze movePlayerThroughMaze();
}