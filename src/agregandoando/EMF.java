/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregandoando;

import java.text.SimpleDateFormat;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class EMF {
        static final SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AgregandoAndoPU");
    
    
private EMF() {
}
public static EntityManagerFactory getEntityManagerFactory() {
return entityManagerFactory;
}
    
}
