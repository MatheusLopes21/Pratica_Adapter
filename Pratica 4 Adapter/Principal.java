/* Pratica 4 Adapter Method
    Dupla: Igor Carvalho Braz -- RA: 42021158
            Matheus Magalhães Alves Lopes -- RA: 4231922738*/ 

public class Principal {
    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(5);

        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo encaixa? " + buraco.encaixa(pinoRedondo)); // true

        PinoQuadrado pinoQuadrado = new PinoQuadrado(5);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado adaptado encaixa? " + buraco.encaixa(adaptador)); // true ou false dependendo da largura
    }
}
