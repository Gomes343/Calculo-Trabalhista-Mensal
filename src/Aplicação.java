import javax.swing.JOptionPane;
 
public class Aplicação{
 
    public static void main(String[] args) {
         
        /*
        JOptionPane.showMessageDialog(null,"O Salário é: "+i +"\n"
        +"A aliquota do fgts é"+taxa+"\n"
        +"FGTS deste salário é: R$"+FGTS);
        JOptionPane.showMessageDialog(null,"A aliquota do fgts é " + taxa);
        JOptionPane.showMessageDialog(null,"FGTS deste salário é: R$"+FGTS);
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
        String nomeCompleto = nome + " " + sobreNome;
         */
        //int CLOSED_OPTION = JOptionPane.CLOSED_OPTION;
        
        JOptionPane.showMessageDialog(null, "aviso sobre procurar um contador \n explicando que se trata de um projeto sem fins lucrativos \n e com calculos com precisão mediana","AVISO",JOptionPane.INFORMATION_MESSAGE);
        
        double salario,hr_mensal,salario_liquido;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(" Informe o salário "));
        //hr_mensal = Float.parseFloat(JOptionPane.showInputDialog(" Informe as horas mensais "));
        
        
        //if (salario == 0)
        //    System.exit(0);
        DireitosTrabalhistas d = new DireitosTrabalhistas(salario);
        EncargosSociais e = new EncargosSociais(salario);
        
        salario_liquido = (salario - e.getVlr_INSS())- e.getVlr_IRRF();
        double total = salario_liquido + e.vlr_FGTS + e.vlr_INSS + e.vlr_IRRF + d.ferias + d.decimo + d.terco + d.FGTS_fer_decimo + d.INSS_fer_decimo + d.IRRF_fer_decimo;
        
        JOptionPane.showMessageDialog(null,"Salário Liquido: R$ "+salario_liquido+"\n"
                + "\n"
                + "FGTS: R$ "+e.vlr_FGTS+"\n"
        + "INSS: R$ "+e.vlr_INSS+"\n"
                + "IRRF: R$ "+e.vlr_IRRF+"\n"
                        + "\n"
                        + "1/12 avos de Férias: R$ "+d.ferias+"\n"
                                + "1/12 avos de Décimo Terceiro: R$ "+d.decimo+"\n"
                                        + "Terço Constitucional de Férias: R$ "+d.terco+"\n"
                                                + "FGTS s/ Férias e 13º: R$ "+d.FGTS_fer_decimo+"\n"
                                                        + "INSS s/ Férias e 13º: R$ "+d.INSS_fer_decimo+"\n"
                                                                + "iRRF s/ Férias e 13º: R$ "+d.IRRF_fer_decimo+"\n"
                                                                        + "\n"
                                                                        + "TOTAL: "+total);
        
        
        
        

        
    }
}