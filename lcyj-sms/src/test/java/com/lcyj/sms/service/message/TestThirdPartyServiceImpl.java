package com.lcyj.sms.service.message;

import com.lcyj.sms.common.EmailTypeEnum;
import com.lcyj.sms.service.BaseCoreTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestThirdPartyServiceImpl extends BaseCoreTest {

	static ISmsService smsService;
	static IEmailService emailService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		checkIfRemote(isRemoteTest);
		smsService = (ISmsService) ctx_consumer.getBean("smsService");
		emailService = (IEmailService) ctx_consumer.getBean("emailService");
	}

	//@Test
	public void testGetBalance() {
		double balance = smsService.getBalance();
		System.out.println("序列号的剩余金额为："+balance);
	}
	
	//@Test
	public void testSendSMS() {
		smsService.sendSMS("13621317361", "测试11111111111") ;
		//thirdPartyService.sendSMS("13522520472", "时间范围外包含验证码测试") ;
		//thirdPartyService.sendSMS("13522520472", "时间范围内包含验证码测试1111111111") ;
		/*thirdPartyService.sendSMS("15901151801", "时间范围内包含验证码测试") ;
		thirdPartyService.sendSMS("18600939029", "时间范围内包含验证码测试") ;*/
	}
	
	@Test
	public void testSendMail() throws Exception
	{
		emailService.sendMail(EmailTypeEnum.OTHER, "lvchunyujun@163.com", "注册账号", "注册验证码请妥善保管！");
	    Thread.sleep(1000*100);
	}

}
