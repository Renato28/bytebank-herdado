public class TesteSistema {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }
}
