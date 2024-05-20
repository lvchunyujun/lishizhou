package com.lcyj.sms.service;

import com.lcyj.sms.common.CommonDef;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;


@Ignore
public class BaseCoreTest
{

	protected static ApplicationContext ctx_consumer = null;

	protected static final boolean isRemoteTest = true;
	
	protected static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 定义用户ID
	 */
	protected static int adminID = 1;
	protected static int hexiaofeiID = 10462;
	protected static int lishizhou_001 = 10463;
	
	
	/**
	 * 实名
	 */
	protected static String currentRealName = "何晓飞";
	

	
	public static ApplicationContext checkIfRemote(boolean isRemoteTest)
	{
		if (isRemoteTest){
			System.out.println("现在是远程测试");
			if(ctx_consumer==null){
			 ctx_consumer = new ClassPathXmlApplicationContext(CommonDef.ApplicationContext_Spring_RMI_Client_Path);
			}
		}else{
			System.out.println("现在是本地测试");
			if(ctx_consumer==null){
			 ctx_consumer = new ClassPathXmlApplicationContext(CommonDef.ApplicationContextPath);
			}
		}
		return ctx_consumer;
	}

//	@Test
//	public void test()
//	{
//
//	}
	

}
