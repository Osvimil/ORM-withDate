/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregandoando;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author oswaldosaldivar
 */
public class CtrlPrueba {
    private static final EntityManagerFactory emf = EMF.getEntityManagerFactory();
/**
* Lista todos los conocidos registrados.
* @return Una lista con todos los conocidos registrados.
*/
public List<Prueba> lista() {
final EntityManager em = getEntityManager();
List<Prueba> lista;
try {
    lista = em.createQuery("SELECT c FROM Prueba c ORDER BY c.nombre",
Prueba.class).getResultList();
} finally {
em.close();
}
return lista;   
}
public Prueba busca(Long id) {
EntityManager em = getEntityManager();
try {
return em.find(Prueba.class, id);
} finally {
em.close();
}
}

public Prueba agrega(Prueba modelo) {
final EntityManager em = getEntityManager();
try {
final EntityTransaction tx = em.getTransaction();
tx.begin();
em.persist(modelo);
tx.commit();
return modelo;
} finally {
em.close();
}
}

public Prueba modifica(Prueba modelo) {
final EntityManager em = getEntityManager();
try {
final EntityTransaction tx = em.getTransaction();
tx.begin();
modelo = em.merge(modelo);
tx.commit();
return modelo;
} finally {
    em.close();
}   
}
public void elimina(Long id) {
final EntityManager em = getEntityManager();
try {
final EntityTransaction tx = em.getTransaction();
tx.begin();
// Busca un conocido usando su llave primaria.
final Prueba modelo = em.find(Prueba.class, id);
if (modelo != null) {
/* Si la referencia no es nula, significa que el modelo se encontró la
* referencia no es nula y se elimina. */
em.remove(modelo);
}
tx.commit();
} finally {
em.close();
}
}
private static EntityManager getEntityManager() {
return emf.createEntityManager();
}

}
    


    
