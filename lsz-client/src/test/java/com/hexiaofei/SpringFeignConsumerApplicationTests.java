package com.hexiaofei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.test.context.junit4.SpringRunner;



import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
public class SpringFeignConsumerApplicationTests {

	@Test
	public void contextLoads() throws SQLException {
		SpelExpressionParser sep = new SpelExpressionParser();

		Expression e = sep.parseExpression("(1+2+3+4+5+6+7+8+9)*10");
		System.out.println("---------------->"+e.getValue());
	}

}
