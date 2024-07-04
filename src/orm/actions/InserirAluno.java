package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class InserirAluno {
    public static void main(String[] args) {
        // 1. Instanciar e preencher os dados do JavaBeans
        Aluno aluno = new Aluno();
        aluno.setNome("Simas Turbo");
        aluno.setEmail("simas@gmail.com");
        aluno.setCpf("129.456.789-00");
        aluno.setDataNascimento(java.time.LocalDate.of(1997, 5, 15));
        aluno.setNaturalidade("Rio de Janeiro");
        aluno.setEndereco("Rua das Flores, 123");
        
        // 2. Conectar ao operador do ORM/JPA
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        // 3. Executar a operação
        manager.getTransaction().begin();
        // O "C" do CRUD é dado pelo método "persist" do Hibernate
        manager.persist(aluno);
        manager.getTransaction().commit();
        
        System.out.println("Aluno inserido, ID: " + aluno.getId());
        
        manager.close();
        factory.close();
    }
}
