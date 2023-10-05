package classes_e_objetos;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
	
    String nome;
    int vida;
    int energia;
    int nivel;
    int experiencia;
    int ataque;
    int defesa;
    List<String> habilidades;

    public Personagem() {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defesa = defesa;
        this.experiencia = 0;
        this.habilidades = new ArrayList<>();
    }

    void atacar(Personagem alvo) {
    	int danoCausado = this.ataque - alvo.defesa;
        if (danoCausado > 0) {
            alvo.subtrairVida(danoCausado);
            energia -= 5;
            System.out.println(this.nome + " atacou " + alvo.nome + " causando " + danoCausado + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + alvo.nome + ", mas o ataque foi bloqueado pela defesa.");
        }
    }

    void defender() {
    	this.defesa += 10;
        System.out.println(this.nome + " entrou em modo de defesa.");
    }

    void usarHabilidade(int indice) {
        if (indice >= 0 && indice < habilidades.size()) {
            String habilidadeUsada = habilidades.get(indice);
            energia -= 10;
            System.out.println(this.nome + " usou a habilidade: " + habilidadeUsada);
        } else {
            System.out.println("Índice de habilidade inválido.");
        }
    }

    void ganharExperiencia(int quantidade) {
        this.experiencia += quantidade;
        System.out.println(this.nome + " ganhou " + quantidade + " pontos de experiência.");
        if (this.experiencia >= 100) {
            this.subirNivel();
        }
    }

    void subtrairVida(int quantidade) {
    	this.vida -= quantidade;
        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    void subirNivel() {
    	this.nivel++;
        this.experiencia = 0;
        System.out.println(this.nome + " subiu para o nível " + this.nivel + "!");
    }

    void recuperarVida(int quantidade) {
    	this.vida += quantidade;
    	experiencia -= 25;
        if (this.vida > 100) {
            this.vida = 100;
        }
        System.out.println(this.nome + " recuperou " + quantidade + " pontos de vida.");
    }

    void recuperarEnergia(int quantidade) {
    	this.energia += quantidade;
        if (this.energia > 100) {
            this.energia = 100;
        }
        System.out.println(this.nome + " recuperou " + quantidade + " pontos de energia.");
    }

    void Status() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Habilidades: " + habilidades);
    }

    void adicionarHabilidade(String habilidade) {
    	this.habilidades.add(habilidade);
        System.out.println(this.nome + " aprendeu a habilidade: " + habilidade);
    }

    void removerHabilidade(String habilidade) {
    	if (this.habilidades.remove(habilidade)) {
            System.out.println(this.nome + " esqueceu a habilidade: " + habilidade);
        } else {
            System.out.println(this.nome + " não possui a habilidade: " + habilidade);
        }
    }
}

