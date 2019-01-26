package com.glqdlt.booktstroe.webappserver;

import com.glqdlt.booktstroe.webappserver.repository.auth.RoleJpaRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppServerApplicationTests {

	@Autowired
	private RoleJpaRepo roleJpaRepo;

	@Test
	public void contextLoads() {

	}

	@Test
	public void repositoryTest() throws Exception {
		roleJpaRepo.findAll();
	}
}

