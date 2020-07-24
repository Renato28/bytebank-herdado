public class TesteGerente {

    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente gerente = new Gerente();
        gerente.setNome("Renato Nobrega");
        gerente.setCpf("066.965.604.67");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autentica(2222);

        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }
}
