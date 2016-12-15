package com.naoko.inventory.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.naoko.inventory.entity.Toy;
/*******
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.health.HealthCheckRegistry;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.lifecycle.Managed;
import io.dropwizard.lifecycle.setup.LifecycleEnvironment;
import io.dropwizard.logging.BootstrapLogging;
import io.dropwizard.setup.Environment;
*******/

/*******
public class ToyDAOTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public Toy getToyById(int tid) {
		return hibernateTemplate.get(Toy.class, tid);
	} 
	@Test
	public List<Toy> testGetAllToys() {
		String hql = "FROM Toy as t ORDER BY t.tid";
		return (List<Toy>) hibernateTemplate.find(hql);
	}	
	@Test
	public boolean testAddToy(Toy toy) {
		hibernateTemplate.save(toy);
		return false;
	}
	@Test
	public void testUpdateToy(Toy toy) {
		Toy t = getToyById(toy.getTid());
		t.setName(toy.getName());
		t.setTid(toy.getTid());
		hibernateTemplate.update(t);
	}
	@Test
	public void testDeleteToy(int tid) {
		hibernateTemplate.delete(getToyById(tid));
	}
	@Test
	public boolean testToyExists(String name, int tid) {
		String hql = "FROM Toy as t WHERE t.name = ? and t.id = ?";
		List<Toy> toys = (List<Toy>) hibernateTemplate.find(hql, name, tid);
		return toys.size() > 0 ? true : false;
	}
}
*******/