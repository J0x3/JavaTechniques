package factory;

public class JohnsonCrop implements Crop
{
    private CropType cropType;

    public JohnsonCrop(CropType cropType)
    {
      this.cropType = cropType;
    }

    @Override
    public String toString()
    {
      return "Johson " + cropType + " crop.";
    }

    @Override
    public CropType getCropType()
    {
      return cropType;
    }
}
