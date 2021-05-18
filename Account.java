package prjPP;

public class Account {
	
	private String name; // variável de instância
		// método para definir o nome no objeto
	
	private int codigo;
	
	public Account(String name, int codigo) // o nome do construtor é nome da classe
	{
		this.name = name;
		
	}
	
	public void setName(String name)
	{
			this.name = name; // armazena o nome
	}
	// método para recuperar o nome do objeto
	public String getName()
	{
	return name; // retorna valor do nome para o chamador
	}
    
	
	public void setCodigo(int codigo)
	{
			this.codigo = codigo; // armazena o nome
	}
	// método para recuperar o codigo do objeto
	public int getCodigo()
	{
	
		return codigo; // retorna codigo
	
	}

}
