/**
 * 
 */
package br.com.pesadao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Lucas
 *
 */
public class JPAUtil {

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pesadao");
		return factory.createEntityManager();

	}
}
