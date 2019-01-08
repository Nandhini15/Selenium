from selenium import webdriver as wd
driver = wd.Chrome()

driver.get("https://www.facebook.com/")
driver.save_screenshot("C:\Users\Vino\Desktop\Screenshots\python1.png")
#wherever u go, it ll take respective screenshot
#there as various methods - .getScreenshot