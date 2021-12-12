public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMiles = 20;
        int totalBonusMiles = cost / bonusMiles;
        return totalBonusMiles;
    }
}
