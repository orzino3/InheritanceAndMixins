public class Rose extends Flower
{
    @Override
    public boolean hasProperty(String property) {
        return false;
    }

    @Override
    public boolean isA(String classification) {
        return false;
    }
}
