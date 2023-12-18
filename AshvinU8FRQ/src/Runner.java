/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) {
        Plot[][] crops = new Plot[4][3];
        int counter = 1;
        String crop = "corn";
        for(int r = 0; r < crops.length; r++) {
            for(int c = 0; c < crops[r].length;c++) {
                crops[r][c] = new Plot(crop, counter);
                counter++;
            }
            crop = "cucumber";
        }
        for(Plot[] row: crops) {
            for(Plot actual: row) {
                System.out.println(actual.getCropYield());
      
            }
        }
        crops[0][2] = new Plot("cucumber", 1000);
        ExperimentalFarm demo = new ExperimentalFarm(crops);
        System.out.println(demo.getHighestYield("corn").getCropYield());
        for(Plot[] row: crops) {
            System.out.println("");
            for(Plot actual: row) {
                System.out.print(actual.getCropType() + ":");
                System.out.print(actual.getCropYield() + "\t");
      
            }
        }
        System.out.println("");
        System.out.println(demo.sameCrop(2));
    }
}
