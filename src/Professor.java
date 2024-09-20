public class Professor extends Pessoa {
    private double salario, valorphora, htrabalhadas;

    public void setHtrabalhadas(double htrabalhadas) {
        this.htrabalhadas = htrabalhadas;
    }

    public double getHtrabalhadas() {
        return htrabalhadas;
    }

    public void setValorphora(double valorphora) {
        this.valorphora = valorphora;
    }

    public double getValorphora() {
        return valorphora;
    }

    public void calcularSalario(){
        salario = (valorphora*htrabalhadas) * 4;
        System.out.println("seu salário mensal é: " + salario +" R$");
    }
}
