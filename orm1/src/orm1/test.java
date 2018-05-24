package orm1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class test {
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm1");
			EntityManager s1=entityManagerFactory.createEntityManager();
			EntityTransaction s3=s1.getTransaction();
			Model model=new Model("samet","eray",2256);
			s3.begin();
			s1.persist(model);
			model.no=model.no+5;	
			s3.commit();
			Model s4=s1.find(Model.class,2);
			System.out.println(s4.toString());
			s3.begin();
			s3.commit();
			TypedQuery<Model> query = s1.createQuery("Select e from Model e", Model.class);
			for(Model s8:query.getResultList())
				System.out.println(s8);

		
		}
}
