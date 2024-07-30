package flipcc.softwarearchitecturemaze.application.ports.input;

import flipcc.softwarearchitecturemaze.application.ports.output.SolveMazeOutputPort;
import flipcc.softwarearchitecturemaze.application.usecases.SolveMazeUseCase;
import flipcc.softwarearchitecturemaze.domain.entities.Maze;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolveMazeInputPort implements SolveMazeUseCase {
    @Autowired
    private SolveMazeOutputPort solveMazeOutputPort;

    @Override
    public Maze movePlayerThroughMaze() {
        Maze maze = solveMazeOutputPort.fetchMaze();

        maze.movePlayer();

        return maze;
    }
}
