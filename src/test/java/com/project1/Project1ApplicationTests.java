package com.project1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project1.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Project1ApplicationTests {

	@Autowired
	private I18NService i18NService;
	
	@Test
	public void testMessageByLocalService() throws Exception{
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actuall and expected String don't match", expectedResult, actual);
	}

}
