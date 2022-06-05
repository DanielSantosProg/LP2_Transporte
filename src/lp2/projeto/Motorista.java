/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.projeto;

/**
 *
 * @author Meu computador
 */
public class Motorista extends Funcionario {
    
    private String categoria;
    private int kmsRodados;
    private boolean emViagem;

    public Motorista(String nome, int cargaH, float sal, String cpf, String cartTrabalho, String categoria){
        this.nome = nome;
        this.cargaHoraria = cargaH;
        this.salario = sal;
        this.cpf = cpf;
        this.carteiraTrabalho = cartTrabalho;
        this.categoria = categoria;
    }

    public void iniciarViagem(){
        this.emViagem = true; 
    }
    
     public void finalizarViagem(){
        this.emViagem = false; 
    }
    
    public void registrarKmRodadosMes(int kmRodados){
        this.kmsRodados = kmRodados;
    }

    public int getKmsRodados() {
        return kmsRodados;
    } 
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
    
  
    
    
}
