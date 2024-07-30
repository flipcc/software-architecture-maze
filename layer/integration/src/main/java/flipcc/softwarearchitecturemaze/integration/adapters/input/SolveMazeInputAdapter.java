package flipcc.softwarearchitecturemaze.integration.adapters.input;

import flipcc.softwarearchitecturemaze.application.ports.input.SolveMazeInputPort;
import flipcc.softwarearchitecturemaze.domain.entities.Maze;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolveMazeInputAdapter {
    @Autowired
    private SolveMazeInputPort solveMazeInputPort;

    @GetMapping("/")
    public String index() {
        return "Hello Maze Runner!";
    }

    @PostMapping("/player/move")
    public String playerMove() {
        Maze maze = solveMazeInputPort.movePlayerThroughMaze();

        return maze.toString();
    }
}
