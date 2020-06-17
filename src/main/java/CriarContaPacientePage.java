import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CriarContaPacientePage {
	private WebDriver driver;
	public Object preencherTelefone;
	
	public CriarContaPacientePage(WebDriver driver) {
		this.driver = driver;
	}
	public CriarContaPacientePage preencherNome(String nome) {
		driver.findElement(By.id("name")).sendKeys(nome);
		return this;
		}
	public CriarContaPacientePage preencherRg(String rg) {
		driver.findElement(By.id("rg")).sendKeys(rg);
		return this;
		}
	
	public CriarContaPacientePage preencherEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public CriarContaPacientePage preencherSenha(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
		}
	public CriarContaPacientePage preencherDataNascimento(String dataNascimento) {
		driver.findElement(By.name("date_of_birth")).sendKeys(dataNascimento);
		return this;
		}
	public CriarContaPacientePage preencherNomeResponsável(String nomeResponsavel) {
		driver.findElement(By.id("name_of_responsible")).sendKeys(nomeResponsavel);
		return this;
		}
	public CriarContaPacientePage preencherCpfResponsável(String CpfResponsavel) {
		driver.findElement(By.id("cpf_of_responsible")).sendKeys(CpfResponsavel);
		return this;
		}
		public CriarContaPacientePage preencherCpf(String cpf) {
		driver.findElement(By.name("cpf")).sendKeys(cpf);
		return this;
		}
	public CriarContaPacientePage preencherTelefone(String telefone) {
		driver.findElement(By.name("telephone")).sendKeys(telefone);
		return this;
		}
	public CriarContaPacientePage preencherCelular(String celular) {
		driver.findElement(By.id("cellphone")).sendKeys(celular);
		return this;
		}
	public CriarContaPacientePage preencherCep(String cep) {
		driver.findElement(By.id("zip_code")).sendKeys(cep);
		return this;
		}
	public CriarContaPacientePage preencherComplemento(String complemento) {
		driver.findElement(By.id("complement")).sendKeys(complemento);
		return this;
		}
	public CriarContaPacientePage preencherRua(String rua) {
		driver.findElement(By.name("street")).sendKeys(rua);
		return this;
			}
	public CriarContaPacientePage preencherNumero(String numero) {
		driver.findElement(By.name("number")).sendKeys(numero);
		return this;
			}
	public CriarContaPacientePage preencherBairro(String bairro) {
		driver.findElement(By.id("neighborhood")).sendKeys(bairro);
		return this;
			}
	public CriarContaPacientePage preencherEstado(String estado) {
		driver.findElement(By.id("state")).sendKeys(estado);
		return this;
			}
	public CriarContaPacientePage preencherCidade(String cidade) {
		driver.findElement(By.id("city")).sendKeys(cidade);
		return this;
			}
	public void clicarTelefone() {
		driver.findElement(By.name("telephone")).click();
			}
	public void clicarCelular() {
		driver.findElement(By.id("cellphone")).click();
			}
	public void clicarCep() {
		driver.findElement(By.id("zip_code")).click();
			}
	public void clicarCriarContaCadastro() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/button")).click();
			}
	public void clicarJaTenhoLogin() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/form/a")).click();
			}
}
