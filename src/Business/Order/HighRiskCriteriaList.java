/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author keshav
 */
public class HighRiskCriteriaList {

    private ArrayList<HighRiskCriteria> highRiskCriteriaList;

    public HighRiskCriteriaList() {
        this.highRiskCriteriaList = new ArrayList<HighRiskCriteria>();
    }

    public ArrayList<HighRiskCriteria> getHighRiskCriteriaList() {
        return highRiskCriteriaList;
    }

    public void setHighRiskCriteriaList(ArrayList<HighRiskCriteria> highRiskCriteriaList) {
        this.highRiskCriteriaList = highRiskCriteriaList;
    }

    public HighRiskCriteria addPatient() {
        HighRiskCriteria highRiskCriteriaObject = new HighRiskCriteria();
        highRiskCriteriaList.add(highRiskCriteriaObject);
        return highRiskCriteriaObject;
    }

    public void deletePatient(HighRiskCriteria highRiskCriteria) {
        highRiskCriteriaList.remove(highRiskCriteria);
    }
}
