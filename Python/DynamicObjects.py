from selenium import webdriver as wd
driver = wd.Chrome()

driver.get("https://www.facebook.com/")
#//input[contains(@id, 'u_0_')] - by xpath - for dynamic elements
#input[id*='u_0_'] by css for dynamic locators - if a particular value in the attribute value keeps changing, then use this
#can even be [id*='u_0_']
#all this demonstrates working of regular expressions vd selenium
#ex
driver.find_element_by_css_selector("[value*='Log']").click()
driver.find_element_by_xpath("//input[contains(@value, 'Log')]").click()
co = driver.get_cookies()
print(len(co))
for cookie in co:
    print(cookie)
driver.delete_all_cookies()
co = driver.get_cookies()
print(len(co))