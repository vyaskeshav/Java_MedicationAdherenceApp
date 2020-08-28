/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmacistRole;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author keshav
 */
public class PharmacistOrganization extends Organization {

    public PharmacistOrganization() {
        super(Organization.Type.Pharmacist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
}
