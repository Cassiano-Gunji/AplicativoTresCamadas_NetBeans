package entidades;

public class Pessoa {

    public String nome;
    public int telefone;
    public Endereco endereco;

    // Construtores
    public Pessoa(String nome, int telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, int telefone) {
        this(nome, telefone, new Endereco());
    }

    public Pessoa(String nome) {
        this(nome, -1);
    }

    public Pessoa() {
        this("João Ninguém");
    }

    // Sobrescritas dos métodos herdados de Object
    @Override
    public String toString() {
        return String.format("%s tem o telefone %d, reside em %s",
                nome, telefone, endereco);
    }

    @Override
    public boolean equals(Object objeto) {
        boolean igual = false;
        if (objeto instanceof Pessoa) {
            Pessoa p = (Pessoa) objeto;
            if (p.nome.equals(nome) && p.telefone == telefone
                    && p.endereco.equals(endereco)) {
                igual = true;
            }
        }
        return igual;
    }
}

