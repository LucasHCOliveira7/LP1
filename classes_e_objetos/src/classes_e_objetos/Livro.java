package classes_e_objetos;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

}

class Biblioteca {
	
	private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.livros.add(livro);
    }
    
    public void removerLivro(String titulo) {
        livros.removeIf(livro -> livro.getTitulo().equals(titulo));
    }
    
    public void mostrarLivros() {
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo() + ", " + livro.getAutor() + ", " + livro.getAnoPublicacao());
        }
    }

    public List<Livro> getLivros() {
        return this.livros;
    }
	
}
