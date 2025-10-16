package ExercicioDaniel;

public class ProcessadorRisco {
    // 1. Funções de Cálculo (Métodos Estáticos com Retorno)
    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * ((double) aliquotaBase / 100);
    }

    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * ((double) aliquotaProposta / 100);
    }

    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return Math.abs(impostoProposto - impostoAntigo);
    }

    // 2. Função de Diálogo (Métodos Não Estático Sem Retorno)
    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }

    // 3. Execução Principal (main)
    public static void main(String[] args) {
        double faturamento = 50000000.00;

        System.out.println("=== Análise de Tributação de Fintechs ===");
        System.out.println("Faturamento Base: " + faturamento);

        double impostoAntigo, impostoProposto, diferenca;

        System.out.println("-- Proposta A (9% -> 15%) --");
        impostoAntigo = calcularImpostoAntigo(faturamento, 9);
        impostoProposto = calcularImpostoProposto(faturamento, 15);
        diferenca = calcularDiferenca(impostoAntigo, impostoProposto);

        System.out.println("Imposto Antigo (9%): " + impostoAntigo);
        System.out.println("Imposto Proposto (15%): " + impostoProposto);
        System.out.println("Aumento de Imposto: " + diferenca);

        System.out.println("-- Proposta B (15% -> 20%) --");
        impostoAntigo = calcularImpostoAntigo(faturamento, 15);
        impostoProposto = calcularImpostoProposto(faturamento, 20);
        diferenca =  calcularDiferenca(impostoAntigo, impostoProposto);

        System.out.println("Imposto Antigo (9%): " + impostoAntigo);
        System.out.println("Imposto Proposto (15%): " + impostoProposto);
        System.out.println("Aumento de Imposto: " + diferenca);

        System.out.println("-- Análise de Diálogo --");

        SimuladorTributario simuladorTributario = new SimuladorTributario();
        simuladorTributario.statusDialogo(true);
        simuladorTributario.statusDialogo(false);
    }
}
