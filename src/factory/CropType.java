package factory;

public enum CropType
{
    STRAWBERRY("strawberry"), WHEAT("wheat"), CORN( "corn"), ORANGE("orange");

    private String title;

    CropType(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return title;
    }
}
