package InterfaceComputador;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("ligacão");
	}
	@Override
	public void reiniciar() {
		System.out.println("reiniciando");
	}
	
	@Override
	public void desligar() {
		System.out.println("desligando");
	}
	
	@Override
	public void carregandoSistemas() {
		System.out.println("updatess");
	}

}
