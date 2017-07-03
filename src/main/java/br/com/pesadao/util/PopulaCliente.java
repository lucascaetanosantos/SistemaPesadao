package br.com.pesadao.util;

import java.util.Date;

import javax.persistence.EntityManager;

import br.com.pesadao.dao.JPAUtil;
import br.com.pesadao.model.Cliente;
import br.com.pesadao.model.Estado;
import br.com.pesadao.model.Sexo;

public class PopulaCliente {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Cliente cliente1 = 
				new Cliente("juz�", Sexo.MASCULINO, "18", "542.584.487-53", 
				"Rua das dores", "Guatup�", "Curitiba", Estado.AP,"(41) 3398-8275", 
				"(41) 9 9289-3829", "juze@gmail.com", new Date());
		
		Cliente cliente2 = 
				new Cliente("juzia", Sexo.FEMININO, "19", "434.093.933-15", 
				"Rua das dores", "Afonso pena", "Curitiba", Estado.BA,"(11) 3701-9094", 
				"(33) 99607-7568", "juzia@gmail.com", new Date());
		
		Cliente cliente3 = 
				new Cliente("matheus", Sexo.MASCULINO, "20", "008.547.297-20", 
				"Rua das dores", "INA", "Curitiba", Estado.DF,"(96) 2557-7280", 
				"(96) 99148-1083", "matheus@gmail.com", new Date());
		

		Cliente cliente4 = 
				new Cliente("maria", Sexo.FEMININO, "21", "874.640.143-16", 
				"Rua das dores", "Apolo", "Curitiba", Estado.PR,"(64) 3523-1475", 
				"(64) 98960-9964", "maria@gmail.com", new Date());
		
		Cliente cliente5 = 
				new Cliente("carlos", Sexo.MASCULINO, "22", "633.505.135-49", 
				"Rua das dores", "Avia�ao", "Curitiba", Estado.AC,"(38) 3581-9471", 
				"(38) 99561-5374", "carlos@gmail.com", new Date());

		Cliente cliente6 = 
				new Cliente("carla", Sexo.FEMININO, "30", "948.884.884-79", 
				"Rua das dores", "Itu", "Curitiba", Estado.CE,"(91) 2898-8365", 
				"(91) 98599-2740", "carla@gmail.com", new Date());
		

		Cliente cliente7 = 
				new Cliente("bruno", Sexo.MASCULINO, "16", "904.124.839-04", 
				"Rua das dores", "Capao", "Sao paulo", Estado.PE,"(47) 3580-4864", 
				"(47) 99463-8535", "bruno@gmail.com", new Date());
		
		Cliente cliente8 = 
				new Cliente("bruna", Sexo.FEMININO, "27", "460.425.418-46", 
				"Rua das dores", "Sao paulo", "Sao paulo", Estado.GO,"(35) 3858-4320", 
				"(35) 99722-3795", "bruna@gmail.com", new Date());

		Cliente cliente9 = 
				new Cliente("thiago", Sexo.MASCULINO, "35", "154.387.459-27", 
				"Rua das dores", "palmas", "Sao paulo", Estado.AL,"(61) 2884-6287", 
				"(61) 99236-6129", "thiago@gmail.com", new Date());
		

		Cliente cliente10 = 
				new Cliente("tarissa", Sexo.FEMININO, "22", "126.866.527-48", 
				"Rua das dores", "Osasco", "Sao paulo", Estado.SP,"(21) 2799-0349", 
				"(21) 98608-4929", "tarissa@gmail.com", new Date());

		
		em.persist(cliente1);
		em.persist(cliente2);
		em.persist(cliente3);
		em.persist(cliente4);
		em.persist(cliente5);
		em.persist(cliente6);
		em.persist(cliente7);
		em.persist(cliente8);
		em.persist(cliente9);
		em.persist(cliente10);
		
		em.getTransaction().commit();
		em.close();
	}
}
