package entidades;

public class Aluno extends Pessoa {

    public String ra;

    // Construtores
    public Aluno(String nome, int telefone, Endereco endereco, String ra) {
        // Vamos chamar o contrutor da classe Pessoa que faz a atrinbui��o
        // de nome, telefone e endereco. A chamada de um construtor de uma
        // superclasse s� pode ser feita de dentro de um construtor e deve
        // ser a primeira linha do construtor.
        super(nome, telefone, endereco);

        // Agora podemos fazer a atribui��o do ra.
        this.ra = ra;
    }

    public Aluno(String nome, int telefone, Endereco endereco) {
        this(nome, telefone, endereco, "sem matrícula");
    }

    public Aluno(String nome, int telefone) {
        this(nome, telefone, new Endereco());
    }

    public Aluno(String nome) {
        this(nome, -1);
    }

    public Aluno() {
        this("João Ninguém");
    }

    // Sobrescritas dos m�todos herdados de Pessoa
    @Override
    public String toString() {
        // Vamos chamar o m�todo toString() da superclasse, o qual j� faz
        // grande parte do trabalho que precisamos fazer.
        String mensagem = super.toString();
        // Agora s� falta completar com o ra.
        mensagem += String.format(" e ra %s", ra);
        return mensagem;
    }

    @Override
    public boolean equals(Object objeto) {
        boolean igual = false;
        if (objeto instanceof Aluno) {
            Aluno a = (Aluno) objeto;
            // Vamos chamar o m�todo equals() da superclasse, que j� compara
            // os atributos nome, telefone e endereco. Note que aqui estamos
            // fazendo polimorfismo, pois estamos tratando um Aluno como sendo
            // uma Pessoa.
            if (super.equals(objeto) && ra.equals(a.ra)) {
                igual = true;
            }
        }
        return igual;
    }
}
