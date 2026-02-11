package main;

public class GameLoop {
    public static void main(String[] args) {
        GameLoop game = new GameLoop();
        game.run();
    }

    public void run() {
        boolean running = true;
        long lastTime = System.nanoTime();
        double deltaTime;

        while (running) {
            long currentTime = System.nanoTime();
            deltaTime = (currentTime - lastTime) / 1_000_000_000.0;
            lastTime = currentTime;

            update(deltaTime);
            render();
        }
    }

    private void update(double deltaTime) {
        // Update game state
    }

    private void render() {
        // Render game
    }
}