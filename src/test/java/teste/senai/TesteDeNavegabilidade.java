package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDeNavegabilidade {
	
	ChromeDriver driver; // driver google chrome
	
	
	//pré-teste
	@Before
	public void preTeste() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lucas\\Desktop\\chromeDriver");
		this.driver = new ChromeDriver ();
		//maximizar o navegador
		driver.manage().window().maximeze();
		
		//ir até o site do senai
		driver.get("https://informatica.sp.senai.br/");
	}
	
	//teste
	@Test
	public void teste() {
		driver.findElement(By.id("Busca_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Buscal_btnBusca")).click();
		
	}
	
	//pós-teste
	@After
	public void PosTeste() {
		driver.quit();
		
	}

}
