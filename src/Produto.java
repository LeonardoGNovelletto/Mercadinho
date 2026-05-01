import javax.swing.JOptionPane;

public class Produto {
	private String nome;
	private int qnt;
	private double custo;
	private double venda;
	
	public Produto(String nome, double custo, double venda, int quantidade) {
	    this.nome = nome;
	    this.custo = custo;
	    this.venda = venda;
	    this.qnt = quantidade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}
	public void MostraProduto() {
	    JOptionPane.showMessageDialog(null, this.getNome() + this.getCusto() + this.getVenda() + this.getQnt());
	}
	
}
