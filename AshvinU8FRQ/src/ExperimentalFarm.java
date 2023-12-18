/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class ExperimentalFarm {

    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p) {

        farmPlots = p;
    }

    /**
     * Returns the plot with the highest yield for a given crop type, as
     * described in part (a).
     */
    public Plot getHighestYield(String c) {
        int highest = -1;
        Plot highestPlot = null;
        for(int i = 0; i < farmPlots.length; i++) {
            for(int j = 0; j < farmPlots[i].length; j++) {
                Plot current = farmPlots[i][j];
                if(current.getCropType().equals(c)) {
                    if (current.getCropYield() > highest) {
                        highest = current.getCropYield();
                        highestPlot = current;
                    }
                }
            }
        }
        return highestPlot;
    }

    /**
     * Returns true if all plots in a given column in the two-dimensional array
     * farmPlots
     *
     * contain the same type of crop, or false otherwise, as described in part
     * (b).
     *
     */
    public boolean sameCrop(int col) {
        for(int r = 0; r < farmPlots[0].length; r++) {
            if(farmPlots[0][col].getCropType() != farmPlots [r][col].getCropType()) {
                return false;
            }
        }
        return true;
        /* to be implemented in part (b) */
    }

}
