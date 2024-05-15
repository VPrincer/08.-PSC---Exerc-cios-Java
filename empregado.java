package classes;
import java.util.Scanner;

public class Empregado{
        Scanner sc = new Scanner(System.in);
  
        private String nome = "Vinicius"; 
        private String nome2 = "Ricardo";
        private int idade = 21; 
        private double salario = 1300;
        private Double porcentagem = 25.0; 
        private Double valorDecimal = salario / porcentagem;
        private double resisaoContrato = 40.0;
        private double multa = salario / resisaoContrato; 
        private int novaIdade = idade + 1;       
       
       
        public String Promover(){
                return nome;
        }

        public void setPromover(String nome){
         this.nome = nome;
         for (int idade = 21; idade < 18; idade++ ){
         }
        }

        public Double valorDecimal(){
                return valorDecimal;
        }

        public void setAumentoSalario(Double porcentagem){
        this.salario = valorDecimal;
        }

        public String demitir(){
                return nome2;
        }

        public Double demitir2(){
                return multa;
        }

        public void setDemitir(double resisaoContrato){
        this.salario = multa;

        }


}