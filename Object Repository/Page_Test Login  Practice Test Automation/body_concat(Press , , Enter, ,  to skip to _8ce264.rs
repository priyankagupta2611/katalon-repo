<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_concat(Press , , Enter, ,  to skip to _8ce264</name>
   <tag></tag>
   <elementGuidId>221f2c9a-95bc-4f8e-bae9-e8756a86e713</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#modern-store-modified</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body[@id='modern-store-modified']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;Press \&quot;Enter\&quot; to skip to content Home Practice Courses Blog Contact open menu Te&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>0546f8c1-1f89-4ea5-906e-21e5c58de545</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>modern-store-modified</value>
      <webElementGuid>2f50de2e-cf48-4c80-ac03-34955027ffff</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>wp-singular page-template page-template-simple_login page-template-simple_login-php page page-id-251 wp-custom-logo wp-theme-modern-store-modified full-post</value>
      <webElementGuid>dec7e31d-3a2d-4dfd-9f1f-d348b3fe6cce</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
			Press &quot;Enter&quot; to skip to content
	
		
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
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
    






{&quot;prefetch&quot;:[{&quot;source&quot;:&quot;document&quot;,&quot;where&quot;:{&quot;and&quot;:[{&quot;href_matches&quot;:&quot;\/*&quot;},{&quot;not&quot;:{&quot;href_matches&quot;:[&quot;\/wp-*.php&quot;,&quot;\/wp-admin\/*&quot;,&quot;\/wp-content\/uploads\/*&quot;,&quot;\/wp-content\/*&quot;,&quot;\/wp-content\/plugins\/*&quot;,&quot;\/wp-content\/themes\/modern-store-modified\/*&quot;,&quot;\/*\\?(.+)&quot;]}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;a[rel~=\&quot;nofollow\&quot;]&quot;}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;.no-prefetch, .no-prefetch a&quot;}}]},&quot;eagerness&quot;:&quot;conservative&quot;}]}


/* &lt;![CDATA[ */
var objectL10n = {&quot;openMenu&quot;:&quot;open menu&quot;,&quot;closeMenu&quot;:&quot;close menu&quot;,&quot;openChildMenu&quot;:&quot;open dropdown menu&quot;,&quot;closeChildMenu&quot;:&quot;close dropdown menu&quot;,&quot;autoRotateSlider&quot;:&quot;&quot;,&quot;sliderTime&quot;:&quot;&quot;};
/* ]]&gt; */



/* &lt;![CDATA[ */
_stq = window._stq || [];
_stq.push([ &quot;view&quot;, JSON.parse(&quot;{\&quot;v\&quot;:\&quot;ext\&quot;,\&quot;blog\&quot;:\&quot;167878209\&quot;,\&quot;post\&quot;:\&quot;251\&quot;,\&quot;tz\&quot;:\&quot;-4\&quot;,\&quot;srv\&quot;:\&quot;practicetestautomation.com\&quot;,\&quot;j\&quot;:\&quot;1:14.5\&quot;}&quot;) ]);
_stq.push([ &quot;clickTrackerInit&quot;, &quot;167878209&quot;, &quot;251&quot; ]);
/* ]]&gt; */








id(&quot;username&quot;)</value>
      <webElementGuid>45fed075-286a-4b6c-bc0a-a44f83003131</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;modern-store-modified&quot;)</value>
      <webElementGuid>67a275c0-5a50-41ad-bdd0-d4822b3b2353</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//body[@id='modern-store-modified']</value>
      <webElementGuid>bf599555-aa04-4fbc-be4d-10ddf6bee394</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>872cebd4-6e1c-413e-a89e-0a5231e4d25c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[@id = 'modern-store-modified' and (text() = concat(&quot;
			Press &quot;Enter&quot; to skip to content
	
		
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
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
    






{&quot;prefetch&quot;:[{&quot;source&quot;:&quot;document&quot;,&quot;where&quot;:{&quot;and&quot;:[{&quot;href_matches&quot;:&quot;\/*&quot;},{&quot;not&quot;:{&quot;href_matches&quot;:[&quot;\/wp-*.php&quot;,&quot;\/wp-admin\/*&quot;,&quot;\/wp-content\/uploads\/*&quot;,&quot;\/wp-content\/*&quot;,&quot;\/wp-content\/plugins\/*&quot;,&quot;\/wp-content\/themes\/modern-store-modified\/*&quot;,&quot;\/*\\?(.+)&quot;]}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;a[rel~=\&quot;nofollow\&quot;]&quot;}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;.no-prefetch, .no-prefetch a&quot;}}]},&quot;eagerness&quot;:&quot;conservative&quot;}]}


/* &lt;![CDATA[ */
var objectL10n = {&quot;openMenu&quot;:&quot;open menu&quot;,&quot;closeMenu&quot;:&quot;close menu&quot;,&quot;openChildMenu&quot;:&quot;open dropdown menu&quot;,&quot;closeChildMenu&quot;:&quot;close dropdown menu&quot;,&quot;autoRotateSlider&quot;:&quot;&quot;,&quot;sliderTime&quot;:&quot;&quot;};
/* ]]&gt; */



/* &lt;![CDATA[ */
_stq = window._stq || [];
_stq.push([ &quot;view&quot;, JSON.parse(&quot;{\&quot;v\&quot;:\&quot;ext\&quot;,\&quot;blog\&quot;:\&quot;167878209\&quot;,\&quot;post\&quot;:\&quot;251\&quot;,\&quot;tz\&quot;:\&quot;-4\&quot;,\&quot;srv\&quot;:\&quot;practicetestautomation.com\&quot;,\&quot;j\&quot;:\&quot;1:14.5\&quot;}&quot;) ]);
_stq.push([ &quot;clickTrackerInit&quot;, &quot;167878209&quot;, &quot;251&quot; ]);
/* ]]&gt; */








id(&quot;username&quot;)&quot;) or . = concat(&quot;
			Press &quot;Enter&quot; to skip to content
	
		
						
				
					
						
    
					
					
											
				
				
					
																	
									
				
					
						
							
								
									
								
										
												
														
														
												
										
								
														
							
							
								
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
    






{&quot;prefetch&quot;:[{&quot;source&quot;:&quot;document&quot;,&quot;where&quot;:{&quot;and&quot;:[{&quot;href_matches&quot;:&quot;\/*&quot;},{&quot;not&quot;:{&quot;href_matches&quot;:[&quot;\/wp-*.php&quot;,&quot;\/wp-admin\/*&quot;,&quot;\/wp-content\/uploads\/*&quot;,&quot;\/wp-content\/*&quot;,&quot;\/wp-content\/plugins\/*&quot;,&quot;\/wp-content\/themes\/modern-store-modified\/*&quot;,&quot;\/*\\?(.+)&quot;]}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;a[rel~=\&quot;nofollow\&quot;]&quot;}},{&quot;not&quot;:{&quot;selector_matches&quot;:&quot;.no-prefetch, .no-prefetch a&quot;}}]},&quot;eagerness&quot;:&quot;conservative&quot;}]}


/* &lt;![CDATA[ */
var objectL10n = {&quot;openMenu&quot;:&quot;open menu&quot;,&quot;closeMenu&quot;:&quot;close menu&quot;,&quot;openChildMenu&quot;:&quot;open dropdown menu&quot;,&quot;closeChildMenu&quot;:&quot;close dropdown menu&quot;,&quot;autoRotateSlider&quot;:&quot;&quot;,&quot;sliderTime&quot;:&quot;&quot;};
/* ]]&gt; */



/* &lt;![CDATA[ */
_stq = window._stq || [];
_stq.push([ &quot;view&quot;, JSON.parse(&quot;{\&quot;v\&quot;:\&quot;ext\&quot;,\&quot;blog\&quot;:\&quot;167878209\&quot;,\&quot;post\&quot;:\&quot;251\&quot;,\&quot;tz\&quot;:\&quot;-4\&quot;,\&quot;srv\&quot;:\&quot;practicetestautomation.com\&quot;,\&quot;j\&quot;:\&quot;1:14.5\&quot;}&quot;) ]);
_stq.push([ &quot;clickTrackerInit&quot;, &quot;167878209&quot;, &quot;251&quot; ]);
/* ]]&gt; */








id(&quot;username&quot;)&quot;))]</value>
      <webElementGuid>0387beb1-59ca-4702-9dda-f6f04e58ea52</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
