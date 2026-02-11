import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

package graphics;


public class Texture {
    private int textureID;

    public Texture(String filePath) {
        loadTexture(filePath);
    }

    private void loadTexture(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new RuntimeException("Texture file not found: " + filePath);
        }
    }

    public void bind(int unit) {
        GL13.glActiveTexture(GL13.GL_TEXTURE0 + unit);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureID);
    }

    public void unbind() {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
    }

    public void delete() {
        GL11.glDeleteTextures(textureID);
    }

    public int getID() {
        return textureID;
    }
}