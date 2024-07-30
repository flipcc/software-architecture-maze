package flipcc.softwarearchitecturemaze.domain.entities;

import java.util.UUID;

public class Maze {
    private final UUID mazeId;
    private int playerStepsTaken;

    public Maze() {
        this.mazeId = UUID.randomUUID();
        this.playerStepsTaken = 0;
    }

    public void movePlayer() {
        this.playerStepsTaken++;

        System.out.println("Moved");
    }

    @Override
    public String toString() {
        return "{ 'mazeId': '%s', 'playerStepsTaken': '%d' }".formatted(this.mazeId.toString(), this.playerStepsTaken);
    }
}
