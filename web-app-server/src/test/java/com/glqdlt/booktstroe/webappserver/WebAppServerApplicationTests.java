package com.glqdlt.booktstroe.webappserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@ActiveProfiles("prod")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppServerApplicationTests {

	@Autowired
	private EntityManager entityManager;

	@Test
	public void contextLoads() {
	}

}

