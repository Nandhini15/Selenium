from selenium import webdriver as wd
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.by import By
driver = wd.Chrome()

driver.get("https://www.facebook.com/")
#implicit wait - globally makes all the objects to wait - all the items takes constant time to load, search etc
#doesnt target indiv objects
#target global objects
#explicit wait - if one obj takes 10sec to load, nd obj takes 6 sec n remaining obj takes 5 sec then use explicit wait
#to target a part obj, where it takes part time use explicit wait

WebDriverWait(driver, 10).until(expected_conditions.element_to_be_clickable(By.CLASS_NAME," "))

