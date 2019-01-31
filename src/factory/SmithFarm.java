package factory;

public class SmithFarm implements Farm
{
    public Crop harvestCrop(CropType cropType)
    {
        return new SmithCrop(cropType);
    }
}
