from selenium import webdriver as wd

driver = wd.Chrome()

driver.get('https://www.facebook.com/')
driver.find_element_by_css_selector("input[name='pass']").send_keys("hii")

#u_0_3 - here u_ is conatant, 0_3 is dynamic

#GMAIL
driver.get('https://support.google.com/')
print(driver.find_element_by_link_text("Sign in").is_displayed())
# driver.find_element_by_id("identifierId").send_keys("nandhini")
# driver.find_element_by_xpath("//span[text()='Next']").click()
# driver.find_element_by_xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input").send_keys("abc")
# # print(driver.find_element_by_xpath("//h1[@id='headingText']").text)
#clear() - to clear all the values in the editor or input(one inp)