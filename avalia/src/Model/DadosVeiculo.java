package Model;

import Control.VeiculoDAO;

public class DadosVeiculo {
    private String Marca_veic;
    private String Modelo_veic;
    private Double valor_veic;

    public String getMarca_veic() {
        return Marca_veic;
    }

    public void setMarca_veic(String marca_veic) {
        Marca_veic = marca_veic;
    }

    public String getModelo_veic() {
        return Modelo_veic;
    }

    public void setModelo_veic(String modelo_veic) {
        Modelo_veic = modelo_veic;
    }

    public Double getValor_veic() {
        return valor_veic;
    }

    public void setValor_veic(Double valor_veic) {
        this.valor_veic = valor_veic;
    }
    public double revenda_veic(){
        double vlfinal;
        vlfinal = getValor_veic() + (getValor_veic() * 0.1);
    }
    public static void enviarDados(DadosVeiculo dados){
        VeiculoDAO enviar = new VeiculoDAO();
        enviar.CadastrarVeiculo(dados);
    }
}
