public class TesteFuncionario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Gerente gerente = new Gerente();
        gerente.setNome("Renato Nobrega");
        gerente.setCpf("066;965.604.67");
        gerente.setSalario(2600.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());


    }
}
