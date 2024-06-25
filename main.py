from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
url = ("https://tt.ptw-i.com/")
user = "mohd.hussain"
password = "June@2023"
driver = webdriver.Chrome()
driver.get(url)
driver.maximize_window()
time.sleep (2)
driver.find_element(By.XPATH, '//*[@id="UserName"]').send_keys(user)
time.sleep (2)
driver.find_element(By.XPATH,'//*[@id="txtPassword"]').send_keys(password)
time.sleep (2)
driver.find_element(By.XPATH,'//*[@id="btnLogin"]').click()
time.sleep (10)


driver.quit()
