package login.test;
import static org.junit.Assert.*;

import org.junit.*;
import com.amzi.dao.LoginDao;
import com.amzi.dao.LoginDaoBean;

public class loginTest {

	@Test
	public void testLogin() {
		LoginDao loginDao = new LoginDaoMockObject();
		assertTrue(loginDao.validate("Admin", "passw0rd"));
		assertFalse(loginDao.validate("Admin", "wrong_password"));
	}
}
