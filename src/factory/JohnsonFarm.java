package factory;

public class JohnsonFarm implements Farm
{
    public Crop harvestCrop(CropType cropType)
    {
        return new JohnsonCrop(cropType);
    }
}
