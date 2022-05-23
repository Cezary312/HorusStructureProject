import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{

    private List<CompositeBlock> blocks;

    public Wall(List<CompositeBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<CompositeBlock> findBlockByColor(String color) {
        Optional<CompositeBlock> blockByColor = blocks.stream().filter(b -> b.getColor().equals(color)).findAny();

        return blockByColor;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByColor = blocks.stream().filter(b -> b.getMaterial().equals(material)).collect(Collectors.toList());

        return blocksByColor;
    }

    @Override
    public int count() {
        int totalAmount = 0;

        for(CompositeBlock block : blocks)
        {
            totalAmount += block.getBlocks().size();
        }

        return totalAmount;
    }
}
