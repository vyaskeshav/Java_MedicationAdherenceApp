/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author keshav
 */
public class HighRiskCriteria {

    private int drugLabId;
    private int greaterRange;
    private int lesserRange;

    public int getDrugLabId() {
        return drugLabId;
    }

    public void setDrugLabId(int drugLabId) {
        this.drugLabId = drugLabId;
    }

    public int getGreaterRange() {
        return greaterRange;
    }

    public void setGreaterRange(int greaterRange) {
        this.greaterRange = greaterRange;
    }

    public int getLesserRange() {
        return lesserRange;
    }

    public void setLesserRange(int lesserRange) {
        this.lesserRange = lesserRange;
    }
}
