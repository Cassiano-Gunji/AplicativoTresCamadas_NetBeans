package controle;

import java.awt.Component;
import javax.swing.JOptionPane;
import entidades.Pessoa;

public class CadastroPessoa implements ICadastroPessoa {

    @Override
    public void cadastraPessoa(Component pai, Pessoa pessoa) {
        // Nester método deve ser implementada a lógica de inserção dos dados
        // de uma nova pessoa no banco de dados. Neste exemplo, vamos apenas
        // simular tal ação com uma caixa de mensagem. Note que, desta vez,
        // podemos dizer qual é o componente pai da caixa de mensagens:

        JOptionPane.showMessageDialog(pai, String.format("Cadastro de %s realiz"
                + "ado com sucesso", pessoa));

    }

}

