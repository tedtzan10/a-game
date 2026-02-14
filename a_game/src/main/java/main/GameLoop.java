package main;

import graphics.Window;

public class GameLoop implements Runnable {

    private Thread gameThread;

    private void start() {
        gameThread = new Thread(this, "fart");
        gameThread.start();
    }
    public static void main(String[] args) {
        new GameLoop().start();
        System.out.println("Hello world");
    }

    private void update() {
        Window.update();
        // Update game logic here

    }

    private void render() {
        
        // Render game here
        

        Window.swapBuffers();
    }

    @Override
    public void run() {
         
        while (Window.isOpen()) {
            update();
            render();
        }
    }
    
}
