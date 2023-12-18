/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Plot {

    private String cropType;

    private int cropYield;

    public Plot(String crop, int yield) {

        cropType = crop;
        cropYield = yield;
    }

    public String getCropType() {

        return cropType;

    }

    public int getCropYield() {

        return cropYield;

    }
    

}
