public final class EncargosSociais{
    
    double aliquotaINSS;
    double vlr_INSS;
    double vlr_FGTS;
    double aliquotaIRRF;
    double deduzir;
    double vlr_IRRF;
    

    public EncargosSociais(double salario){
        this.calcularINSS(salario);
        this.calcularFGTS(salario);
        this.calcularIRRF(salario);
    }
    public void calcularINSS(double salario){
       if (salario <= 1659.38){
          aliquotaINSS = 0.08;
       }
       if ( (salario >= 1659.39) & (salario <= 2765.66) ){
          aliquotaINSS = 0.09; 
       }
       if ( (salario >= 2765.67) ){
          aliquotaINSS = 0.11;
       }
       vlr_INSS = salario * aliquotaINSS;
    }
    
    
    public void calcularFGTS(double salario){
       vlr_FGTS = salario * 0.08;
    }
    
    
    public void calcularIRRF(double salario){
       if (salario <= 1903.98){
           
       }
       if ( (salario >= 1903.99) && (salario <= 2826.65)){
           aliquotaIRRF = 0.075;
           deduzir = 142.80;
       }
       if ( (salario >= 2826.66) && (salario <= 3751.05)){
           aliquotaIRRF = 0.15;
           deduzir = 354.80;
       }
       if ( (salario >= 3751.06) && (salario <= 4664.68)){
           aliquotaIRRF = 0.225;
           deduzir = 636.13;
       }
       if (salario >= 4664.68){
           aliquotaIRRF = 0.275;
           deduzir = 869.36;
       }
       vlr_IRRF = ((salario * aliquotaIRRF) - deduzir);
    }
    
    public double getVlr_INSS(){
        return vlr_INSS;
    }
    
    public double getVlr_IRRF(){
        return vlr_IRRF;
    }
}
