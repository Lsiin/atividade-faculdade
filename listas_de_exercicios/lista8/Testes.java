package listas_de_exercicios.lista8;

public class Testes {

    static void header(String titulo) {
        System.out.println("\n========================================");
        System.out.println(" " + titulo);
        System.out.println("========================================");
    }

   
    static void questao1() {
        header("Q1 - Entrada no Parque Aquático");
        double[] alturas = {1.20, 1.40, 1.60};
        String[] nada = {"s", "n"};
        for (double a : alturas)
            for (String n : nada) {
                String r = (a >= 1.40 && n.equals("s")) ? "Entrada permitida no toboágua." : "Entrada não permitida.";
                System.out.println("Altura: " + a + " | Sabe nadar: " + n + " => " + r);
            }
    }

    
    static void questao2() {
        header("Q2 - Sistema de Delivery");
        double[] valores = {50.0, 80.0, 120.0};
        String[] premium = {"s", "n"};
        for (double v : valores)
            for (String p : premium) {
                String r = (v >= 80 || p.equals("s")) ? "Entrega grátis!" : "Entrega cobrada.";
                System.out.println("Pedido: R$" + v + " | Premium: " + p + " => " + r);
            }
    }

    
    static void questao3() {
        header("Q3 - Reserva de Hotel");
        int[] idades = {16, 18, 25};
        String[] doc = {"s", "n"};
        for (int i : idades)
            for (String d : doc) {
                String r = (i >= 18 && d.equals("s")) ? "Reserva realizada com sucesso." : "Reserva não permitida.";
                System.out.println("Idade: " + i + " | Documento: " + d + " => " + r);
            }
    }

  
    static void questao4() {
        header("Q4 - Academia");
        int[] idades = {14, 16, 20};
        String[] atestado = {"s", "n"};
        for (int i : idades)
            for (String a : atestado) {
                String r = (i >= 16 && a.equals("s")) ? "Matrícula realizada." : "Matrícula não permitida.";
                System.out.println("Idade: " + i + " | Atestado: " + a + " => " + r);
            }
    }


    static void questao5() {
        header("Q5 - Aplicativo de Música");
        String[] internet = {"s", "n"};
        String[] baixadas = {"s", "n"};
        for (String i : internet)
            for (String b : baixadas) {
                String r = (i.equals("s") || b.equals("s")) ? "Pode ouvir música." : "Não é possível ouvir música.";
                System.out.println("Internet: " + i + " | Baixadas: " + b + " => " + r);
            }
    }


    static void questao6() {
        header("Q6 - Drone");
        double[] vento = {20.0, 40.0, 60.0};
        double[] bateria = {30.0, 50.0, 80.0};
        for (double v : vento)
            for (double b : bateria) {
                String r = (v < 40 && b > 50) ? "Voo permitido." : "Voo não permitido.";
                System.out.println("Vento: " + v + "km/h | Bateria: " + b + "% => " + r);
            }
    }


    static void questao7() {
        header("Q7 - Plataforma de Streaming");
        int[] idades = {16, 18, 25};
        String[] infantil = {"s", "n"};
        for (int i : idades)
            for (String inf : infantil) {
                String r = (i >= 18 && !inf.equals("s")) ? "Acesso ao conteúdo adulto permitido." : "Acesso não permitido.";
                System.out.println("Idade: " + i + " | Perfil infantil: " + inf + " => " + r);
            }
    }

    static void questao8() {
        header("Q8 - Estacionamento");
        int[] horas = {3, 5, 7};
        String[] vip = {"s", "n"};
        for (int h : horas)
            for (String v : vip) {
                String r = (h > 5 || v.equals("s")) ? "Desconto aplicado." : "Sem desconto.";
                System.out.println("Horas: " + h + " | VIP: " + v + " => " + r);
            }
    }

    static void questao9() {
        header("Q9 - Jogo Online");
        int[] niveis = {5, 10, 15};
        int[] moedas = {200, 500, 800};
        for (int n : niveis)
            for (int m : moedas) {
                String r = (n >= 10 && m >= 500) ? "Item especial desbloqueado!" : "Não foi possível desbloquear o item.";
                System.out.println("Nível: " + n + " | Moedas: " + m + " => " + r);
            }
    }

  
    static void questao10() {
        header("Q10 - Sistema de Biblioteca");
        int[] atrasados = {0, 1, 3};
        String[] ativa = {"s", "n"};
        for (int a : atrasados)
            for (String m : ativa) {
                String r = (a == 0 && m.equals("s")) ? "Empréstimo permitido." : "Empréstimo não permitido.";
                System.out.println("Atrasados: " + a + " | Matrícula ativa: " + m + " => " + r);
            }
    }


    static void questao11() {
        header("Q11 - Aplicativo de Corrida");
        double[] saldo = {10.0, 20.0, 50.0};
        String[] cupom = {"s", "n"};
        for (double s : saldo)
            for (String c : cupom) {
                String r = (s >= 20 || c.equals("s")) ? "Corrida permitida." : "Corrida não permitida.";
                System.out.println("Saldo: R$" + s + " | Cupom: " + c + " => " + r);
            }
    }


    static void questao12() {
        header("Q12 - Entrada no Laboratório");
        String[] jaleco = {"s", "n"};
        String[] cracha = {"s", "n"};
        for (String j : jaleco)
            for (String c : cracha) {
                String r = (j.equals("s") && c.equals("s")) ? "Entrada permitida." : "Entrada não permitida.";
                System.out.println("Jaleco: " + j + " | Crachá: " + c + " => " + r);
            }
    }

    static void questao13() {
        header("Q13 - Compra Online");
        int[] idades = {16, 18, 25};
        String[] autorizacao = {"s", "n"};
        for (int i : idades)
            for (String a : autorizacao) {
                String r = (i >= 18 || a.equals("s")) ? "Compra permitida." : "Compra não permitida.";
                System.out.println("Idade: " + i + " | Autorização: " + a + " => " + r);
            }
    }

    static void questao14() {
        header("Q14 - Aplicativo de Banco");
        String[] senha = {"s", "n"};
        String[] facial = {"s", "n"};
        for (String s : senha)
            for (String f : facial) {
                String r = (s.equals("s") || f.equals("s")) ? "Acesso permitido." : "Acesso negado.";
                System.out.println("Senha correta: " + s + " | Facial válido: " + f + " => " + r);
            }
    }


    static void questao15() {
        header("Q15 - Sistema de Energia Solar");
        double[] sol = {50.0, 70.0, 90.0};
        double[] bateria = {60.0, 90.0, 95.0};
        for (double s : sol)
            for (double b : bateria) {
                String r = (s > 70 && b < 90) ? "Carregamento ativado." : "Carregamento não ativado.";
                System.out.println("Sol: " + s + "% | Bateria: " + b + "% => " + r);
            }
    }

    public static void main(String[] args) {
        questao1();
        questao2();
        questao3();
        questao4();
        questao5();
        questao6();
        questao7();
        questao8();
        questao9();
        questao10();
        questao11();
        questao12();
        questao13();
        questao14();
        questao15();
    }
}
