import textures.Texture;
import utils.Vector2f;
import utils.Vector3f;

package meshes;

class Mesh {
    
    private Vector2f[] uvCoords;
    private Vector3f[] vertices;

    private Texture texture;

    public Mesh(String name, int vertexCount, Vector3f[] vertices) {
        this.name = name;
        this.vertexCount = vertexCount;
        this.vertices = vertices;
    }

    public Vector3f[] getVertices() {
        return vertices;
    }
}