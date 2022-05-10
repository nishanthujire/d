// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nishu\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //WebDriver parent class ChromeDriver is child class
		driver.get("https://nishanthujire.github.io/profile/myprofile.html"); //opening URL
		System.out.println(driver.getTitle()); //printing title
		//driver.quit(); //closing browser 
