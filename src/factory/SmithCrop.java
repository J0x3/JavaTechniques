package factory;

public class SmithCrop implements Crop
{
    private CropType cropType;

    public SmithCrop(CropType cropType)
    {
      this.cropType = cropType;
    }

    @Override
    public String toString()
    {
        return "Smith " + cropType + " crop.";
    }

    @Override
    public CropType getCropType()
    {
      return cropType;
    }
}
