public class BonusMilesService {
    public int calculate (int cost) {
        int bonusMileCost = 20;
        int miles = cost / bonusMileCost;
        return miles;
    }
}