package entidades;

public class Endereco {

    public String logradouro;
    public int numero;

    // Construtores
    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public Endereco(String logradouro) {
        this(logradouro, -1);
    }

    public Endereco() {
        this("Sem rua");
    }

    // Sobrescritas dos métodos herdados de Object
    @Override
    public String toString() {
        return String.format("%s, número %d", logradouro, numero);
    }

    @Override
    public boolean equals(Object objeto) {
        boolean iguais = false;
        if (objeto instanceof Endereco) {
            Endereco e = (Endereco) objeto;
            // Utilize equals() para comparar Strings
            if (e.logradouro.equals(logradouro)
                    && e.numero == numero) {
                iguais = true;
            }
        }
        return iguais;
    }
}

