public class Boleto extends Pagamento{
   private String numeroDoBoleto;
   private int dia, mes, anoVenci;
   
   public Boleto(String nomeDoPagador, String CPF, double valorASerPago){
      super(nomeDoPagador, CPF, valorASerPago);
   }
   
   public String getNumeroDoBoleto(){
      return numeroDoBoleto;
   }
   
   public void setNumeroDoBoleto(String numeroDoBoleto){
      numeroDoBoleto = numeroDoBoleto;
   }
   
   public int getDia(){
      return dia;
   }
   
   public void setDia(int dia){
      dia = dia;
   }
   
   public int getMes(){
      return mes;
   }
   
   public void setMes(int mes){
      mes = mes;
   }
   
   public int getAnoVenci(){
      return anoVenci;
   }
   
   public void setAnoVenci(int anoVenci){
      anoVenci = anoVenci;
   }
   
   public String toString(){
      return "Boleto: " + numeroDoBoleto+ "\nVencimento: " +dia+ "/" +mes+ "/" +anoVenci +super.toString();
   }
}