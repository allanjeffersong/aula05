public class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2, nota3, media;

    public Aluno() {

    }

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }

    public void calcularMedia(){
        media=(nota1+nota2+nota3)/3;

        System.out.println("sua média final é: " + media);
    }

}


