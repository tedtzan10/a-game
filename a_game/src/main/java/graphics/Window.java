package graphics;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class Window {
    private static long windowHandle;
    private static int width = 800;
    private static int height = 600;
    private static String title = "Game Window";

    static {
        GLFWErrorCallback.createPrint(System.err).set();
        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
    }

    public static void create() {
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE);
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);

        windowHandle = GLFW.glfwCreateWindow(width, height, title, 0, 0);
        if (windowHandle == 0) {
            throw new RuntimeException("Failed to create GLFW window");
        }

        GLFW.glfwMakeContextCurrent(windowHandle);
        GLFW.glfwSwapInterval(1);
        GLFW.glfwShowWindow(windowHandle);

        GL.createCapabilities();
    }

    public static void update() {
        GL11.glClearColor(0.1f, 0.6f, 0.7f, 1.0f);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GLFW.glfwPollEvents();
    }

    public static void swapBuffers() {
        GLFW.glfwSwapBuffers(windowHandle);
    }

    public static boolean isOpen() {
        return !GLFW.glfwWindowShouldClose(windowHandle);
    }

    public static void close() {
        GLFW.glfwDestroyWindow(windowHandle);
        GLFW.glfwTerminate();
    }

    public static long getHandle() {
        return windowHandle;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setTitle(String newTitle) {
        title = newTitle;
        GLFW.glfwSetWindowTitle(windowHandle, title);
    }
}