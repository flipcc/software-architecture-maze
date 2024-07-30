package flipcc.softwarearchitecturemaze.integration.adapters.output;

import flipcc.softwarearchitecturemaze.application.ports.output.SolveMazeOutputPort;
import flipcc.softwarearchitecturemaze.domain.entities.Maze;
import org.springframework.stereotype.Repository;

@Repository
public class MazeOutputAdapter implements SolveMazeOutputPort {
    Maze maze;

    public MazeOutputAdapter() {
        this.maze = new Maze();
    }

    @Override
    public Maze fetchMaze() {
        return this.maze;
    }
}
