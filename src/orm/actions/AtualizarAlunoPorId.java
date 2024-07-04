package orm.actions;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class AtualizarAlunoPorId {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setId(3L);  // Defina o ID do aluno que deseja atualizar
        aluno.setNome("Denis Silva");
        aluno.setEmail("denis.silva@example.com");
        aluno.setCpf("123.456.789-00");
        aluno.setDataNascimento(LocalDate.of(2000, 1, 1));
        aluno.setNaturalidade("São Paulo");
        aluno.setEndereco("Rua das Flores, 123");

        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        // Operar com "merge"
        manager.getTransaction().begin();
        manager.merge(aluno);
        manager.getTransaction().commit();

        System.out.println("Aluno atualizado!");

        manager.close();
        factory.close();
    }
}
