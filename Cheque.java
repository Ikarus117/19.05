public class Cheque extends Pagamento{
   private String numeroDoCheque;
   
   public Cheque(String nomeDoPagador, String CPF, double valorASerPago){
      super(nomeDoPagador, CPF, valorASerPago);
   }
   
   public String getNumeroDoCheque(){
      return numeroDoCheque;
   }
   
   public void setNumeroDoCheque(String numeroDoCheque){
      numeroDoCheque = numeroDoCheque;
   }
   
   public String toString(){
      return "Cheque: "+numeroDoCheque+ "\n" + super.toString();
   }
}