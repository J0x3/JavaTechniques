package factory;


// Farm crop planting factory
// Someone owns a farm
// farm can harvest crops
// crops made at different locations or farms
public class Main
{
    private final Farm farm;

    public Main(Farm farm)
    {
        this.farm = farm;
    }

    private void harvestCrops()
    {
        Crop crop;

        crop = farm.harvestCrop(CropType.WHEAT);
        System.out.println(crop.toString());

        crop = farm.harvestCrop(CropType.STRAWBERRY);
        System.out.println(crop.toString());

        crop = farm.harvestCrop(CropType.CORN);
        System.out.println(crop.toString());
    }

    public static void main(String[] args)
    {
        // Harvest crops from Smith Family Farm
        Main main = new Main(new SmithFarm());
        main.harvestCrops();

        // Harvest crops from Johnson Farm
        main = new Main(new JohnsonFarm());
        main.harvestCrops();
    }
}
