package Control;

import Model.DadosVeiculo;
import BancoDados.ConexaoBanco;
import javax.swing.*;
import java.sql.PreparedStatement;

public class VeiculoDAO {
    private Connection conectar;

    public VeiculoDAO(){

        conectar = new ConexaoBanco().getConnection();
    }

    public void CadastrarVeiculo(DadosVeiculo dados){
        try{
            String sql = "INSERT INTO cliente (marca_veic,modelo_veic,valor_veic,revenda_veic) VALUES"
                    + "(?,?,?,?)";
            PreparedStatement inserir = conectar.prepareStatement(sql);

            inserir.setString(1, dados.getMarca_veic());
            inserir.setString(2, dados.getModelo_veic());
            inserir.setDouble(3, dados.getValor_veic());
            inserir.setDouble(4, dados.revenda_veic());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null,"Cadastro com exito");

        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null,"Erro no cadastro" + erro);
        }
    }
}
