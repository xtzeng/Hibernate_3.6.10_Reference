import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import com.trail.neutral.po.Man;
import com.trail.neutral.po.Woman;


public class BeanUtilsTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	
	
	@Test
	public void testCopyProperties() {
		
		Man man = new Man();
//		man.setAge(22);
//		man.setName("Peter");
//		
//		System.out.println(man.toString());
		
		Woman woman = new Woman();
		woman.setAge(88);
		woman.setName("Lili");
		woman.setAddress("Amoy");
		
		
		BeanUtils.copyProperties(woman, man);
		
		
		System.out.println(man);
		
		
	}

}
