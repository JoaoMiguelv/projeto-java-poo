import java.time.LocalDate;

import entidades.Cliente;
import entidades.Funcionario;
import entidades.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("111.444.777-35");
        Funcionario obj2 = new Funcionario("111.111.111-11");

        // CLIENTE
        obj1.setNome("João Miguel");
        obj1.setDataNascimento(LocalDate.of(2001, 02, 04));
        obj1.getDocumento().setCnh("123456789");
        obj1.getDocumento().setRg("10.258.452-9");

        obj1.getEndereco().setCep("14403-645");
        obj1.getEndereco().setBairro("Pinheiros");
        obj1.getEndereco().setCidade("Franca");
        obj1.getEndereco().setLogradouro("Rua 1");
        obj1.getEndereco().setNome("Casa");
        obj1.getEndereco().setNumero("123");
        obj1.getEndereco().setUf("SP");

        obj1.getContato().setCelular("16 99999-9999");
        obj1.getContato().setEmail("joaomiguelmv_04@hotmail.com");
        obj1.getContato().setFixo("11 3722-4596");

        obj1.setScoreCredito(898);

        System.out.println("-------------------CLIENTE-------------------");
        info(obj1);

        // FUNCIONARIO
        obj2.setNome("Carlos Eduardo");
        obj2.setDataNascimento(LocalDate.of(1999, 12, 25));
        obj2.getDocumento().setCnh("987654321");
        obj2.getDocumento().setRg("56.897.856-9");
        obj2.getEndereco().setCep("14403-798");
        obj2.getEndereco().setBairro("Pinheiros");
        obj2.getEndereco().setCidade("Franca");
        obj2.getEndereco().setLogradouro("Rua da Paz");
        obj2.getEndereco().setNome("Casa");
        obj2.getEndereco().setNumero("512");
        obj2.getEndereco().setUf("SP");
        obj2.getContato().setCelular("16 99875-2252");
        obj2.getContato().setEmail("caros@hotmail.com");
        obj2.getContato().setFixo("11 3746-2790");

        obj2.setSalario(6500.00);
        obj2.setMatricula("321654987");

        System.out.println("-------------------FUNCIONARIO-------------------");
        info(obj2);

    }

    public static void info(PessoaFisica pf) {
        System.out.println("{\"data\": " + pf.toString() + ", "
                + "\"success\": true, \"message\": \"Dados exibidos com sucesso!\"}");
    }
}
