public class CartaoDeCredito extends Pagamento{
   private String numeroDoCartao;
   
   public CartaoDeCredito(String nomeDoPagador, String CPF, double valorASerPago){
   super(nomeDoPagador, CPF, valorASerPago);
   }
   
   public String getNumeroDoCartao(){
      return numeroDoCartao;
   }
   
   public void setNumeroDoCartao(String numeroDoCartao){
      this.numeroDoCartao = numeroDoCartao;
   }
   
   public String toString(){
      return "\nCartao de Credito: "+numeroDoCartao+ "\n " +super.toString();
   }
   
}