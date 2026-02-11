import java.util.ArrayList;

public class VAO {
    private int vaoID;
    private ArrayList<VBO> vbos;
    private Texture texture;

    public VAO(int vaoID, ArrayList<VBO> vbos, Texture texture) {
        this.vaoID = vaoID;
        this.vbos = vbos;
        this.texture = texture;
    }

    public void 

    public int getVaoID() {
        return vaoID;
    }

    public void setVaoID(int vaoID) {
        this.vaoID = vaoID;
    }

    public ArrayList<VBO> getVbos() {
        return vbos;
    }

    public void setVbos(ArrayList<VBO> vbos) {
        this.vbos = vbos;
    }

    public void addVBO(VBO vbo) {
        this.vbos.add(vbo);
    }

    public void removeVBO(VBO vbo) {
        this.vbos.remove(vbo);
    }
}