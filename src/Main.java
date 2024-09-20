import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno("joão", 12345);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());

        int repetir;
        do {
            System.out.println("Digite 1 para professor e 2 para aluno");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Digite quanto voce ganha por hora: ");
                    p.setValorphora(sc.nextDouble());

                    System.out.println("Digite quantas horas você trabalha por semana: ");
                    p.setHtrabalhadas(sc.nextDouble());

                    p.calcularSalario();
                    break;

                case 2:
                    System.out.println("Vamos calcular sua média! Primeiro digite sua matrícula:");
                    a.setMatricula(sc.nextInt());
                    System.out.println("Sua matrícula é: " + a.getMatricula());

                    System.out.println("Agora digite sua primeira nota: ");
                    a.setNota1(sc.nextDouble());

                    System.out.println("agora digite sua segunda nota: ");
                    a.setNota2(sc.nextDouble());

                    System.out.println("por fim, digite sua terceira nota: ");
                    a.setNota3(sc.nextDouble());

                    a.calcularMedia();
                    break;
            }
            System.out.println("para repetir digite 0 ");
            repetir = sc.nextInt();

        } while (repetir==0);
    }
}