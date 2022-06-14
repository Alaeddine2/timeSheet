package tn.esprit.spring.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;

import java.util.List;

public class IControllerEntrepriseImplTest {
    @Test(expected=NullPointerException.class)
    public void ajouterEntreprise() {
//        Entreprise entreprise = new Entreprise("entreprise1", "entreprise1");
        IControllerEntrepriseImpl enterpriseController = new IControllerEntrepriseImpl();
        int result = enterpriseController.ajouterEntreprise(new Entreprise("entreprise1", "entreprise1"));
        System.out.println(result);
    }
}
