from selenium import webdriver as wd
driver = wd.Chrome()

driver.get("https://www.facebook.com/")
driver.save_screenshot("C:\\Users\\Vino\\Desktop\\Screenshots\\Snap2.png")
driver.implicitly_wait(10)
co = driver.get_cookies()
print(len(co))
for cookie in co:
    print(cookie)
driver.delete_all_cookies()
co = driver.get_cookies()
print(len(co))