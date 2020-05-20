public class Pagamento{

   private String nomeDoPagador;
   private String CPF;
   private double valorASerPago;
   
   public String getNomeDoPagador(){
      return nomeDoPagador;
   }
   
   public String getCPF(){
      return CPF;
   }
   
   public double getValorASerPago(){
      return valorASerPago;
   }
   
   public void setNomeDoPagador(String nomeDoPagador){
      this.nomeDoPagador = nomeDoPagador;
   }
   
   public void setCPF(String CPF){
      this.CPF = CPF;
   }
   
   public void setValorASerPago(double valorASerPago){
      this.valorASerPago = valorASerPago;
   }
   
   public Pagamento(String nomeDoPagador, String CPF, double valorASerPago){
   
   this.nomeDoPagador=nomeDoPagador;
   this.CPF=CPF;
   this.valorASerPago = valorASerPago;
   }
   public String getDados(){
      return "Nome: "+nomeDoPagador+ "\nCPF: " +CPF+ "\nValor: "+valorASerPago; 
   }   
}