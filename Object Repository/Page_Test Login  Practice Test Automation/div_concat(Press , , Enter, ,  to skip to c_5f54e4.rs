<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_concat(Press , , Enter, ,  to skip to c_5f54e4</name>
   <tag></tag>
   <elementGuidId>212e6c0f-4656-42f6-b511-f1103f5dd82d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#max-width</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='max-width']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;Home Practice Courses Blog Contact open menu Test login This is a simple Login p&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>ca624705-8b9a-43d8-9cbf-39b931055cc4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>max-width</value>
      <webElementGuid>7a397435-58ab-46a1-b740-440e0d22cd65</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>max-width</value>
      <webElementGuid>05d341a1-d4b7-462c-855e-1a27e20ef05e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
    Home
Practice
Courses
Blog
Contact

							
						
					
					
						
							open menu
							
								
										
												
														
																
																		
																				
																				
																				
																		
																
														
												
										
								
												
					
				
			
									
				

	Test login
	
		This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.
		Use next credentials to execute Login:
		Username: student
		Password: Password123
		
	
	
		
			Username
			
		
		
			Password
			
		
		Submit
	
	Your username is invalid!
	
		Test case 1: Positive LogIn test
		
			Open page
			Type username student into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify new page URL contains practicetestautomation.com/logged-in-successfully/
			
			Verify new page contains expected text ('Congratulations' or 'successfully logged in')
			Verify button Log out is displayed on the new page
		
		
		Test case 2: Negative username test
		
			Open page
			Type username incorrectUser into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your username is invalid!
		
		
		Test case 3: Negative password test
		
			Open page
			Type username student into Username field
			Type password incorrectPassword into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your password is invalid!
		
	
	
		document.addEventListener(&quot;DOMContentLoaded&quot;, function () {
			const username = document.querySelector(&quot;#username&quot;),
				password = document.querySelector(&quot;#password&quot;),
				submit = document.querySelector(&quot;#submit&quot;),
				error = document.querySelector(&quot;#error&quot;);

			submit.addEventListener(&quot;click&quot;, function () {
				let us_name = username.value,
					us_pass = password.value;

				if(us_name == &quot;student&quot; &amp;&amp; us_pass == &quot;Password123&quot;){
					window.location.href = &quot;https://practicetestautomation.com/logged-in-successfully&quot;;
				}else if(us_name == &quot;student&quot; &amp;&amp; us_pass != &quot;Password123&quot;){
					error.innerHTML = &quot;Your password is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}else{
					error.innerHTML = &quot;Your username is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}
			})
		})
	

 


        
        
            © Copyright 2020  Practice Test Automation.  All rights reserved  |  Privacy Policy        
    

</value>
      <webElementGuid>74ebc416-af4c-4fdc-9d92-9388db1c1e41</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;max-width&quot;)</value>
      <webElementGuid>db2b91da-17c5-4d5b-8d1e-c3a9f3191e27</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='max-width']</value>
      <webElementGuid>de559829-552f-4b4b-a21e-87bfc6a32429</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='overflow-container']/div</value>
      <webElementGuid>2813d2e1-edab-4b4d-8d34-2c2a3a2c93f8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div</value>
      <webElementGuid>a9fcb0db-8220-400d-9d34-c8b7e3217115</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'max-width' and (text() = concat(&quot;
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
    Home
Practice
Courses
Blog
Contact

							
						
					
					
						
							open menu
							
								
										
												
														
																
																		
																				
																				
																				
																		
																
														
												
										
								
												
					
				
			
									
				

	Test login
	
		This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.
		Use next credentials to execute Login:
		Username: student
		Password: Password123
		
	
	
		
			Username
			
		
		
			Password
			
		
		Submit
	
	Your username is invalid!
	
		Test case 1: Positive LogIn test
		
			Open page
			Type username student into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify new page URL contains practicetestautomation.com/logged-in-successfully/
			
			Verify new page contains expected text (&quot; , &quot;'&quot; , &quot;Congratulations&quot; , &quot;'&quot; , &quot; or &quot; , &quot;'&quot; , &quot;successfully logged in&quot; , &quot;'&quot; , &quot;)
			Verify button Log out is displayed on the new page
		
		
		Test case 2: Negative username test
		
			Open page
			Type username incorrectUser into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your username is invalid!
		
		
		Test case 3: Negative password test
		
			Open page
			Type username student into Username field
			Type password incorrectPassword into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your password is invalid!
		
	
	
		document.addEventListener(&quot;DOMContentLoaded&quot;, function () {
			const username = document.querySelector(&quot;#username&quot;),
				password = document.querySelector(&quot;#password&quot;),
				submit = document.querySelector(&quot;#submit&quot;),
				error = document.querySelector(&quot;#error&quot;);

			submit.addEventListener(&quot;click&quot;, function () {
				let us_name = username.value,
					us_pass = password.value;

				if(us_name == &quot;student&quot; &amp;&amp; us_pass == &quot;Password123&quot;){
					window.location.href = &quot;https://practicetestautomation.com/logged-in-successfully&quot;;
				}else if(us_name == &quot;student&quot; &amp;&amp; us_pass != &quot;Password123&quot;){
					error.innerHTML = &quot;Your password is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}else{
					error.innerHTML = &quot;Your username is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}
			})
		})
	

 


        
        
            © Copyright 2020  Practice Test Automation.  All rights reserved  |  Privacy Policy        
    

&quot;) or . = concat(&quot;
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
    Home
Practice
Courses
Blog
Contact

							
						
					
					
						
							open menu
							
								
										
												
														
																
																		
																				
																				
																				
																		
																
														
												
										
								
												
					
				
			
									
				

	Test login
	
		This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.
		Use next credentials to execute Login:
		Username: student
		Password: Password123
		
	
	
		
			Username
			
		
		
			Password
			
		
		Submit
	
	Your username is invalid!
	
		Test case 1: Positive LogIn test
		
			Open page
			Type username student into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify new page URL contains practicetestautomation.com/logged-in-successfully/
			
			Verify new page contains expected text (&quot; , &quot;'&quot; , &quot;Congratulations&quot; , &quot;'&quot; , &quot; or &quot; , &quot;'&quot; , &quot;successfully logged in&quot; , &quot;'&quot; , &quot;)
			Verify button Log out is displayed on the new page
		
		
		Test case 2: Negative username test
		
			Open page
			Type username incorrectUser into Username field
			Type password Password123 into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your username is invalid!
		
		
		Test case 3: Negative password test
		
			Open page
			Type username student into Username field
			Type password incorrectPassword into Password field
			Push Submit button
			Verify error message is displayed
			Verify error message text is Your password is invalid!
		
	
	
		document.addEventListener(&quot;DOMContentLoaded&quot;, function () {
			const username = document.querySelector(&quot;#username&quot;),
				password = document.querySelector(&quot;#password&quot;),
				submit = document.querySelector(&quot;#submit&quot;),
				error = document.querySelector(&quot;#error&quot;);

			submit.addEventListener(&quot;click&quot;, function () {
				let us_name = username.value,
					us_pass = password.value;

				if(us_name == &quot;student&quot; &amp;&amp; us_pass == &quot;Password123&quot;){
					window.location.href = &quot;https://practicetestautomation.com/logged-in-successfully&quot;;
				}else if(us_name == &quot;student&quot; &amp;&amp; us_pass != &quot;Password123&quot;){
					error.innerHTML = &quot;Your password is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}else{
					error.innerHTML = &quot;Your username is invalid!&quot;;
					error.classList.add(&quot;show&quot;);
					username.value = &quot;&quot;;
					password.value = &quot;&quot;;
				}
			})
		})
	

 


        
        
            © Copyright 2020  Practice Test Automation.  All rights reserved  |  Privacy Policy        
    

&quot;))]</value>
      <webElementGuid>159356c5-3119-47d1-96d4-43adba7e2e0f</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
