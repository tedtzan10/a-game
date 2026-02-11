package graphics;

import org.lwjgl.opengl.GL30;

public class VAOLoader {
    public static int loadVAO() {
        int vaoID = GL30.glGenVertexArrays();
        GL30.glBindVertexArray(vaoID);
        return vaoID;
    }

    public static void bindVAO(int vaoID) {
        GL30.glBindVertexArray(vaoID);
    }

    public static void unbindVAO() {
        GL30.glBindVertexArray(0);
    }

    public static void deleteVAO(int vaoID) {
        GL30.glDeleteVertexArrays(vaoID);
    }
}