package a_game.src.main;

import a_game.src.graphics.Window;

public class GameLoop implements Runnable {

    private Thread gameThread;

    private void start() {
        gameThread = new Thread("fart");
        gameThread.start();
    }
    public static void main(String[] args) {
        new GameLoop().start();
        System.out.println("Hello world");
    }

    @Override
    public void run() {
        /* 
        while () {
            // Game loop logic would go here
            
        }
        */
    }
    
}
