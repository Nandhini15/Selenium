from selenium import webdriver as wd
import time
driver = wd.Chrome()

driver.get('https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/')
driver.find_element_by_xpath("//button[@onclick='promptConfirm()']").click()
obj = driver.switch_to.alert
print(obj.text)
time.sleep(2)
obj.send_keys("YES")
obj.accept()
# obj.dismiss()
# driver.close()
#try to categorize popus under two category:java popup and web pop up
#if java pop up, u cant element inspect element
#if web pop up, u can handle obj inside inspect element