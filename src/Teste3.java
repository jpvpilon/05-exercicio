public class Teste3 {
    public static void main(String[] args) {

        BilheteUnico[] bilhete = new BilheteUnico[3];

        //primeiro bilhete
        Usuario u1 = new Usuario("A", 123,"P");
        bilhete[0] = new BilheteUnico(u1);

        //segundo bilhete
        bilhete[1] = new BilheteUnico(new Usuario("B", 456, "P"));

        //terceiro bilhete
        bilhete[2] = new BilheteUnico(new Usuario("C", 789, "tarifa"));

        for(BilheteUnico b : bilhete) {
            System.out.println(b.usuario.nome);

        }
    }
}
