import java.util.List;

public class CompositeBlockImp implements CompositeBlock{

    private String color;
    private String material;

    public CompositeBlockImp(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return null;
    }
}
