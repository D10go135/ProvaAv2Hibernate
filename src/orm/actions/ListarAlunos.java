package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class ListarAlunos {
    public static void main(String[] args) {
        // Conectar ao operador do ORM/JPA
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        // Executar a operação
        String jpql = "SELECT a FROM Aluno a";
        Query query = manager.createQuery(jpql);
        
        // Mostrar o resultado
        List<Aluno> alunos = query.getResultList();
        
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Naturalidade: " + aluno.getNaturalidade());
                System.out.println("Endereço: " + aluno.getEndereco());
                System.out.println("--------------");
            }
        }
        
        manager.close();
        factory.close();
    }
}
