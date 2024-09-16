public class App {
    public static void main(String[] args) throws Exception {
            IPhone meuIphone = new IPhone();
                
                // Testar funcionalidades do ReprodutorMusical
                meuIphone.tocar();
                meuIphone.pausar();
                meuIphone.selecionarMusica("Minha Música Favorita");
                
                // Testar funcionalidades do AparelhoTelefonico
                meuIphone.ligar("123456789");
                meuIphone.atender();
                meuIphone.iniciarCorreioVoz();
                
                // Testar funcionalidades do NavegadorInternet
                meuIphone.exibirPagina("https://www.example.com");
                meuIphone.adicionarNovaAba();
                meuIphone.atualizarPagina();
            }
        }
        
   

