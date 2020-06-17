import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPacientePage {

	private WebDriver driver;
	
public LoginPacientePage(WebDriver driver) {
	this.driver = driver;
}
public LoginPacientePage preencherEmail(String email) {
	driver.findElement(By.id("email")).sendKeys(email);
	return this;
	}
public LoginPacientePage preencherSenha(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;
	}
public void clicarBotaoEntrar() {
	driver.findElement(By.xpath("//div[1]/div/form/button")).click();
}

	public LoginPacientePage logarCom(String email, String password) {
		preencherEmail(email).preencherSenha(password).clicarBotaoEntrar();
		return this;
	}
	public void meuPerfilBotaoEntrar() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div/aside/div/div/a")).click();
	}
}
