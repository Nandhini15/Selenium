from selenium import webdriver as wd
driver = wd.Chrome()

driver.get("https://www.ebay.com/")
#To get the no of links present in the web page
total_links = driver.find_elements_by_tag_name("a")
print(len(total_links))
#len() - func tat takes var as ip and returns the count as output
#To get only the count of links in the footer section and the names
footer = driver.find_element_by_xpath("//footer[@id='glbfooter']")
footer_links = footer.find_elements_by_tag_name("a")
print(len(footer_links))
#To get the name of each links
for obj in footer_links:
    print(obj.text)