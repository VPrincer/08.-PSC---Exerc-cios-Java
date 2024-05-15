import classes.Empregado;

public class principal{
    public static void main(String[] args) {

    Empregado empregado = new Empregado();

    String nome = empregado.Promover();
    System.out.println("você " + empregado.Promover() + " foi promovido!");


    double valorDecimal = empregado.valorDecimal();
    System.out.println("o valor do seu aumento é " + empregado.valorDecimal() + "R$. isto se dá ao aumento de 25% do salario atual.");

    String aposentadoria = empregado.demitir();
    System.out.println("o senhor " + empregado.demitir() + " foi demitido. O empregador esta quebrando o seu contrato com a empresa e ao empregador lhe será aplicado a multa de " + empregado.demitir2() + " R$. multa essa pela resisão por parte do empregador!" );
    
  }

}