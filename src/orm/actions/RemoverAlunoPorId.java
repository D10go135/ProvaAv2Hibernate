package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class RemoverAlunoPorId {
    public static void main(String[] args) {
        // 1. Conectar ao operador do ORM/JPA
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        // 2. Buscar o objeto a ser excluído
        Long alunoId = 4L;  // ID do aluno a ser removido
        Aluno aluno = manager.find(Aluno.class, alunoId);
        
        // 3. Operar com "remove"
        manager.getTransaction().begin();
        manager.remove(aluno);
        manager.getTransaction().commit();
        
        System.out.println("Aluno excluído com sucesso!");
        
        manager.close();
        factory.close();
    }
}
