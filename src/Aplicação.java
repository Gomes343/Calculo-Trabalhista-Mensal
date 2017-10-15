import java.text.DecimalFormat;
import javax.swing.JOptionPane;
 
public class Aplicação{
 
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        JOptionPane.showMessageDialog(null, "Sistema criado para teste \n procure um profissional para um cálculo preciso e confiavel.","AVISO",JOptionPane.INFORMATION_MESSAGE);
        
        double salario,hr_mensal,salario_liquido;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(" Informe o salário "));
        //hr_mensal = Float.parseFloat(JOptionPane.showInputDialog(" Informe as horas mensais "));
        
        
        //if (salario == 0)
        //    System.exit(0);
        DireitosTrabalhistas d = new DireitosTrabalhistas(salario);
        EncargosSociais e = new EncargosSociais(salario);
        
        salario_liquido = (salario - e.getVlr_INSS())- e.getVlr_IRRF();
        double total = salario_liquido + e.vlr_FGTS + e.vlr_INSS + e.vlr_IRRF + d.ferias + d.decimo + d.terco + d.FGTS_fer_decimo + d.INSS_fer_decimo + d.IRRF_fer_decimo;
        
        
        JOptionPane.showMessageDialog(null,
                  "Salário Bruto: R$ "+df.format(salario)+"\n"
                + "\n"
                + "Valores a serem pagos: "+"\n"
                + "Salário Liquido: R$ "+df.format(salario_liquido)+"\n"
                + "\n"
                + "FGTS: R$ "+df.format(e.vlr_FGTS)+"\n"
                + "INSS: R$ "+df.format(e.vlr_INSS)+"\n"
                + "IRRF: R$ "+df.format(e.vlr_IRRF)+"\n"
                + "\n"
                + "1/12 avos de Férias: R$ "+df.format(d.ferias)+ "\n"
                + "1/12 avos de Décimo Terceiro: R$ "+df.format(d.decimo)+ "\n"
                + "Terço Constitucional de Férias: R$ "+df.format(d.terco)+ "\n"
                + "FGTS s/ Férias e 13º: R$ "+df.format(d.FGTS_fer_decimo)+ "\n"
                + "INSS s/ Férias e 13º: R$ "+df.format(d.INSS_fer_decimo)+ "\n"
                + "iRRF s/ Férias e 13º: R$ "+df.format(d.IRRF_fer_decimo)+ "\n"
                + "\n"
                + "TOTAL: "+df.format(total));
        
        
        
        

        
    }
}